package Aula08;

public class PesadoPassageiros extends Veiculo{
   
    protected int peso;
    protected int passageiros;

    PesadoPassageiros(String matricula, String marca, String modelo, int potencia, int quadrokm,int peso, int passageiros){
        super(matricula, marca, modelo, potencia, quadrokm);
        assert passageiros>0;
        assert peso>0;
        this.passageiros = passageiros;
        this.peso = peso;
        

    }

    public int getPassageirosMax(){
        return passageiros;
    }

    public int getPeso(){
        return peso;
    }


@Override
    public String toString(){
        return "Pesado Passageiros - Matricula: " + matricula + " Marca: " + marca +  " Modelo: " + modelo + " Potência: " + potencia + " Kms: " + quadrokm + " Peso: " + peso + " MaxPassageiros: " + passageiros ;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof PesadoPassageiros))
        return false;
        PesadoPassageiros that = (PesadoPassageiros) other;
        return this.matricula.equals(that.matricula);

    }

    
}
