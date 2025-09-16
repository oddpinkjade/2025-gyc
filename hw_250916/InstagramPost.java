package hw_250916;

public class InstagramPost {

    private String author;
    private String content;

    public InstagramPost(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
