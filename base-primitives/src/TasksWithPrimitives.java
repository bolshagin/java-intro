public class TasksWithPrimitives {

    private static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (!a & !b & c & d)
                ^ (!a & !c & b & d)
                ^ (!a & !d & b & c)
                ^ (!b & !c & a & d)
                ^ (!b & !d & a & c)
                ^ (!c & !d & a & b);
    }

    private static int leapYearCount(int year){
        return year / 400 + year / 4 - year / 100;
    }

    private static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 1E-4;
    }

    private static int flipBit(int value, int bitIndex) {
        return value ^ 1 << (bitIndex - 1);
    }

    public static void main(String[] args) {
        System.out.println("Задания из лекции про примитивные типы");

        boolean fftt = booleanExpression(false, false, true, true);
        boolean ftft = booleanExpression(false, true, false, true);
        boolean fttf = booleanExpression(false, true, true, false);
        boolean tfft = booleanExpression(true, false, false, true);
        boolean tftf = booleanExpression(true, false, true, false);
        boolean ttff = booleanExpression(true, true, false, false);

        System.out.println(fftt);
        System.out.println(ftft);
        System.out.println(fttf);
        System.out.println(tfft);
        System.out.println(tftf);
        System.out.println(ttff);

        int leap = leapYearCount(100);
        System.out.println(leap);

        double a = 0.1, b = 0.2, c = 0.3;
        System.out.println(doubleExpression(a, b, c));

        int x = 13, ind = 1;
        System.out.format("%d %d \n", x, flipBit(x, ind));
    }
}
