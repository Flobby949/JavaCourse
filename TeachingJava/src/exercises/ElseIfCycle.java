package exercises;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/21
 * @ClassName :else if 循环
 */

public class ElseIfCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = 0;
        int two = 0;
        int illegal = 0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            System.out.println("请给第 "+(i+1)+" 个数赋值");
            arr[i] = scanner.nextInt();
            if (arr[i] == 1){
                one += 1;
            }else if(arr[i] == 2){
                two += 1;
            }else {
                illegal += 1;
            }
        }
        System.out.println("合法数字1有"+one+"个");
        System.out.println("合法数字2有"+two+"个");
        System.out.println("非法数字有"+illegal+"个");
    }
}
