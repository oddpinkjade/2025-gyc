package hw_250918.hw_02;

public class Book {

    // Book 클래스에 제목(title), 저자(author), 가격(price)는 private 변수.
    private String title;
    private String author;
    private int price;

    public Book() {}

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 오직 set/get 메서드로만 정보 수정·조회가 가능하도록 설정.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
