public class BoxDemoApp {
    public static void main(String[] args) {
        Box intBox = new Box(123);
        Box intBox2 = new Box(321);
        System.out.println((int) intBox.getValue() + (int) intBox2.getValue());

        intBox.setValue(222);
        intBox.setValue("abc"); // this should not be allowed
        // the following code will compile, but will throw runtime exception
        System.out.println((int) intBox.getValue() + (int) intBox2.getValue());
    }
}
