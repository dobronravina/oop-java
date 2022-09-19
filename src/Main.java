import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть рядок: ");

        Scanner sc= new Scanner(System.in);
        String numbers = sc.nextLine();

        StringCalculator calculator = new StringCalculator();

        try{
            int result = calculator.add(numbers);
            System.out.println("Сума = "+result);
        }
        catch (Exception e){
            System.out.println("Не числа рахувати складно...))");
        }

    }
}
