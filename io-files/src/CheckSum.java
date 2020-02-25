import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckSum {

    public static int checkSumOfStream(InputStream stream) throws IOException {
        int data = 0, checkSum = 0;
        byte[] readedBytes = new byte[1024];

        try {
            while ((data = stream.read(readedBytes)) > 0) {
                for (int i = 0; i < data; i++) {
                    System.out.format("%d %d %d \n", data, i, readedBytes[i]);
                    checkSum = Integer.rotateLeft(checkSum, 1) ^ Byte.toUnsignedInt(readedBytes[i]);
                }
            }
        } catch (IOException e) {
            throw e;
        }

        return checkSum;
    }

    public static void main(String[] args) {
        InputStream stream;
        stream = new ByteArrayInputStream(new byte[] {0x33, 0x45, 0x01});

        try {
            int result = checkSumOfStream(stream);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
