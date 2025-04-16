
public class MethodOverloading {

    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum((float) 10.0, (float) 2.4));
        System.out.println(calc.sum(2, 4, 6));
    }
}

class Calculate {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
