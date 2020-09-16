package teaching;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/12
 * @ClassName :while循环
 */

public class WhileCycle {
    public static void main(String[] args) {

        boolean choose = true;
        while (choose){
            System.out.println("this is true");
            break;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int a = scanner.nextInt();
        while (a==0){
            System.out.println("");
            break;
        }
    }
}
