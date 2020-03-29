import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        int curr = -1, prev = 0;

        try (InputStream inStream = System.in) {
            do {
                prev = curr;
                curr = inStream.read();

                if (prev == 13 & curr ==10) {
                    continue;
                } else if (prev >= 0) {
                    System.out.write(prev);
                    System.out.flush();
                }
            } while (curr != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
