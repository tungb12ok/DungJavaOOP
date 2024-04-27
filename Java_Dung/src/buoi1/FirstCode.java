// thuoc folder nao/ Package nào 
package buoi1;

import java.util.Scanner;

public class FirstCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 1, 2, 4, 3, 8, 10, 12};
        int[][] arrP = new int[3][4];

        Scanner sc = new Scanner(System.in);
        // for input
        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "]: ");
                arrP[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        // for: ouput
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arrP[0][j] + " ");
            }
            System.out.println("");
        }

//        int sumEven = 0;
//        int sumOdd = 0;
//        // cai diden kien nen de arr.length k nen de thanh 1 con so 
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("i = " + i);
//            for (int j = 0; j < 10; j++) {
//                System.out.print(" j = " + j);
//            }
//            System.out.println("-------------------------");
//        }
//        System.out.println("SUM even: " + sumEven);
//        System.out.println("SUM odd: " + sumOdd);
    }
}
