package _15_debug_and_exception.BT;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException() {

    }

    static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        try {

            if (a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("a,b,c > 0");

            }
            if (a + b <= c || a + c <= b || c + b <= a) {
                throw new IllegalTriangleException("is not triangle");
            }
        } catch (InputMismatchException e) {
            throw new IllegalTriangleException("is triangle");
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {

        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a :");
            int a = input.nextInt();

            System.out.println("Enter b :");
            int b = input.nextInt();

            System.out.println("Enter c :");
            int c = input.nextInt();
            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("is not number ");
        }
    }
}
