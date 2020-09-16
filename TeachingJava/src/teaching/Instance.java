package teaching;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/8/2
 * @ClassName :实例，方法
 */
public class Instance {
        String name;
        int length;
        int width;
        int area;

        public void rectangleArea() {
            area = length * width;
        }

        public void printMessages() {
            System.out.println(name + "的面积为" + area + "平方厘米");
        }

        public static void main(String[] args) {

            Instance rectangleOne = new Instance();
            rectangleOne.name = "长方形1";
            rectangleOne.length = 10;
            rectangleOne.width = 5;
            rectangleOne.rectangleArea();
            rectangleOne.printMessages();

            Instance rectangleTwo = new Instance();
            rectangleTwo.name = "长方形2";
            rectangleTwo.length = 15;
            rectangleTwo.width = 3;
            rectangleTwo.rectangleArea();
            rectangleTwo.printMessages();

        }
}
