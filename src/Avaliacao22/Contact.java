package Avaliacao22;
import java.time.LocalDate;

public class Contact {
    private static int idIterator = 0;
    private int id;
    private String name;
    private int phoneNumber;
    private String email;
    private LocalDate birthDate;


    public Contact( String name, int phoneNumber, String email, LocalDate birthDate){
        this.id = idIterator++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getPhone(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhone(int phone){
        this.phoneNumber = phone;
    } 

    public void setEmail(String email){
        this.email = email;
    }

    public void setBirth(LocalDate  date){
        this.birthDate = date;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.phoneNumber + ", " + this.email + ", " + this.birthDate;
    }

    
    @Override
    public boolean equals(Object other){
        if(!(other instanceof Contact))
        return false;
        Contact that = (Contact) other;
        return this.name.equals(that.name) && this.phoneNumber==that.phoneNumber && this.birthDate.equals(that.birthDate) && this.email.equals(that.email);


    }

// fazer hash




}
