package Aula10;

import java.util.Scanner;


public class BookTester {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookStore bookstore = new BookStore();
        Book book1 = new Book("The Lord of the Rings - The Fellowship of the Ring", "J.R.R Tolkien", "1954");
        bookstore.addBook(book1, "High Fantasy");
        Book book2 = new Book("The Lord of the Rings - The Two Towers", "J.R.R Tolkien", "1955");
        bookstore.addBook(book2, "High Fantasy");
        Book book3 = new Book("The Lord of the Rings - The Return of the King", "J.R.R Tolkien", "1955");
        bookstore.addBook(book3, "High Fantasy");
        Book book4 = new Book("The Silmarillion", "J.R.R Tolkien", "1977");
        bookstore.addBook(book4, "High Fantasy");
        Book book5 = new Book("The Hobbit", "J.R.R Tolkien", "1937");
        bookstore.addBook(book5, "High Fantasy");
        Book book6 = new Book("Unfinished Tales of Númenor and Middle-earth", "J.R.R Tolkien", "1980");
        bookstore.addBook(book6, "High Fantasy");
        Book book7 = new Book("The Children of Húrin", "J.R.R Tolkien", "2007");
        bookstore.addBook(book7, "High Fantasy");

        Book book8 = new Book("It", "Stephen King", "1986");
        bookstore.addBook(book8, "Horror Fantasy");
        Book book9 = new Book("The Shining", "Stephen King", "1977");
        bookstore.addBook(book9, "Horror Fantasy");
        Book book10 = new Book("Pet Sematery", "Stephen King", "1983");
        bookstore.addBook(book10, "Horror Fantasy");
        Book book11 = new Book("Carrie", "Stephen King", "1974");
        bookstore.addBook(book11, "Horror Fantasy");


        Book book12 = new Book("Crime and Punishment", "Fyodor Dostoevksy", "1866");
        bookstore.addBook(book12, "Literary Fiction");
        Book book13 = new Book("The Idiot", "Fyodor Dostoevksy", "1869");
        bookstore.addBook(book13, "Novel");
        Book book14 = new Book("Demons", "Fyodor Dostoevksy", "1872");
        bookstore.addBook(book14, "Novel");
        Book book15 = new Book("The Brothers Karamazov", "Fyodor Dostoevksy", "1880");
        bookstore.addBook(book15, "Family Drama");
        Book book16 = new Book("Notes from the Underground", "Fyodor Dostoevksy", "1864");
        bookstore.addBook(book16, "Philosophical Fiction");

        Book book17 = new Book("Harry Potter - Philosopher's Stone", "J.K Rowling", "1997");
        bookstore.addBook(book17, "Fantasy Novel");
        Book book18 = new Book("Harry Potter - Chamber of Secrets", "J.K Rowling", "1998");
        bookstore.addBook(book18, "Fantasy Novel");







        System.out.println("Welcome to the Library.\n");

        while(true){
            System.out.println("\nOperations:");
            System.out.println("1 - Add Book");
            System.out.println("2 - Search Book");
            System.out.println("3 - Remove Book");
            System.out.println("4 - Recommend Book by Genre");
            System.out.println("5 - List Book by Genre");
            System.out.println("6 - List all Books");
            System.out.println("7 - List all Genres");
            System.out.println("0 - Quit");
            System.out.println("\nOption: ");

            int option = sc.nextInt();


            if (option == 1){
                System.out.println("Book Title:");
                sc.nextLine();
                String title = sc.nextLine();

                while(title.length()==0){
                    System.out.println("Book Title:");
                    title = sc.nextLine();
                }

                System.out.println("Book Author:");
                String author = sc.nextLine();

                while(author.length()==0){
                    System.out.println("Book Author:");
                    author = sc.nextLine();
                }

                System.out.println("Book Year:");
                String year = sc.nextLine();

                while(year.length()==0){
                    System.out.println("Book Year:");
                    year = sc.nextLine();
                }

                System.out.println("Book Genre:");
                String genre = sc.nextLine();

                while(genre.length()==0){
                    System.out.println("Book Genre:");
                    genre = sc.nextLine();
                }



                Book book = new Book(title, author, year);

                bookstore.addBook(book, genre);

                System.out.println("Book Added!");

                

            } else if (option == 2){

                while(true){
                    System.out.println("1 - Search by Title");
                    System.out.println("2 - Search by Author");
                    System.out.println("3 - Search by Year");
                    System.out.println("0 - Back");

                    int select = sc.nextInt();

                    sc.nextLine();
                    if (select == 1){
                        System.out.println("Book Title:");
                        String title = sc.nextLine();

                    while(title.length()==0){
                    System.out.println("Book Title:");
                    title = sc.nextLine();
                    }

                    System.out.println();
                    System.out.println("Found:");
                    bookstore.searchBooksTitle(title);
                    System.out.println();
                


                         
                    } else if (select == 2){

                        System.out.println("Book Author:");
                        String author = sc.nextLine();

                    while(author.length()==0){
                    System.out.println("Book Author:");
                    author = sc.nextLine();}

                    System.out.println();
                    System.out.println("Found:");
                    bookstore.searchBooksAuthor(author);
                    System.out.println();
                    



                    } else if (select == 3){
                        
                        System.out.println("Book Year:");
                        String year = sc.nextLine();
        
                        while(year.length()==0){
                            System.out.println("Book Year:");
                            year = sc.nextLine();
                        }

                        System.out.println();
                        System.out.println("Found:");
                        bookstore.searchBooksYear(year);
                        System.out.println();


                    } else if (select == 0){
                        break;
                    } else {
                        System.out.println("Invalid Operation!");
                    }
                }

                

            } else if (option == 3){

                System.out.println("Book Title:");
                sc.nextLine();
                String title = sc.nextLine();

                while(title.length()==0){
                    System.out.println("Book Title:");
                    title = sc.nextLine();
                }

                System.out.println("Book Author:");
                String author = sc.nextLine();

                while(author.length()==0){
                    System.out.println("Book Author:");
                    author = sc.nextLine();
                }

                System.out.println("Book Year:");
                String year = sc.nextLine();

                while(year.length()==0){
                    System.out.println("Book Year:");
                    year = sc.nextLine();
                }

                System.out.println();
                Book book = new Book(title, author, year);
                bookstore.removeBook(book);
                
                System.out.println();

                // verificar caso de nao existir para remover

            } else if (option == 4){


                sc.nextLine();
                System.out.println("Book Genre:");
                String genre = sc.nextLine();

                while(genre.length()==0){
                    System.out.println("Book Genre:");
                    genre = sc.nextLine();
                }
                System.out.println();

                //Genre ger = new Genre(genre);

                bookstore.getRandomBookByGenre(genre);

            } else if (option == 5){

                sc.nextLine();
                System.out.println("Book Genre:");
                String genre = sc.nextLine();

                while(genre.length()==0){
                    System.out.println("Book Genre:");
                    genre = sc.nextLine();
                }

                System.out.println();
                System.out.println("Found:");
                bookstore.getBooksByGenre(genre);
                
        


            } else if (option == 6){

                bookstore.listAllBooksByGenre();

    
            } else if (option == 7){
                System.out.println();
                System.out.println("\nGenres:\n");

                bookstore.getAllGenres();

            } else if (option == 0){
                break;
            } else {
                System.out.println("Invalid Operation!");
            }

        }
        
sc.close();;
}
    
}
