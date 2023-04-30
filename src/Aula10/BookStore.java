package Aula10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {
    private Map<String, Genre> genres;
    private List<Book> books;
    

    public BookStore(){
        genres = new HashMap<>();
        books = new ArrayList<>();
    }


    public void addBook(Book book, String genreName){
        Genre genre = genres.get(genreName);
        if(genre == null){
            genre = new Genre(genreName);
            genres.put(genreName, genre);

        }
        genre.addBook(book);
        books.add(book);

    }

    public void removeBook(Book book){
        Genre genre = findGenreForBook(book);
        if (genre != null) {
            genre.getBooks().remove(book);
        }
        books.remove(book);
    }
    public void updateBook(Book book, String newTitle, String newAuthor, String newYear) {
        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
        book.setYear(newYear);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getBooksByGenre(String genreName) {
        Genre genre = genres.get(genreName);
        if (genre != null) {
            return genre.getBooks();
        } else {
            return new ArrayList<>();
        }
    }

    public List<Book> searchBooks(String searchTerm) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(searchTerm) || book.getAuthor().contains(searchTerm) || book.getYear().contains(searchTerm)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> searchBooksTitle(String searchTerm) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(searchTerm)) {
                results.add(book);
            }
        }
        for ( Book book : results){
            System.out.println(book);
        }
        return results;
    }
    public List<Book> searchBooksAuthor(String searchTerm) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(searchTerm)) {
                results.add(book);
            }
        }
        for ( Book book : results){
            System.out.println(book);
        }
        return results;
    }
    public List<Book> searchBooksYear(String searchTerm) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear().contains(searchTerm)) {
                results.add(book);
            }
        }

        for ( Book book : results){
            System.out.println(book);
        }
        return results;
    }






    private Genre findGenreForBook(Book book) {
        for (Genre genre : genres.values()) {
            if (genre.getBooks().contains(book)) {
                return genre;
            }
        }
        return null;
    }
}
