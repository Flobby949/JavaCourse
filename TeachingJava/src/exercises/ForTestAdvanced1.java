package exercises;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/13
 * @ClassName :for循环实现九九乘法表
 */

public class ForTestAdvanced1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i ; j++){
                int s = i * j;
                System.out.print(i+"*"+j+"="+s+"\t");
            }
            System.out.println("");
        }
    }
}
