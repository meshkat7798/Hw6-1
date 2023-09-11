package Entity;

public class Book {
    private long Id;
    private String title;
    private int publishedYear;
    private Author author;

    public Book(long Id,String title, int publishedYear, Author author) {
        this.Id = Id;
        this.title = title;
        this.publishedYear = publishedYear;
        this.author = author;
    }

    public Book(String title, int publishedYear, Author author) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.author = author;
    }

    public Book(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", publishedYear=" + publishedYear +
                ", author=" + author +
                '}';
    }
}
