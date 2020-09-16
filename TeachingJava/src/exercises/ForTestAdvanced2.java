package exercises;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/13
 * @ClassName :for循环，二维数组实现杨辉三角
 */

public class ForTestAdvanced2 {
    public static void main(String[] args) {
        int[][] a = new int[7][7];
        for (int i=0;i<a.length; i++){
            for (int j=0;j<=i;j++){
                if(j==0 || i==j) {
                    a[i][j]=1;
                }else {
                    a[i][j]=a[i-1][j]+a[i-1][j-1]; 
                }
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
