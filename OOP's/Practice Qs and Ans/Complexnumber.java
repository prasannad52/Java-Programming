// it is not correct qs is different

import java.util.Scanner;

public class Complexnumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter second complex number");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Complex obj1 = new Complex(x1, y1);
        Complex obj2 = new Complex(x2, y2);
        obj1.printIt();
        obj2.printIt();
        add obj = new add();
        int a[] = obj.addIt(obj1, obj2);
        System.out.println(a[0] + "+" + "i" + a[1]);
    }
}

class Complex {

    int x, y;

    Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printIt() {
        System.out.println(x + "+" + "i" + y);
    }
}

class add {

    int X, Y;

    int[] addIt(Complex obj1, Complex obj2) {
        X = obj1.x + obj2.x;
        Y = obj1.y + obj2.y;
        return new int[]{X, Y};
    }
}
