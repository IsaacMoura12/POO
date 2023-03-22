package Aula05;


public class Imovel {

    private int id;
    private int quartos;
    private String localidade;
    private int preço;
    private boolean dispo;
    private DateYMD inicio;
    private DateYMD fim;
    
    


    public Imovel(int id, int quartos, String localidade, int preço, boolean dispo,DateYMD inicio, DateYMD fim){
        assert id > 1000 : "ID começa em 1000!";
        assert quartos >=0;
        assert !(localidade.isEmpty());
        assert preço>0;
        this.id = id;
        this.quartos = quartos;
        this.localidade = localidade;
        this.preço = preço;
        this.dispo = dispo;
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getId(){
        return id;
    }

    public int getQuartos(){
        return quartos;
    }

    public String getLocalidde(){
        return localidade;
    }

    public int getPreço(){
        return preço;
    }

    public boolean getDisponibilidade(){
        return dispo;
    }

    public DateYMD getDataInicio(){
        return inicio;
    }

    public DateYMD getDataFim(){
        return fim;
    }

    public void setInicio(DateYMD inicio){
        this.inicio = inicio;
    }

    public void setFim(DateYMD fim){
        this.fim = fim;
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Imovel))
        return false;
        Imovel that = (Imovel) other;
        return this.id == that.id && this.quartos == that.quartos && this.preço == that.preço && this.localidade.equalsIgnoreCase(that.localidade);

    }

    @Override
    public String toString(){

        //DateYMD tmp = new DateYMD(1,1, 1);

        if(dispo==false){
        return "Imóvel: " + id + "; quartos: " + quartos + "; localidade: " + localidade + "; preço: " + preço + "; disponível: não";
        } else{
            //if(inicio.equals(tmp) && fim.equals(tmp)){
                if(inicio == null && fim == null){
                return "Imóvel: " + id + "; quartos: " + quartos + "; localidade: " + localidade + "; preço: " + preço + "; disponível: sim";
 
            }else {
                return "Imóvel: " + id + "; quartos: " + quartos + "; localidade: " + localidade + "; preço: " + preço + "; disponível: sim"  + "; leilão: " + inicio + " : " + fim;
            }
        }
    }


}

