package exercises;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/13
 * @ClassName :for循环求和
 */

public class ForTestPrimary {
    public static void main(String[] args) {
        int sum1 = 0;
          int sum2 = 0;
        int MAX = 100;
        //求100以内所有数的和
        for (int i = 0; i <= MAX; i++) {
            sum1 += i;
        }
        System.out.println("100以内所有数的和= "+sum1);

        System.out.println("-----------------");
        
        //求100以内所有奇数和
        for (int j = 0; j <= MAX; j++) {
            if (j % 2 == 1) {
                sum2 += j;
            }
        }
        System.out.println("100以内所有奇数和= "+sum2);
    }
}
