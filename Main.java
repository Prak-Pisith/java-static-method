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

class Duck {
    private int size;

    public static void testDuck() {
//        System.out.println(this.size);
    }
}

class Tiger {
    public static int count = 0;

    public Tiger() {
        this.count++;
    }
}

class Main {
    public static void main(String[] args) {
        int min = MyUtils.Min(6, 15);
        System.out.println("Min is " + min);

        // Math also static
        int max = Math.max(12, 56);
        System.out.println("Max is " + max);

        // ====

//        Tiger[] tigers = Tiger[3];
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = new Tiger();

        System.out.println("Tiger Count: " + Tiger.count);
    }

}