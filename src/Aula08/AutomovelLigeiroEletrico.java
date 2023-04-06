package Aula08;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico{
    protected int autonomia;
    protected int capacidade;

    AutomovelLigeiroEletrico(String matricula, String marca, String modelo, int potencia, int quadrokm, int bagageira, int autonomia, int capacidade){


        super(matricula, marca, modelo, potencia, quadrokm, bagageira);
        assert autonomia>0;
        assert capacidade >0;
        assert capacidade > autonomia;

        this.autonomia = autonomia;
        this.capacidade = capacidade;
    }




    @Override
    public void trajeto(int kilometros){
        assert kilometros>0;
        assert kilometros < this.autonomia;
        this.ultimoTrajeto = kilometros;
        this.distancia = this.distancia + kilometros;
        setKms(kilometros);  
        descarregar(kilometros); 

    }



    @Override
    public int autonomia(){
        return autonomia;
    }

    public void descarregar(int km){
        this.autonomia = this.autonomia -km;
        if(this.autonomia<0){
            this.autonomia = 0;
        }
    }

    public void setAutonomia(int carregar){
        this.autonomia = carregar;
    }


    public int getCapacidade(){
        return capacidade;
    }

    @Override
    public void carregar(int percentagem){
        assert percentagem>=0 && percentagem <= 100;
        int carga = this.capacidade * percentagem/100;

        if(carga + this.autonomia > this.capacidade){
            setAutonomia(capacidade);
        } else {
            setAutonomia(carga + this.autonomia);
        }
        
    }





    

    @Override
    public String toString(){
        return "Ligeiro Elétrico - Matricula: " + matricula + " Marca: " + marca + " Modelo " + modelo +  " Potência: " + potencia + " Kms: " + quadrokm + " Bagageira: " + bagageira + " Autonomia: " + autonomia;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof AutomovelLigeiroEletrico))
        return false;
        AutomovelLigeiroEletrico that = (AutomovelLigeiroEletrico) other;
        return this.matricula.equals(that.matricula);

    }



    
}
