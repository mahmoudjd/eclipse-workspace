package oop.collections.library;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Library
{

    private List<Book> books;

    public Library()
    {
        books = new ArrayList<Book>();
    }

    public boolean insert(Book b)
    {
        if (b == null)
        {
            throw new IllegalArgumentException();
        }

        for (Book libBook : books)
        {
            if (libBook.getIsbn().equals(b.getIsbn()))
            {
                return false;
            }
        }

        return books.add(b);
    }

    public Book findByIsbn(String isbn)
    {
        if (isbn == null)
        {
            return null;
        }
        
        for (Book libBook : books)
        {
            if (isbn.equals(libBook.getIsbn()))
            {
                return libBook;
            }
        }
        return null;
    }

    public Set<Book> findByAuthor(String author)
    {
        if (author == null)
        {
            return null;
        }
        Set<Book> resBooks = new HashSet<>();
        for (Book b : books)
        {
            if (b.getAuthor().equals(author))
            {
                resBooks.add(b);
            }

        }
        if (resBooks.size() == 0)
        {
            return null;
        }

        return resBooks;
    }

}
