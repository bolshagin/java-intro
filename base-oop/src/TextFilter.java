public class TextFilter {

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer a: analyzers) {
            Label result = a.processText(text);
            if (result != Label.OK) {
                return result;
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        String testText = "Foo bar";
        TextAnalyzer tooLong = new TooLongTextAnalyzer(3);
        TextAnalyzer[] Analyzers = {tooLong};
        System.out.println(checkLabels(Analyzers, testText));
    }
}
