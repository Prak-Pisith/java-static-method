import java.lang.Math;

// Static
class MyUtils {

    /*
    Static Method use-cases
    1. Not depend on object state (intance variable)
    2. Not need to create object
     */
    public static int Min (int a, int b) {
        if (a > b) return b;
        else return a;
    }


}

class Main {
    public static void main(String[] args) {
        int min = MyUtils.Min(6, 15);
        System.out.println("Min is " + min);

        // Math also static
        int max = Math.max(12, 56);
        System.out.println("Max is " + max);
    }
}