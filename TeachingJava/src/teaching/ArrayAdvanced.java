package teaching;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/13
 * @ClassName :二维数组
 */

public class ArrayAdvanced {
    public static void main(String[] args) {

        int[][] a = new int[2][2];
        a[0][0] = 5;
        a[0][1] = 10;
        a[1][0] = 15;
        a[1][1] = 20;
        for (int[] i : a){
            for (int j : i){
                System.out.print(j+"\t");
            }
            System.out.println("");
        }

        System.out.println("----------------");
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] i : b){
            for (int j : i){
                System.out.print(j+"\t");
            }
            System.out.println("");
        }
    }
}
