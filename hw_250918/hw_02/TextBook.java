package hw_250918.hw_02;

public class TextBook extends Book {

    private String subject;

    public TextBook() {}

    public TextBook(String title, String author, int price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
