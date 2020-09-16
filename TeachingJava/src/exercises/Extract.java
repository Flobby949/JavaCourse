package exercises;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/16
 * @ClassName :提取信息
 */

public class Extract {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入身份证：");
        String id=scan.next();
        String birth=id.substring(6,14);
        System.out.println(birth);
    }
}
