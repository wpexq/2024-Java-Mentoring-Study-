package Week5;

import java.util.Arrays;

// for문
/* public class ExampleFor {
    public static main void(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < 10; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

// while문
public class ExampleFor {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        int i = 0;

        while (i < 10) {
            System.out.print(array[i] + " ");
            i++;
        }
    }
}

// for-each문 : 집합 객체에서 원소들을 하나씩 꺼내 반복
public class ExampleFor {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        for (int k: array) { // 자료형 변수명: 집합 객체
            System.out.println(k);
        }
    }
} */

// toString 메서드 사용
public class ExampleFor {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(array));
    }
}