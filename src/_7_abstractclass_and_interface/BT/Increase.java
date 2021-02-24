package _7_abstractclass_and_interface.BT;

public class Increase {
        public static void main(String[] args) {
            Shape[]shapes=new Shape[3];
            shapes[0]=new Circle("red",true,2.0);
            shapes[1]=new Rectangle("blue",true,3.0,5.0);
            shapes[2]=new Square("red",true,2.0);

            System.out.println("Area Circle =" + shapes[0]);
            System.out.println("Area Rectangle =" + shapes[1]);
            System.out.println("Area Square =" + shapes[2]);
    }
}
