class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private final String[] NEGATIVE = {":(", "=(", ":|"};

    @Override
    public String[] getKeywords() {
        return NEGATIVE;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}