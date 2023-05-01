package Aula10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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

    public void getAllGenres() {
        List<Genre> genreList = new ArrayList<>(genres.values());
        for(Genre genre : genreList){
            System.out.println(genre);
        }
        
    }

    public void listAllBooksByGenre() {
        for (Map.Entry<String, Genre> entry : genres.entrySet()) {
            String genreName = entry.getKey();
            Genre genre = entry.getValue();
            System.out.println(genreName + ":");
            List<Book> books = genre.getBooks();
            if (books.isEmpty()) {
                System.out.println("\tNo books found for this genre.");
            } else {
                for (Book book : books) {
                    System.out.println("\t" + book.getTitle() + " by " + book.getAuthor());
                }
            }
        }
    }

    public void getRandomBookByGenre(Genre genre) {
        List<Book> books = genre.getBooks();
        Random random = new Random();
    
        // Check if the list of books is empty
        if (books.isEmpty()) {
            System.out.println("Genre does not exist!");
        }
    
        // Get a random index between 0 and the size of the list
        int index = random.nextInt(books.size());
    
        // Return the book at the random index
        System.out.println(books.get(index));
        
    }

    public void getBooksByGenre(String genreName) {
        Genre genre = genres.get(genreName);
        if (genre != null && !genre.getBooks().isEmpty()) {
            List<Book> books = genre.getBooks();
            for (Book book : books){
                System.out.println(book.toString());
            }
            
        } else {
            System.out.println("No books found.");
        }
    }

    public List<Book> searchBooks(String searchTerm) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(searchTerm) || book.getAuthor().contains(searchTerm) || book.getYear().contains(searchTerm)) {
                results.add(book);
            }
        }
        for (Book book : results){
            System.out.println(book);
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
