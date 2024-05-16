package Week3.Scanner;

import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = scanner.next();

        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();

        System.out.println(name + " " +  age);

        scanner.close();
    }
}
