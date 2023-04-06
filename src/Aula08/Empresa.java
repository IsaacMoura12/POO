package Aula08;

public class Empresa {
    protected String nome;
    protected String postal;
    protected String email;
    protected Veiculo[] frota;


    Empresa(String nome, String postal, String email, Veiculo[] frota){
        assert nome.length()>0;
        assert postal.length()>0;
        assert email.length()>0;
        assert frota.length>0;
        this.nome = nome;
        this.email = email;
        this.postal = postal;
        this.frota  = frota;
    }




    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getPostal(){
        return postal;
    }

    public Veiculo[] getFrota(){
        return frota;
    }

    public void listFrota(Empresa empresa){
        for (int i = 0; i < empresa.frota.length; i++) {
            System.out.println(frota[i]);
            
        }
    }


    @Override
    public String toString(){
        return "Empresa: " + nome + " Email: " + email + " Código Postal " + postal;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Empresa))
        return false;
        Empresa that = (Empresa) other;
        return this.nome.equals(that.nome) && this.email.equals(that.email) && this.postal.equals(that.postal);

    }
    
}
