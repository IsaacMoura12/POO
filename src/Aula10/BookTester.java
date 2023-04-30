package Aula10;

import java.util.Scanner;


public class BookTester {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookStore bookstore = new BookStore();

        System.out.println("Welcome to the Library.\n");

        while(true){
            System.out.println("\nOperations:");
            System.out.println("1 - Add Book");
            System.out.println("2 - Search Book");
            System.out.println("3 - Remove Book");
            System.out.println("4 - Recommend Book by Genre");
            System.out.println("5 - List Book by Genre");
            System.out.println("6 - List all Books");
            System.out.println("7 - List all Books and genres");
            System.out.println("8 - List all Genres");
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


                    if (select == 1){
                        System.out.println("Book Title:");
                        String title = sc.nextLine();

                    while(title.length()==0){
                    System.out.println("Book Title:");
                    title = sc.nextLine();
                    }

                    System.out.println("Found:");
                    System.out.println(bookstore.searchBooksTitle(title));
                


                         
                    } else if (select == 2){

                        System.out.println("Book Author:");
                        String author = sc.nextLine();

                    while(author.length()==0){
                    System.out.println("Book Author:");
                    author = sc.nextLine();}

                    System.out.println("Found:");
                    System.out.println(bookstore.searchBooksAuthor(author));
                    



                    } else if (select == 3){
                        
                        System.out.println("Book Year:");
                        String year = sc.nextLine();
        
                        while(year.length()==0){
                            System.out.println("Book Year:");
                            year = sc.nextLine();
                        }

                        System.out.println("Found:");
                        System.out.println(bookstore.searchBooksYear(year));


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

                Book book = new Book(title, author, year);
                bookstore.removeBook(book);
                System.out.println("Book Removed!");

                // verificar caso de nao existir para remover

            } else if (option == 4){

                // code 

            } else if (option == 5){

                // code 

            } else if (option == 6){

                //code

            } else if (option == 7){

                //code 

            } else if (option == 7){

                //code

            } else if (option == 8){

                //code

            } else if (option == 0){
                break;
            } else {
                System.out.println("Invalid Operation!");
            }

        }
        
sc.close();;
}
    
}
