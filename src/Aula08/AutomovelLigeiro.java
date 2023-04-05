package Aula08;

public class AutomovelLigeiro extends Veiculo{

    protected String modelo;
    protected int bagageira;


    AutomovelLigeiro(String matricula, String marca, String modelo, int potencia, int quadrokm, int bagageira){
        
        super(matricula, marca, modelo, potencia, quadrokm);
        assert bagageira>0;
        this.bagageira=bagageira;
    }

   

    public int getBagageira(){
        return bagageira;
    }

    



    @Override
    public String toString(){
        return "Automóvel Ligeiro - Matricula: " + matricula + " Marca: " + marca + " Modelo " + modelo +  " Potência: " + potencia + " Kms: " + quadrokm + " Bagageira: " + bagageira;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof AutomovelLigeiro))
        return false;
        AutomovelLigeiro that = (AutomovelLigeiro) other;
        return this.matricula.equals(that.matricula);

    }
    


    
}
