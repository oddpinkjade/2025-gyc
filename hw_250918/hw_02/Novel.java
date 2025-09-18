package hw_250918.hw_02;

public class Novel extends Book {

    private String genre;

    public Novel() {}

    public Novel(String title, String author, int price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() +  "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
