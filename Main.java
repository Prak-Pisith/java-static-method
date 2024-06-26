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
    // Immutable variable
    public static final int X_VALUE = 25;

    // Belong to class
    static int count = 0;

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

        // static variable init when the class load
        // before object init
        System.out.println("Tiger Static First Count: " + Tiger.count);

        Tiger[] tigers = new Tiger[5];
        tigers[0] = new Tiger();
        tigers[1] = new Tiger();
        tigers[2] = new Tiger();
        tigers[3] = new Tiger();
        tigers[4] = new Tiger();
        int tigerCount = 0;
        for (Tiger tiger : tigers) {
            tigerCount++;
        }
        System.out.println("Tiger Object Count: " + tigerCount);
        System.out.println("Tiger Static Count: " + Tiger.count);

        System.out.println("Tiger Immutable Value: " + Tiger.X_VALUE);
    }

}