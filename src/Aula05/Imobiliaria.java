package Aula05;
import java.util.List;
import java.util.ArrayList;

public class Imobiliaria {
    private List<Imovel> propriedades;
    


    public Imobiliaria(){
        propriedades = new ArrayList<>();
    }

    public void addImovel(Imovel imovel){
        if (propriedades.contains(imovel)) {
            System.out.println("Imóvel já existente!");
        } else {
            propriedades.add(imovel);
        }
    }

    public void removeImovel(Imovel imovel){

        if (!propriedades.contains(imovel)) {
            System.out.println("Imóvel não existe!");
        } else {
            propriedades.remove(imovel);
        }
    }

    public void startLeilao(DateYMD inicio, DateYMD fim, Imovel imovel){
        //DateYMD tmp = new DateYMD(1, 1, 1);

        if(imovel.getDisponibilidade()){
            //if(imovel.getDataFim().equals(tmp)&& imovel.getDataInicio().equals(tmp)){
            if(imovel.getDataFim() != null && imovel.getDataInicio() != null){
                System.out.println("Leilão já se encontra aberto para este imovel!");
            } else {
                imovel.setInicio(inicio);
                imovel.setFim(fim);   
            }

        }else{
            System.out.println("Imovél não existe!");
        }
    }

    public Imovel getImovelIndex(int index) {
        if (index >= 0 && index < propriedades.size()) {
            return propriedades.get(index);
        } else {
            return null;
        }
    }
    

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nLista de imóveis da imobiliária:\n");
        for (Imovel imovel : propriedades) {
            sb.append(imovel + "\n");
        }
        return sb.toString();
      
    }

    
}
