package repository;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class IntegralRepository {

    JSONObject jo = new JSONObject();
    public void saveIntegral(double a,double b,double D,String functionAsString,double result ) {
         double[] limits = new double[2];
         limits[0] = a;
         limits[1] = b;

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Українська\n2. English");
        int chois = sc.nextInt();
        if(chois == 1){
            jo.put("Функція", functionAsString);
            jo.put("Межі інтегрування", limits);
            jo.put("Крок", D);
            jo.put("Результат",result);

        }
        else {
            jo.put("Function", functionAsString);
            jo.put("Limits of integration", limits);
            jo.put("Interval", D);
            jo.put("Result",result);
        }

        try{
            FileWriter file = new FileWriter("Integral.json");
            file.write(jo.toString());
            file.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public JSONObject getIntegralFromFile() {
        return jo;
    }
}