import module.Integral;
import org.json.JSONObject;
import repository.IntegralRepository;
import service.IntegralService;
import service.IntegralSolver;

import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a = getDouble("Enter a: ");
        double b = getDouble("Enter b: ");
        double D = getDouble("Enter D: ");

        System.out.println("Enter function");
        String functionAsString = scanner.nextLine();

        IntegralService integralService = new IntegralService();
        Integral integral = integralService.generateIntegral(a, b, D, functionAsString);
        //System.out.println(integral);

        IntegralSolver res = new IntegralSolver(a,b,D,functionAsString);
        double result = res.calculateResult();

        IntegralRepository rep = new IntegralRepository();
        rep.saveIntegral(a,b,D,functionAsString,result);
        JSONObject fileRes = rep.getIntegralFromFile();
        System.out.println(fileRes);
    }

    private static double getDouble(String massage) {
        System.out.println(massage);
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }
}