public abstract class KeywordAnalyzer implements TextAnalyzer {

    abstract String[] getKeywords();
    abstract Label getLabel();

    public Label processText(String text) {
        String[] stopWords = this.getKeywords();
        for (String stopWord: stopWords)
            if (text.contains(stopWord)) {
                return this.getLabel();
            }
        return Label.OK;
    }
}
