import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private byte[] data;

    public AsciiCharSequence(byte[] data) {
        this.data = data.clone();
    }

    @Override
    public int length() {
        return this.data.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.data[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(this.data, start, end));
    }

    @Override
    public String toString() {
        return new String(this.data);
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence cs = new AsciiCharSequence(example);

        System.out.println("Последовательность - " + cs.toString());
        System.out.println("Размер её - " + cs.length());
        System.out.println("Символ под № 1 - " + cs.charAt(1));
        System.out.println("Подпоследовательность - " + cs.subSequence(1, 3));
    }
}
