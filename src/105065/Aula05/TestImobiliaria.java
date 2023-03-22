package Aula05;

public class TestImobiliaria {
    public static void main(String[] args) {

        Imobiliaria imo = new Imobiliaria();

        imo.addImovel(new Imovel(1000,2,"Glória", 30000,true,null, null));
        imo.addImovel(new Imovel(1001,1,"Vera Cruz", 25000,false,null,null));
        imo.addImovel(new Imovel(1002,3,"Santa Joana", 32000,true,null,null));
        imo.addImovel(new Imovel(1003,2,"Aradas", 24000,true,null,null));
        imo.addImovel(new Imovel(1004,2,"São Bernardo", 20000,true,null,null));
        imo.startLeilao(new DateYMD(3,4,2023), new DateYMD(3, 5, 2023), imo.getImovelIndex(2));
        imo.startLeilao(new DateYMD(3,4,2023), new DateYMD(3, 5, 2023), imo.getImovelIndex(3));

        System.out.println(imo);

    }
    
}
