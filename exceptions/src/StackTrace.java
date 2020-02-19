public class StackTrace {

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = new Throwable().getStackTrace();
        String res;

        try {
            res = ste[2].getClassName() + '#' + ste[2].getMethodName();
        }
        catch (Exception e) {
            return null;
        }

        return res;
    }

    public static void test1() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        test1();
    }
}
