package teaching;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/13
 * @ClassName :do  while 循环
 */

public class DoWhileCycle {
    public static void main(String[] args) {

        int x1 = 10;
        do{
            System.out.println("\n循环一 , x = " + x1 );
            x1++;
        }while( x1 < 10 );

        int x2 = 10;
        do{
            System.out.println("\n\t循环二 , x = " + x2 );
            x2++;
        }while( x2 <= 10 );

        int x3 = 10;
        do{
            System.out.println("\n\t\t循环三 , x = " + x3 );
            x3++;
        }while( x3 <= 15 );
    }
}
