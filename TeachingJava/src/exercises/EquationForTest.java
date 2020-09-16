package exercises;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/7/24
 * @ClassName :for循环解方程
 */

public class EquationForTest {
    public static void main(String[] args) {
        int rabbit = 1;
        int chicken = 35 - rabbit;
        for (; rabbit < 35; rabbit++,chicken = 35 -rabbit) {
            if (chicken * 2 + rabbit * 4 == 94 && rabbit + chicken == 35) {
                System.out.println(chicken);
                System.out.println(rabbit);
            }
        }
    }
}
