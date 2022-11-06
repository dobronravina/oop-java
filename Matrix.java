import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Matrix {



    Scanner sc = new Scanner(System.in);
    int Row;
    int Col;


    int[][] matrix = new int[Row][Col];


    public void menu(int[][] matrix)
    {
       System.out.println("\n1. Копіювати матрицю\n2. Отримати елемент\n3. Отримати рядок\n4. Отримати стовпчик\n5. Розмірність матриці\n6. Порівняти матриці\n7. Отримати HashCode\n8. Додавання матриць\n9. Множення матриці на скаляр\n10. Замінити елемент\n ");

       int choise = sc.nextInt();

       if(choise == 1)
       {
          int[][] f =  copy_matrix(matrix);
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
       } else if (choise == 10)
       {
           matrix = setElem(matrix);
       }
    }




    public int[][] emptymatrix()
            //Пуста матриця
    {
        System.out.println("Введіть кількість рядків: ");
        Row = sc.nextInt();
        System.out.println("Введіть кількість стовпців: ");
        Col = sc.nextInt();
         matrix = new int[Row][Col];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = 0;
            }
        }
        for(int[] row: matrix){

            System.out.println(Arrays.toString(row));}
        return matrix;
    }


    public int[][] usermatrix()
    {
        System.out.println("Введіть кількість рядків: ");
        Row = sc.nextInt();
        System.out.println("Введіть кількість стовпців: ");
        Col = sc.nextInt();
         matrix = new int[Row][Col];
        System.out.println("Заповніть елементами по строках: ");

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int[] row: matrix){

            System.out.println(Arrays.toString(row));}
        return matrix;}


    public int[][] random_creating()
    {
        System.out.println("Введіть кількість рядків: ");
        Row = sc.nextInt();
        System.out.println("Введіть кількість стовпців: ");
        Col = sc.nextInt();
        matrix = new int[Row][Col];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*100);
            }
        }
        for(int[] row: matrix){

            System.out.println(Arrays.toString(row));}
        return matrix;
    }

    private void  get_element(int[][] matrix){
        System.out.println("Введіть номер елемента: ");
        int eli = sc.nextInt();
        int elj = sc.nextInt();
        if (eli > Row || elj > Col){
            System.out.println("Не існує елемента з таким номером");
        }
        System.out.println(matrix[eli][elj]);
    }

    private void  get_row(int[][] matrix){
        System.out.println("Введіть номер рядка: ");
        int row = sc.nextInt();
        for (int j = 0; j < Col; j++)
        {
            System.out.print(matrix[row][j]+ " ");
        }

    }
    private void  get_cal(int[][] matrix){
        System.out.println("Введіть номер стовпчика: ");
        int cal = sc.nextInt();
        for (int i = 0; i < Row; i++)
        {
            System.out.println(matrix[i][cal]);
        }

    }
    private void get_size()
    {
        System.out.println("Розмірність матриці: "+ Row + "x" + Col);
    }

    private void equalmatrix(int[][] matrix){
            int[][] newmatrix = new int[Row][Col] ;

        System.out.println("\n\n1 - заповнити з клавіатури\n2 - заповнити рандомними числами");
        int choise = sc.nextInt();

        if (choise == 1)
        {
            System.out.println("Введіть кількість рядків:");
            int n1 = sc.nextInt();
            System.out.println("Введіть кількість стовпців:");
            int n2 = sc.nextInt();
            newmatrix = new int[n1][n2];
            System.out.println("Заповніть елементами по строках: ");
            for(int i=0; i<n1; i++){
                for(int j=0; j<n2;j++) {
                    newmatrix[i][j] = sc.nextInt();
            }
        }

            System.out.println("Введена матриця: ");

            for(int[] row: newmatrix){

                System.out.println(Arrays.toString(row));}
        }
        else if (choise == 2)
        {
            System.out.println("Введіть кількість рядків:");
            int n1 = sc.nextInt();
            System.out.println("Введіть кількість стовпців:");
            int n2 = sc.nextInt();
            newmatrix = new int[n1][n2];
            for(int i=0; i<n1; i++){
                for(int j=0; j<n2;j++) {
                    newmatrix[i][j] = (int)(Math.random()*100 );
                }
            }

            System.out.println("Введена матриця: ");

            for(int[] row: newmatrix){

                System.out.println(Arrays.toString(row));}
        }
        else {
            System.out.println("Немає такого номера у списку");
        }


        if (Arrays.deepEquals(matrix, newmatrix) == true)
        {
            System.out.println("Матриці однакові");
        }
        else {
            System.out.println("Матриці різні");
        }

    }

    private void gethash(int[][] matrix)
    {
        System.out.println("HashCode матриці: "+matrix.hashCode());
    }

    private int[][] copy_matrix(int[][] matrix)
    {
        int[][] copied = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copied[i] = matrix[i].clone();
        }


        for(int[] row: copied){

            System.out.println(Arrays.toString(row));}
        return copied;
    }

    private void summatrix(int[][] matrix)
    {

        System.out.println("\n\n1 - заповнити з клавіатури\n2 - заповнити рандомними числами");
        int choise = sc.nextInt();
        System.out.println("Введіть кількість рядків:");
        int n1 = sc.nextInt();
        System.out.println("Введіть кількість стовпців:");
        int n2 = sc.nextInt();
        int[][] matrix2 = new int[n1][n2];


        if (choise == 1)
        { System.out.println("Заповніть елементами по строках: ");

            for(int i = 0; i < matrix2.length; i++){
                for(int j = 0; j < matrix2[i].length; j++){
                    matrix2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Введена матриця: ");
            for(int[] row: matrix2){

                System.out.println(Arrays.toString(row));}

        }
        else if (choise == 2)
        {
            for(int i = 0; i < matrix2.length; i++){
                for(int j = 0; j < matrix2[i].length; j++){
                    matrix2[i][j] = (int)(Math.random()*100);
                }
            }
            System.out.println("Згенерована матриця: ");
            for(int[] row: matrix2){

                System.out.println(Arrays.toString(row));
            }
        }
        else {
            System.out.println("Немає такого номера у списку");
        }



        int[][] summatrix = new int[Row][Col];


        if(Row == n1 && Col == n2)
        {
            for(int i = 0; i < summatrix.length; i++){
                for(int j = 0; j < summatrix[i].length; j++){
                    summatrix[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Результат додавання: ");

            for(int[] row: summatrix){

                System.out.println(Arrays.toString(row));}

        }

    }

    private void scalar(int[][] matrix)
    {
        System.out.println("Введіть число на яке потрібно помножити: ");
        int scal = sc.nextInt();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = matrix[i][j]*scal;
            }
        }
        for(int[] row: matrix){

            System.out.println(Arrays.toString(row));}
    }



    public static int[][] stovpchyk()
    {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введіть кількість рядків: ");
        int ryadky = cs.nextInt();
        int[][] stovpchyk = new int[ryadky][1];
        for (int i = 0; i < stovpchyk.length; i++){
            stovpchyk[i][0] = (int)(Math.random()*100 );
                System.out.println(stovpchyk[i][0]);}
        return stovpchyk;
        }

   public int[][] setElem(int[][] matrix) {
        int row = sc.nextInt();
        int col = sc.nextInt();
        int elem = sc.nextInt();
        matrix[row][col] = elem;

       for(int[] row1: matrix){

           System.out.println(Arrays.toString(row1));}
        return matrix;

    }

    }

