within the package folder
package pack1;

public class file2 {
    public double a;
    public double b;
    public double area;

    public file2(double length, double breadth) {
        a = length;
        b = breadth;
    }

    public void getarea() {
        area = a * b;
    }

    public void display() {
        System.out.println("This file2 package pack1");
        System.out.println("length = " + a);
        System.out.println("breadth = " + b);
        System.out.println("area = " + area);
    }
}
outside package folder
import pack1.file2;

class prg14 {
    public static void main(String args[]) {
        file2 obj = new file2(2, 20);
        obj.getarea();
        obj.display();
    }
}
