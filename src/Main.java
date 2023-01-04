import module.Integral;
import repository.IntegralRepository;
import service.IntegralService;

import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a = getDouble("Введіть a: ");
        double b = getDouble("Введіть b: ");
        double D = getDouble("Введіть D: ");

        System.out.println("Введіть функцію: ");
        String function= scanner.nextLine();

        IntegralService integralService = new IntegralService();
        Integral integral = integralService.generateIntegral(a, b, D, function);

        IntegralRepository rep = new IntegralRepository();
        rep.saveIntegral(integral);



        Integral fileRes = rep.getLastIntegral();
        //System.out.println(fileRes.getResult());
        System.out.println("1.Українська\n2.English");
        int choise = scanner.nextInt();
        if(choise ==1){
            System.out.println("Функція:" + function + " межі інтегрування: [" + a + ", " + b + "] крок: "+ D +" результат: "+ fileRes.getResult());
        }
        else {
            System.out.println("Function:" + function + " integral limits: [" + a + ", " + b + "] interval: "+ D +" result: "+ fileRes.getResult());
        }


    }

    private static double getDouble(String massage) {
        System.out.println(massage);
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }
}