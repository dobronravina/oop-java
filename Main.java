import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Matrix user_matrix = new Matrix();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Числа для матриці вводяться з клавіатури\n2. Числа генеруються рандомно\n3. Пуста матриця\n4. Матриця стовпчик");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                List<ArrayList<Integer>> a = user_matrix.creating_by_user();
                user_matrix.menu(a);

                break;
            case 2:
                List<ArrayList<Integer>> b = user_matrix.random_creating();
                user_matrix.menu(b);
                break;
            case 3:
                List<ArrayList<Integer>> c = user_matrix.emptymatrix();
                user_matrix.menu(c);
                break;
            case 4:
                List<ArrayList<Integer>> d = user_matrix.stovpchyk();
                user_matrix.menu(d);
        }

    }
}