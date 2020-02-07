import java.util.function.DoubleUnaryOperator;

public class CalcIntegral {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = 10e-6;
        double res = 0;

        for (double x = a; x < b; x += step) {
            res += step * f.applyAsDouble(x);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }
}
