package Aula06;
import utils.User_input;

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

        assert User_input.isTelemovelPT(telemovel) : "Número de telemóvel Inválido!";
        this.telemovel = telemovel;

        assert User_input.isValidEmail(email) : "Email Inválido!";
        this.email = email;

        







    }


    
}
