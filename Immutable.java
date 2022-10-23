import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Immutable
 {



    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;

   final List<ArrayList<Integer>> matrix = new ArrayList();



    public void menu(List <ArrayList<Integer>> matrix)
    {
        System.out.println("\n1. Копіювати матрицю\n2.Отримати елемент\n3. Отримати рядок\n4. Отримати стовпчик\n5. Розмірність матриці\n6. Порівняти матриці\n7. Отримати HashCode\n8. Додавання матриць\n9. Множення матриці на скаляр\n\n ");

        int choise = sc.nextInt();
        if(choise == 1)
        {
            List <ArrayList<Integer>> cop = copy_matrix(matrix);
        }
        else if (choise == 2)
        {
            get_element(matrix);
        }
        else if (choise == 3)
        {
            get_row(matrix);
        }
        else if (choise == 4)
        {
            get_cal(matrix);
        }
        else if ( choise == 5) {
            get_size();
        }
        else if (choise == 6)
        {
            equalmatrix(matrix);
        }
        else if (choise == 7)
        {
            gethash(matrix);
        }
        else if (choise == 8)
        {
            summatrix(matrix);
        }
        else if (choise == 9)
        {
            scalar(matrix);
        }
    }




    public List <ArrayList<Integer>> emptymatrix()
    //Пуста матриця
    {
        System.out.println("Введіть кількість рядків:");
        num1 = sc.nextInt();
        System.out.println("Введіть кількість стовпців:");
        num2 = sc.nextInt();
        for(int i = 0; i < num1; i++){
            ArrayList<Integer> matrixi = new ArrayList<>();
            for(int j = 0; j < num2; j++) {
                matrixi.add(null);}
            matrix.add(matrixi);
        }
        return matrix;
    }


    public List <ArrayList<Integer>>  creating_by_user()
    {
        System.out.println("Введіть кількість рядків:");
        num1 = sc.nextInt();
        System.out.println("Введіть кількість стовпців:");
        num2 = sc.nextInt();
        System.out.println("Заповніть елементами по строках: ");
        for(int i = 0; i < num1; i++){
            ArrayList<Integer> matrixi = new ArrayList<>();
            for(int j = 0; j < num2; j++) {
                int num = sc.nextInt();
                matrixi.add(num);}
            matrix.add(matrixi);
        }
        System.out.println(matrix);
        return matrix;
    }

    public List <ArrayList<Integer>> random_creating()
    {
        System.out.println("Введіть кількість рядків:");
        num1 = sc.nextInt();
        System.out.println("Введіть кількість стовпців:");
        num2 = sc.nextInt();
        for(int i = 0; i < num1; i++){
            ArrayList<Integer> matrixi = new ArrayList<>();
            for(int j = 0; j < num2; j++) {
                int num = (int)(Math.random()*100 );
                matrixi.add(num);}
            matrix.add(matrixi);
        }
        System.out.println(matrix);
        return matrix;
    }

    private void  get_element(List <ArrayList<Integer>> matrix){
        System.out.println("Введіть номер елемента: ");
        int eli = sc.nextInt();
        int elj = sc.nextInt();
        if (eli > num1 || elj > num2){
            System.out.println("Не існує елемента з таким номером");
        }
        System.out.println(matrix.get(eli).get(elj));
    }

    private void  get_row(List <ArrayList<Integer>> matrix){
        System.out.println("Введіть номер рядка: ");
        int row = sc.nextInt();
        for (int j = 0; j < num2; j++)
        {
            System.out.print(matrix.get(row).get(j)+ " ");
        }

    }
    private void  get_cal(List <ArrayList<Integer>> matrix){
        System.out.println("Введіть номер рядка: ");
        int cal = sc.nextInt();
        for (int i = 0; i < num1; i++)
        {
            System.out.println(matrix.get(i).get(cal));
        }

    }
    private void get_size()
    {
        System.out.println("Розмірність матриці: "+ num1 + "x" + num2);
    }

    private void equalmatrix(List <ArrayList<Integer>> matrix){
        List <ArrayList<Integer>> newmatrix = new ArrayList<>();

        System.out.println("\n\n1 - заповнити з клавіатури\n2 - заповнити рандомними числами");
        int choise = sc.nextInt();

        if (choise == 1)
        {
            System.out.println("Введіть кількість рядків:");
            int n1 = sc.nextInt();
            System.out.println("Введіть кількість стовпців:");
            int n2 = sc.nextInt();
            System.out.println("Заповніть елементами по строках: ");
            for(int i = 0; i < n1; i++){
                ArrayList<Integer> matrixit = new ArrayList<>();
                for(int j = 0; j < n2; j++) {
                    int num = sc.nextInt();
                    matrixit.add(num);}
                newmatrix.add(matrixit);
            }
        }
        else if (choise == 2)
        {
            System.out.println("Введіть кількість рядків:");
            int n1 = sc.nextInt();
            System.out.println("Введіть кількість стовпців:");
            int n2 = sc.nextInt();
            for(int i = 0; i < n1; i++){
                ArrayList<Integer> matrixit = new ArrayList<>();
                for(int j = 0; j < n2; j++) {
                    int num = (int)(Math.random()*100 );
                    matrixit.add(num);}
                newmatrix.add(matrixit);
            }
        }
        else {
            System.out.println("Немає такого номера у списку");
        }

        if (matrix.equals(newmatrix) == true)
        {
            System.out.println("Матриці однакові");
        }
        else {
            System.out.println("Матриці різні");
        }

    }

    private void gethash(List <ArrayList<Integer>> matrix)
    {
        System.out.println("HashCode матриці: "+matrix.hashCode());
    }

    private List <ArrayList<Integer>> copy_matrix(List <ArrayList<Integer>> matrix)
    {
        List <ArrayList<Integer>> copied = new ArrayList<>(matrix);
        System.out.println(copied);
        return copied;
    }

    private void summatrix(List <ArrayList<Integer>> matrix)
    {
        List <ArrayList<Integer>> matrix2 = new ArrayList<>();

        System.out.println("\n\n1 - заповнити з клавіатури\n2 - заповнити рандомними числами");
        int choise = sc.nextInt();
        System.out.println("Введіть кількість рядків:");
        int n1 = sc.nextInt();
        System.out.println("Введіть кількість стовпців:");
        int n2 = sc.nextInt();

        if (choise == 1)
        {
            System.out.println("Заповніть елементами по строках: ");
            for(int i = 0; i < n1; i++){
                ArrayList<Integer> matrixit = new ArrayList<>();
                for(int j = 0; j < n2; j++) {
                    int num = sc.nextInt();
                    matrixit.add(num);}
                matrix2.add(matrixit);
                System.out.println("Введена матриця: "+matrix2);
            }
        }
        else if (choise == 2)
        {

            for(int i = 0; i < n1; i++){
                ArrayList<Integer> matrixit = new ArrayList<>();
                for(int j = 0; j < n2; j++) {
                    int num = (int)(Math.random()*100 );
                    matrixit.add(num);}
                matrix2.add(matrixit);
                System.out.println("Згенерована матриця: "+matrix2);
            }
        }
        else {
            System.out.println("Немає такого номера у списку");
        }

        List<ArrayList<Integer>> summatrix = new ArrayList<>();

        if(num1 == n1 && num2 == n2)
        {
            for(int i = 0; i < num1; i++)
            {
                ArrayList<Integer> matrixcal = new ArrayList<>();
                for(int j = 0; j < num1; j++){
                    matrixcal.add(matrix.get(i).get(j)+matrix2.get(i).get(j));
                }
                summatrix.add(matrixcal);
            }
            System.out.println("Результат додавання: "+summatrix);

        }

    }

    private void scalar(List <ArrayList<Integer>> matrix)
    {
        System.out.println();
        int scal = sc.nextInt();
        List<ArrayList<Integer>> edmatrix = new ArrayList();
        for(int i = 0; i < num1; i++){
            ArrayList<Integer> matrixi = new ArrayList<>();
            for(int j = 0; j < num2; j++) {
                matrixi.add(matrix.get(i).get(j)*scal);}
            edmatrix.add(matrixi);
        }
        System.out.println(edmatrix);
    }


    public List <ArrayList<Integer>> stovpchyk()
    {
        System.out.println("Введіть кількість рядків: ");
        int ryadky = sc.nextInt();
        List<ArrayList<Integer>> stovpchyk = new ArrayList();
        for (int i = 0; i < ryadky; i++){
            ArrayList<Integer> matrixi = new ArrayList<>();
            for (int j = 0; j < 1; j++){
                int num = (int)(Math.random()*100 );
                matrixi.add(num);}
            stovpchyk.add(matrixi);
        }
        System.out.println(stovpchyk);
        return stovpchyk;
    }


}
