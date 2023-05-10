package Aula11;

import java.io.IOException;

public class AirportTester {
    public static void main(String[] args) throws IOException {

        Aeroporto report = new Aeroporto();

        report.loadCompanhias("src/Aula11/companhias.txt");
        report.loadVoos("src/Aula11/voos.txt");


        report.generateReport("src/Aula11/Infopublico.txt");
        //report.generateReport();
    }
    
}
