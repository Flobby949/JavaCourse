package exercises;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/12
 * @ClassName :switch简易计算器
 */

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择计算类型");
        System.out.println("\t1.加法");
        System.out.println("\t2.减法");
        System.out.println("\t3.乘法");
        System.out.println("\t4.除法");
        int choose = scanner.nextInt();

        switch(choose){
            case 1:{
                System.out.println("请输入第一项");
                int first = scanner.nextInt();
                System.out.println("请输入第二项");
                int second = scanner.nextInt();
                int result = first + second;
                System.out.println("和："+result);
                break;
            }
            case 2:{
                System.out.println("请输入被减数");
                int first = scanner.nextInt();
                System.out.println("请输入减数");
                int second = scanner.nextInt();
                int result = first - second;
                System.out.println("差："+result);
                break;
            }
            case 3:{
                System.out.println("请输入第一项");
                int first = scanner.nextInt();
                System.out.println("请输入第二项");
                int second = scanner.nextInt();
                int result = first * second;
                System.out.println("积："+result);
                break;
            }
            case 4:{
                System.out.println("请输入被除数");
                double first = scanner.nextDouble();
                System.out.println("请输入除数");
                double second = scanner.nextDouble();
                double result = first / second;
                System.out.println("商："+result);
                break;
            }
            default:{
                System.out.println("数字选择错误");
            }
        }
    }
}
