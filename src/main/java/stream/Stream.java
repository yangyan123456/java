package stream;

import lombok.extern.slf4j.Slf4j;
import pojo.Author;
import pojo.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class Stream {

    public static void main(String[] args) {
        List<Author> authors = getAuthors();
        log.info(authors.toString());

    }

    private static List<Author> getAuthors() {

        Author author1 = new Author(1L, "alpha", 33, "天高气爽", null);
        Author author2 = new Author(2L, "beta", 15, "命定之死", null);
        Author author3 = new Author(3L, "chalice", 14, "哦莫吉里", null);
        Author author4 = new Author(4L, "dog", 14, "曼波", null);

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();
        List<Book> books4 = new ArrayList<>();

        books1.add(new Book(1L, "java", "java编程思想", 100.0, "java"));
        books1.add(new Book(2L, "C++", "C++编程思想", 100.0, "C++"));
        books1.add(new Book(3L, "python", "python编程思想", 100.0, "python"));
        books1.add(new Book(4L, "javaScript", "javaScript编程思想", 100.0, "javaScript"));

        books2.add(new Book(5L, "java", "java编程思想", 100.0, "java"));
        books2.add(new Book(6L, "C++", "C++编程思想", 100.0, "C++"));
        books2.add(new Book(7L, "python", "python编程思想", 100.0, "python"));

        books3.add(new Book(8L, "java", "java编程思想", 100.0, "java"));
        books3.add(new Book(9L, "C++", "C++编程思想", 100.0, "C++"));

        books4.add(new Book(10L, "java", "java编程思想", 100.0, "java"));

        author1.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books4);

        return new ArrayList<>(Arrays.asList(author1, author2, author3, author4));
    }
}
