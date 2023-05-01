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
        int flag =0;
        Genre genre = findGenreForBook(book);
        if (genre != null) {
            genre.getBooks().remove(book);
            flag = 1;
        }
        books.remove(book);

        if(flag ==0){
            System.out.println("Book not Found!");

        } else {
            System.out.println("Book Removed");
        }
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
            System.out.println();
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

    public void getRandomBookByGenre(String genreName) {
        Genre genre = genres.get(genreName);
        if (genre != null) {
            List<Book> books = genre.getBooks();
            if (!books.isEmpty()) {
                int randomIndex = (int) (Math.random() * books.size());
                System.out.println(books.get(randomIndex));
                
            } else {
                System.out.println("Genre does not Exist!");
            }
        }
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

    public void searchBooksTitle(String searchTerm) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(searchTerm)) {
                results.add(book);
            }
        }
        for ( Book book : results){
            System.out.println(book);
        }
        
    }
    public void searchBooksAuthor(String searchTerm) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(searchTerm)) {
                results.add(book);
            }
        }
        for ( Book book : results){
            System.out.println(book);
        }
        
    }
    public void searchBooksYear(String searchTerm) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear().contains(searchTerm)) {
                results.add(book);
            }
        }

        for ( Book book : results){
            System.out.println(book);
        }
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
