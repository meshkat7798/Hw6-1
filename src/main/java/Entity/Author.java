package Entity;

import java.util.Arrays;

public class Author {
    private long Id;
    private String firstname;
    private String lastname;
    private int age;
    private Book[] books ;

    public Author(Long Id,String firstname, String lastname, int age) {
        this.Id = Id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Author(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Author() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "Id=" + Id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
