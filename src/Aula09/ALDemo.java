package Aula09;
import  Aula06.Pessoa;
import Aula05.DateYMD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;




public class ALDemo {
public static void main(String[] args) {

ArrayList<Integer> c1 = new ArrayList<>();

for (int i = 10; i <= 100; i+=10)
        c1.add(i);
        System.out.println("Size: " + c1.size());

for (int i = 0; i < c1.size(); i++)
        System.out.println("Elemento: " + c1.get(i));



        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        System.out.println("-----------------------------------------------------------\n");


    

        Set<Pessoa> c3 = new HashSet<>();

        c3.add(new Pessoa("Isaac", 1234567, new DateYMD(16, 2, 2002)));
        c3.add(new Pessoa("Ana", 1234568, new DateYMD(10, 12, 2009)));
        c3.add(new Pessoa("Mariana", 1234569, new DateYMD(14, 12, 2001)));
        c3.add(new Pessoa("Maria", 1234560, new DateYMD(27, 2, 2000)));
        c3.add(new Pessoa("Francisco", 1234561, new DateYMD(11, 5, 1999)));

        // Teste Elem repetido - Não vai inserir.

        c3.add(new Pessoa("Francisco", 1234561, new DateYMD(11, 5, 1999)));

        for(Pessoa pessoa : c3){
            System.out.println(pessoa);
        }

        System.out.println("-------------------------------");



        // CLASSE DATE NECESSITA DE IMPLEMENTAR COMPARABLE PARA ESTAR NUM SORTED_SET
        //Set<Aula07.Date> c4 = new TreeSet<>();

        //c4.add(new Aula07.DateYMD(1, 0, 0));
        //c4.add(new Aula07.DateYMD(2,1,2002));
        //c4.add(new Aula07.DateYMD(3,1,2002));
        //c4.add(new Aula07.DateND(1, 1, 2000, 10));
        //c4.add(new Aula07.DateYMD(5,1,2002));
    
    

    }
}