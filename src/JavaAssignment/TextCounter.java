package JavaAssignment;

public class TextCounter {
    private int rows;
    private int letters;

    public void countRows (String text) {
        rows +=1;
    }
    public void countLetters(String text) {
        letters += text.length();
    }

    int getRows() {
        return rows;
    }
    int getLetters() {
        return letters;
    }

}