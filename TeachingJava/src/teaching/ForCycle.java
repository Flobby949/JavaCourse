package teaching;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/13
 * @ClassName :for循环
 */

public class ForCycle {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("-----------");

        System.out.println("\nway one:");
        int[] array = {10,20,30,40,50};
        for (int a = 0;a < array.length; a++){
            System.out.println(array[a]);
        }

        System.out.println("\nway two:");
        for (int b : array){
            System.out.println(b);
        }
    }
}
