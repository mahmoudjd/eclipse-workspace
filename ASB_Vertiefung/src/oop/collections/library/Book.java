package oop.collections.library;

public class Book
{

    private String isbn;

    private String author;

    private String title;

    public Book(String isbn, String author, String title)
    {
        if (isbn == null || author == null || title == null)
        {
            throw new IllegalArgumentException();
        }
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

}
