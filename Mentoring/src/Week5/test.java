package Week5;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        /* int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i;
            System.out.print(array[i]);
        }*/

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 35) {
                System.out.println(a[i]);
            }
        }

    }
}

