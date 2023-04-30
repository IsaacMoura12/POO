package Aula10;


public class Book {

    protected String title;
    protected String author;
    protected String year;

    public Book(String title, String author, String year){
        assert title.length()>0;
        assert author.length()>0;
        assert year.length()>0;
        this.title= title;
        this.author = author;
        this.year = year;

    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getYear(){
        return year;

    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setYear(String year){
        this.year = year;
    }

    @Override
    public String toString(){
        return "Book: " + this.title + " written by " + author + " in " + this.year;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Book))
        return false;
        Book that = (Book) other;
        return this.title.equals(that.title);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + year.hashCode();
        return result;
    }
}
