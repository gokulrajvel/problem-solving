package Encapsulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library {
    private Map<String, String> books = new LinkedHashMap<>();

    public void addBook(String bookID, String bookName) {
        books.put(bookID, bookName);
    }

    public Map<String, String> getAllBooks() {
        return books;
    }

    public String getBook(String bookID) {
        return books.get(bookID);
    }

    public void removeBook(String bookID) {
        books.remove(bookID);
    }
}
