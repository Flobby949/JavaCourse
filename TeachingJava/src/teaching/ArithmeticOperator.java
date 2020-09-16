package teaching;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/15
 * @ClassName :算术运算符
 */

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 100;
        int b = 3;
        int c = a + b;
        int d = a % b;

        System.out.println("请输入数字");
        int f = input.nextInt();

        System.out.println("f = "+f);
        System.out.println(a);
        System.out.println("你好");
        System.out.println("a + b = "+c);
        System.out.println(d);
    }
}
