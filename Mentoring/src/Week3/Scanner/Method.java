package Week3.Scanner;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //기본타입
        byte a = sc.nextByte();       // byte 입력
        short b = sc.nextShort();     // short 입력
        int c = sc.nextInt();         // int 입력
        long d = sc.nextLong();       // long 입력

        //실수타입
        float e = sc.nextFloat();     // float 입력
        double f = sc.nextDouble();   // double 입력

        //논리타입
        boolean g = sc.nextBoolean();  // boolean 입력 true false

        String h = sc.next();
        String i = sc.nextLine();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
