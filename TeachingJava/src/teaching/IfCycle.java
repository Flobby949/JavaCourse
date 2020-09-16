package teaching;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/12
 * @ClassName :if循环
 */

public class IfCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字a");
        int a = scanner.nextInt();
        if (a == 8){
            System.out.println("a = 8");
        }else{
            System.out.println("a   wrong");
        }

        System.out.println("请输入数字b");
        int b = scanner.nextInt();
        if ((b<50||b>=100)&&b!=110){
            System.out.println("(b<50或b>=100)且b!=110");
        }else{
            System.out.println("b   wrong");
        }

        System.out.println("请输入字符");
        String c = scanner.next();
        if (c.equals("c")){
            System.out.println("c = 'c'");
        }else{
            System.out.println("c   wrong");
        }
    }
}
