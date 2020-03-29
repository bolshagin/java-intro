import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ConvertString {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        //byte[] arr = inputStream.readAllBytes();
        //return new String(arr, charset);

        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        int data = 0;
        char ch;

        while ((data = reader.read()) > 0) {
            ch = (char) data;
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        InputStream stream = new ByteArrayInputStream(new byte[] {48, 49, 50, 51});
        Charset charset = StandardCharsets.US_ASCII;

        // String s = new String(new byte[] {48, 49, 50, 51}, charset);
        String s = readAsString(stream, charset);
        System.out.println(s);
    }
}
