package Aula11;

public class Companhia {
    protected String name;
    protected String sigla;

    Companhia(String name, String sigla){
        assert name.length()>0;
        assert sigla.length()>0;
        this.name = name;
        this.sigla = sigla;
    }

    public String getName(){
        return name;
    }

    public String getSigla(){
        return sigla;
    }
    
}
