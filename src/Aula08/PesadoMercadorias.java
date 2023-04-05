package Aula08;

public class PesadoMercadorias extends Veiculo {
   
    protected int peso;
    protected int carga;


    PesadoMercadorias(String matricula, String marca, String modelo, int potencia, int quadrokm,int peso, int carga){
        super(matricula, marca, modelo, potencia, quadrokm);
        assert carga>0;
        assert peso>0;
        
        this.carga = carga;
        this.peso = peso;
        

    }

    public int getCarga(){
        return carga;
    }

    public int getPeso(){
        return peso;
    }

    

@Override
    public String toString(){
        return "Pesado Mercadorias - Matricula: " + matricula + " Marca: " + marca +  " Modelo: " + modelo + " Potência: " + potencia + " Kms: " + quadrokm + " Peso: " + peso + " Carga: " + carga ;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof PesadoMercadorias))
        return false;
        PesadoMercadorias that = (PesadoMercadorias) other;
        return this.matricula.equals(that.matricula);

    }

    
}
