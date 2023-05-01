package Aula10;
import java.util.List;
import java.util.ArrayList;

public class Genre implements Comparable<Genre> {
    protected String name;
    protected List<Book> books;


   public Genre(String name){
        assert name.length()>0;
        this.name = name;
        this.books = new ArrayList<>();
            
           }

public String getGenre(){
    return name;
}

public List<Book> getBooks(){
    return books;
}

public void addBook(Book book){
    books.add(book);
}
@Override
    public int compareTo(Genre o) {
        return this.name.compareTo(o.name);
    }

@Override
public String toString(){
    return name;
}
    
}
