package exercises;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/28
 * @ClassName :综合训练
 */

public class Comprehensive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择");
        System.out.println("1.do···while循环");
        System.out.println("2.for循环");
        int a = scanner.nextInt();
        System.out.println("\ta = " + a);
        switch (a) {
            case 1: {
                int b = 0;
                do {
                    System.out.println("b = " + b);
                    b++;
                } while (b < 5);
                break;
            }
            case 2: {

                for (int c = 0; c < 4; c++) {
                    System.out.println(c);
                }
                break;
            }
            default: {
                if (a <= 10) {
                    System.out.println("输入错误");
                } else {
                    System.out.println("请重新输入");
                }
                break;
            }
        }

    }
}
