public class MySQRT {

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + Double.toString(x));
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        double xs = 4, ys = -4;

        System.out.println(sqrt(xs));
        System.out.println(sqrt(ys));
    }
}
