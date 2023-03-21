package Aula06;


public class Contacto {
    private static int idgen = 1;
    private int id;
    private Pessoa pessoa;
    private int telemovel;
    private String email;


    public Contacto(Pessoa pessoa, int telemovel, String email){
        this.id = idgen++;
        assert pessoa instanceof Pessoa;
        this.pessoa = pessoa;

        assert isTelemovelPT(telemovel) : "Número de telemóvel Inválido!";
        this.telemovel = telemovel;

        assert isValidEmail(email) : "Email Inválido!";
        this.email = email;

    }

    public int getId(){
        return id;
    }

    public int getTel(){
        return telemovel;
    }

    public String getEmail(){
        return email;
    }

    public Pessoa getNome(){
        return pessoa;
    }


    public void setNome(Pessoa nome){
        this.pessoa = nome;
    }


    public void setTel(int telemovel){
        this.telemovel = telemovel;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Contacto))
        return false;
        Contacto that = (Contacto) other;
        return this.id == that.id;
    }

    @Override
    public String toString(){
        return String.format("%s - %d - %s - ID: %d", pessoa.getNome(),telemovel,email,id);
    }





    public static boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"; 
        return email.matches(regex);
    }
   
    public static boolean isTelemovelPT(int tel){
        String tmp = String.valueOf(tel);
        char first = tmp.charAt(0);
        if(tmp.length() == 9){
            if(first == '9'){
                return true;
            }
        }
        return false;
    }


    
}
