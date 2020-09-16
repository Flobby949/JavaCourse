package teaching;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/15
 * @ClassName :Switch
 */

public class SwitchChoose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文字");
        String a = scanner.next();
        switch (a){
            case "加":{
                System.out.println("this is 加法");
                break;
            }
            case "2":{
                System.out.println("this is 2");
                break;
            }
            case "df":{
                System.out.println("this is 3");
                break;
            }
            case "4":{
                System.out.println("this is 4");
                break;
            }
            default:{
                System.out.println("wrong!");
                break;
            }
        }
    }
}
