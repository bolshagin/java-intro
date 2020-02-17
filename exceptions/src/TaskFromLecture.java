public class TaskFromLecture {

    public static class A {
        int value;
    }

    public static class B extends A {
        int value;
    }

    public static void main(String[] args) {
        A a = new A();
        B b = (B) a;
    }
}
