import java.util.Scanner;

/**
 * Created by vitaliy on 27.02.16.
 */
public class Main {
    public static void main(String[] args) {
        int size;
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Please type array length");
            size=sc.nextInt();
        }
        int reallength = size++;
        int[][] matrix = new int[reallength][reallength];
        for (int i = 1; i < reallength; i++) {

            for (int j = 1; j < reallength; j++) {
                if (i == j | j==reallength-i  ) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        // выводим строки
        for (int i = 1; i < reallength; i++) {
            // выводим колонки
            for (int j = 1; j < reallength; j++) {
               System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

