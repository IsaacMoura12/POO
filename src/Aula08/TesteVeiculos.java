package Aula08;

import Aula08.Motociclo.Tipo;

public class TesteVeiculos {
    public static void main(String[] args) {

        Veiculo[] frota = new Veiculo[5];
        frota[0] = new Motociclo("RE-00-LA", "FIAT", "SS", 50,Tipo.desportivo, 1500);
        frota[1] = new AutomovelLigeiro("11-CB-12", "VW", "GOLF", 90,20000,200);
        frota[2] = new Taxi("AA-12-12", "MERCEDES", "CLA", 140, 200000, 300, 12345);
        frota[3] = new PesadoMercadorias("BB-KG-69", "VOLVO", "A300", 300, 500000, 4500, 3900);
        frota[4] = new PesadoPassageiros("EH-LA-00", "RENAULT", "B20", 777, 175000, 8000, 65);

        Empresa empresa = new Empresa("Transportes Ilimitados Limitantes", "3700-200", "alugaPopo@limite.pt", frota);

        System.out.println(empresa);
        System.out.println("\nFrota:\n");
        empresa.listFrota(empresa);

        // testes




    }
    
}
