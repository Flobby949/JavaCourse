package exercises;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/13
 * @ClassName :综合实现计算器
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("请选择计算类型");
            System.out.println("\t1.加法");
            System.out.println("\t2.减法");
            System.out.println("\t3.乘法");
            System.out.println("\t4.除法");
            int choose = scanner.nextInt();

            switch(choose) {
                case 1: {
                    System.out.println("请输入第一项加数");
                    int first = scanner.nextInt();
                    System.out.println("请输入第二项加数");
                    int second = scanner.nextInt();
                    int result = first + second;
                    System.out.println("\t"+first+" + "+second+" = "+ result);
                    System.out.println("---------------");
                    System.out.println("请选择是否继续运算");
                    System.out.println("\t1.是");
                    System.out.println("\t2.否");
                    int YorN = scanner.nextInt();
                    if (YorN != 1) {
                        flag = false;
                    }
                    break;
                }
                case 2: {
                    System.out.println("请输入被减数");
                    int first = scanner.nextInt();
                    System.out.println("请输入减数");
                    int second = scanner.nextInt();
                    int result = first - second;
                    System.out.println("\t"+first+" - "+second+" = "+ result);
                    System.out.println("----------------");
                    System.out.println("请选择是否继续运算");
                    System.out.println("\t1.是");
                    System.out.println("\t2.否");
                    int YorN = scanner.nextInt();
                    if (YorN != 1) {
                        flag = false;
                    }
                    break;
                }
                case 3: {
                    System.out.println("请输入第一项乘数");
                    int first = scanner.nextInt();
                    System.out.println("请输入第二项乘数");
                    int second = scanner.nextInt();
                    int result = first * second;
                    System.out.println("\t"+first+" * "+second+" = "+ result);
                    System.out.println("-----------------");
                    System.out.println("请选择是否继续运算");
                    System.out.println("\t1.是");
                    System.out.println("\t2.否");
                    int YorN = scanner.nextInt();
                    if (YorN != 1) {
                        flag = false;
                    }
                    break;
                }
                case 4: {
                    System.out.println("请输入被除数");
                    double first = scanner.nextDouble();
                    System.out.println("请输入除数");
                    double second = scanner.nextDouble();
                    double result = first / second;
                    System.out.println("\t"+first+" / "+second+" = "+ result);
                    System.out.println("------------------");
                    System.out.println("请选择是否继续运算");
                    System.out.println("\t1.是");
                    System.out.println("\t2.否");
                    int YorN = scanner.nextInt();
                    if (YorN != 1) {
                        flag = false;
                    }
                    break;
                }
                default: {
                    System.out.println("数字选择错误,请重新选择.\n");
                }
            }
        }while (flag);
    }
}
