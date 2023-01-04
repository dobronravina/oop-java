package repository;

import module.Integral;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class IntegralRepository {

    private final String JSONFileName = "Integral.json";
    public void saveIntegral(Integral integral) {
        JSONObject newJsonIntegral = new JSONObject(integral);
        JSONArray savedJsonIntegrals = getSavedJsonIntegrals();
        savedJsonIntegrals.put(newJsonIntegral);

        writeJsonFile(savedJsonIntegrals);
    }

    private void writeJsonFile(JSONArray jsonIntegrals) {
        try (FileWriter file = new FileWriter(JSONFileName)) {
            file.write(jsonIntegrals.toString());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Integral getLastIntegral() {
        List<Integral> allIntegrals = getSavedIntegrals();
        return allIntegrals.get(allIntegrals.size() - 1);
    }

    private List<Integral> getSavedIntegrals() {
        List<Integral> integrals = new ArrayList<>();

        JSONArray jsonIntegrals = getSavedJsonIntegrals();
        for (Object object : jsonIntegrals) {
            Integral integral = jsonToIntegral((JSONObject) object);
            integrals.add(integral);
        }

        return integrals;
    }

    private JSONArray getSavedJsonIntegrals() {
        try {
            String content = new String(Files.readAllBytes(Paths.get(JSONFileName)));
            return new JSONArray(content);
        } catch (NoSuchFileException e) {
            return new JSONArray();
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }

    private Integral jsonToIntegral(JSONObject jsonIntegral) {
        double a = jsonIntegral.getDouble("a");
        double b = jsonIntegral.getDouble("b");
        double D = jsonIntegral.getDouble("d");
        String function = jsonIntegral.getString("function");
        double result = jsonIntegral.getDouble("result");

        return new Integral(a, b, D, function, result);
    }
}