package teaching;

import java.util.Scanner;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/13
 * @ClassName :一维数组
 */

public class ArrayPrimary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = {1,2,3,4,5};
        System.out.println(" "+array1[0]);
        System.out.println(" "+array1[1]);
        System.out.println(" "+array1[4]);

        System.out.println("---------------");
        int[] array2 = new int[7];
        array2[0] = 21;
        array2[1] = 22;
        array2[2] = 23;
        array2[3] = 24;
        array2[4] = 25;
        array2[5] = 26;
        array2[6] = 27;
        System.out.println(" "+array2[0]);

        System.out.println("---------------");
        System.out.println("请输入数组三的长度");
        int x = scanner.nextInt();
        int[] array3 = new int[x];
        System.out.println(" "+array3[0]);
    }
}
