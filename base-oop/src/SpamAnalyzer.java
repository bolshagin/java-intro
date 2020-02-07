public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords.clone();
    }

    @Override
    public String[] getKeywords() {
        return this.keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}