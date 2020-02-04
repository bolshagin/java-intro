import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.math.BigInteger;
import java.util.Arrays;

public class TasksWithStatements {

    private static BigInteger factorial(int value) {
        BigInteger fact = BigInteger.ONE;
        for (int n = 1; n <= value; n++) {
            fact = fact.multiply(BigInteger.valueOf(n));
        }
        return fact;
    }

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int l1 = a1.length, l2 = a2.length;
        int[] merged = new int[l1 + l2];

        for (int i = 0, j = 0, k = 0; k < (l1 + l2); k++) {

            if ((i < l1) && (j < l2)){
                if (a1[i] < a2[j]) {
                    merged[k] = a1[i];
                    i++;
                } else {
                    merged[k] = a2[j];
                    j++;
                }
            } else if (i < l1) {
                merged[k] = a1[i];
                i++;
            } else if (j < l2) {
                merged[k] = a2[j];
                j++;
            }
        }
        return merged;
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        int lText = textLines.length;
        StringBuilder play = new StringBuilder();

        for (String role : roles) {
            play.append(role + ":" + "\n");
            for (int i = 0; i < lText; i++){
                if (textLines[i].startsWith(role + ":")) {
                    play.append((i + 1) + ")"
                            + textLines[i].replaceFirst(role + ":", "")
                            + "\n");
                }
            }
            play.append("\n");
        }

        return play.toString();
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));

        int[] a1 = {0, 2, 2}, a2 = {1, 3};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));

        String [] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};

        String [] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        System.out.println(printTextPerRole(roles, textLines));
    }
}
