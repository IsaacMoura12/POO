package Aula06;
import java.util.Scanner;
import utils.User_input;
import Aula05.DateYMD;
import java.util.List;
import java.util.ArrayList;

// VERSAO INCOMPLETA!!
//
//

public class TesteContactos {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Contactos contacts = new Contactos();
        Aluno a1 = new Aluno("Isaac",100,new DateYMD(1, 1, 1),new DateYMD(1, 1, 1));
        Professor p1 = new Professor("Paulo", 1000,new DateYMD(1, 1, 1),"Informática","Informática");
        contacts.addContacto(new Contacto(a1,911021312,"isaac.moura@ua.pt"));
        contacts.addContacto(new Contacto(p1,937416036,"email@ua.pt"));



        while(true){
            System.out.println("\nOperações:");
            System.out.println("1 - Inserir Contacto");
            System.out.println("2 - Alterar Contacto");
            System.out.println("3 - Apagar Contacto");
            System.out.println("4 - Procurar Contacto");
            System.out.println("5 - Listar Contactos");
            System.out.println("0 - Sair");
            System.out.println("\nOption: ");

            int option = sc.nextInt();



            if(option==1){
                System.out.println("\nInserir Contacto");
                System.out.println("1 - Inserir Aluno");
                System.out.println("2 - Inserir Professor");
                int select = sc.nextInt();

                if(select==1){
                    // NOME
                    System.out.println("Nome:");
                    String nome = sc.nextLine();

                    while(User_input.countDigits(nome)!=0 || nome.length()==0){
                        System.out.println("Nome Iválido!");
                        System.out.println("Nome:");
                        nome = sc.nextLine();
                    }

                    // CC
                    System.out.println("CC:");
                    int cc = sc.nextInt();
                    while(cc<=0){
                        System.out.println("CC Inválido!");
                        System.out.println("CC:");
                        cc = sc.nextInt();
                    }

                    // DATA NASCIMENTO
                    System.out.println("Data de Nascimento:");
                    System.out.println("Dia:");
                    int day = sc.nextInt();
                    System.out.println("Mês:");
                    int month = sc.nextInt();
                    System.out.println("Ano:");
                    int year = sc.nextInt();

                    while(!(User_input.validDateYMD(day,month,year))){
                    
                    System.out.println("Data Inválida!");
                    System.out.println("Dia:");
                    day = sc.nextInt();
                    System.out.println("Mês:");
                    month = sc.nextInt();
                    System.out.println("Ano:");
                    year = sc.nextInt();
                    }

                    DateYMD datanasc = new DateYMD(day, month, year);


                      // DATA INSCRIÇÃO
                      System.out.println("Data de Inscrição:");
                      System.out.println("Dia:");
                      int dia = sc.nextInt();
                      System.out.println("Mês:");
                      int mes = sc.nextInt();
                      System.out.println("Ano:");
                      int ano = sc.nextInt();
  
                      while(!(User_input.validDateYMD(dia,mes,ano))){
                      
                      System.out.println("Data Inválida!");
                      System.out.println("Dia:");
                      dia = sc.nextInt();
                      System.out.println("Mês:");
                      mes = sc.nextInt();
                      System.out.println("Ano:");
                      ano = sc.nextInt();
                      }
  
                      DateYMD dataInsc = new DateYMD(dia, mes, ano);

                      Aluno aluno = new Aluno(nome, cc, datanasc,dataInsc);

                      // NUMERO TELEMOVEL
                      System.out.println("Insira número Telemóvel:");
                      int tel = sc.nextInt();

                      while(!(User_input.isTelemovelPT(tel))){
                        System.out.println("Número de Telemóvel Inválido!");
                        System.out.println("Número Telemóvel");
                        tel = sc.nextInt();
                      }

                      // EMAIL
                      System.out.println("Insira endereço Email:");
                      String email = sc.next();

                      while(!(User_input.isValidEmail(email))){
                        System.out.println("Endereço Email Errado!");
                        System.out.println("Endereço Email:");
                        email = sc.next();
                      }

                     // CRIAÇAO CONTACTO COMPLETO
                     Contacto contacto = new Contacto(aluno,tel,email);

                     // INSERÇÃO NA LISTA DE CONTACTOS
                     contacts.addContacto(contacto);

                }else if(select == 2) {

                    // NOME
                    System.out.println("Nome:");
                    String nome = sc.next();
                    while(User_input.countDigits(nome)!=0 || nome.length()==0){
                        System.out.println("Nome Iválido!");
                        System.out.println("Nome:");
                        nome = sc.next();
                    }

                    // CC
                    System.out.println("CC:");
                    int cc = sc.nextInt();
                    while(cc<=0){
                        System.out.println("CC Inválido!");
                        System.out.println("CC:");
                        cc = sc.nextInt();
                    }

                    // DATA NASCIMENTO
                    System.out.println("Data de Nascimento:");
                    System.out.println("Dia:");
                    int day = sc.nextInt();
                    System.out.println("Mês:");
                    int month = sc.nextInt();
                    System.out.println("Ano:");
                    int year = sc.nextInt();

                    while(!(User_input.validDateYMD(day,month,year))){
                    
                    System.out.println("Data Inválida!");
                    System.out.println("Dia:");
                    day = sc.nextInt();
                    System.out.println("Mês:");
                    month = sc.nextInt();
                    System.out.println("Ano:");
                    year = sc.nextInt();
                    }

                    DateYMD datanasc = new DateYMD(day, month, year);


                    // CATEGORIA PROFESSOR
                    System.out.println("Categoria:");
                    String cat = sc.next();

                    while(cat.length()==0){
                        System.out.println("Categoria:");
                        cat = sc.next();
                    }

                    // DEPARTAMENTO
                    System.out.println("Departamento:");
                    String dep = sc.next();

                    while(dep.length()==0){
                        System.out.println("Departamento:");
                        dep = sc.next();
                    }

                    // CRIAR PROFESSOR
                    Professor professor = new Professor(nome, cc, datanasc, cat, dep);


                    // NUMERO TELEMOVEL
                    System.out.println("Insira número Telemóvel:");
                    int tel = sc.nextInt();

                    while(!(User_input.isTelemovelPT(tel))){
                      System.out.println("Número de Telemóvel Inválido!");
                      System.out.println("Número Telemóvel");
                      tel = sc.nextInt();
                    }

                    // EMAIL
                    System.out.println("Insira endereço Email:");
                    String email = sc.next();

                    while(!(User_input.isValidEmail(email))){
                      System.out.println("Endereço Email Errado!");
                      System.out.println("Endereço Email:");
                      email = sc.next();
                    }

                    // CRIAÇAO CONTACTO COMPLETO
                    Contacto contacto = new Contacto(professor,tel,email);

                    // INSERÇÃO NA LISTA DE CONTACTOS
                    contacts.addContacto(contacto);

                } else {
                    break;
                }



            } else if(option == 2){
                System.out.println("Alterar Contacto");
                System.out.println("1 - Procurar por Telemóvel");
                System.out.println("2 - Procurar por Email");
                int select = sc.nextInt();
                
                if(select == 1){
                    System.out.println("Insira Telemóvel:");
                    int tele = sc.nextInt();
                    while(!(User_input.isTelemovelPT(tele))){
                        System.out.println("Número de Telemóvel Inválido!");
                        System.out.println("Número Telemóvel");
                        tele = sc.nextInt();
                      }

                    List<Contacto> match = contacts.procurarContacto(tele);



                    if(match==null){
                        System.out.println("\nNão existe contacto com Telemóvel " + tele);
                    } else if(match.size()==1){
                        System.out.println("\nContacto Encontrado.");
                        //System.out.println(match);

                        // para alterar é necessario verificar
                        // se estamos perante um prof ou aluno!!

                        System.out.println(match.get(0));
                        int index = match.get(0).getId();

                        // TESTES:
                        //System.out.println(a);
                        //int index = contacts.procurarIndex(match.get(0).getId());
                        //System.out.println(index);
                        //int index = contacts.lista.indexOf(match.get(0));
                        //System.out.println(contacts);

                        System.out.println("\nContacto a alterar:");
                        System.out.println("1 - É Aluno");
                        System.out.println("2 - É Professor");
                        int choice = sc.nextInt();

                if(choice==1){
                    // NOME
                    System.out.println("Nome:");
                    String nome = sc.next();
                    while(User_input.countDigits(nome)!=0 || nome.length()==0){
                        System.out.println("Nome Iválido!");
                        System.out.println("Nome:");
                        nome = sc.next();
                    }

                    // CC
                    System.out.println("CC:");
                    int cc = sc.nextInt();
                    while(cc<=0){
                        System.out.println("CC Inválido!");
                        System.out.println("CC:");
                        cc = sc.nextInt();
                    }

                    // DATA NASCIMENTO
                    System.out.println("Data de Nascimento:");
                    System.out.println("Dia:");
                    int day = sc.nextInt();
                    System.out.println("Mês:");
                    int month = sc.nextInt();
                    System.out.println("Ano:");
                    int year = sc.nextInt();

                    while(!(User_input.validDateYMD(day,month,year))){
                    
                    System.out.println("Data Inválida!");
                    System.out.println("Dia:");
                    day = sc.nextInt();
                    System.out.println("Mês:");
                    month = sc.nextInt();
                    System.out.println("Ano:");
                    year = sc.nextInt();
                    }

                    DateYMD datanasc = new DateYMD(day, month, year);


                      // DATA INSCRIÇÃO
                      System.out.println("Data de Inscrição:");
                      System.out.println("Dia:");
                      int dia = sc.nextInt();
                      System.out.println("Mês:");
                      int mes = sc.nextInt();
                      System.out.println("Ano:");
                      int ano = sc.nextInt();
  
                      while(!(User_input.validDateYMD(dia,mes,ano))){
                      
                      System.out.println("Data Inválida!");
                      System.out.println("Dia:");
                      dia = sc.nextInt();
                      System.out.println("Mês:");
                      mes = sc.nextInt();
                      System.out.println("Ano:");
                      ano = sc.nextInt();
                      }
  
                      DateYMD dataInsc = new DateYMD(dia, mes, ano);

                      Aluno aluno = new Aluno(nome, cc, datanasc,dataInsc);

                      // NUMERO TELEMOVEL
                      System.out.println("Insira número Telemóvel:");
                      int tel = sc.nextInt();

                      while(!(User_input.isTelemovelPT(tel))){
                        System.out.println("Número de Telemóvel Inválido!");
                        System.out.println("Número Telemóvel");
                        tel = sc.nextInt();
                      }

                      // EMAIL
                      System.out.println("Insira endereço Email:");
                      String email = sc.next();

                      while(!(User_input.isValidEmail(email))){
                        System.out.println("Endereço Email Errado!");
                        System.out.println("Endereço Email:");
                        email = sc.next();
                      }

                     // CRIAÇAO CONTACTO COMPLETO
                     //Contacto contacto = new Contacto(aluno,tel,email);

                     // Alteraçao NA LISTA DE CONTACTOS
                     contacts.alterarContactoId(index,aluno,tel,email);
                     

                }else if(choice == 2) {

                    // NOME
                    System.out.println("Nome:");
                    String nome = sc.next();
                    while(User_input.countDigits(nome)!=0 || nome.length()==0){
                        System.out.println("Nome Iválido!");
                        System.out.println("Nome:");
                        nome = sc.next();
                    }

                    // CC
                    System.out.println("CC:");
                    int cc = sc.nextInt();
                    while(cc<=0){
                        System.out.println("CC Inválido!");
                        System.out.println("CC:");
                        cc = sc.nextInt();
                    }

                    // DATA NASCIMENTO
                    System.out.println("Data de Nascimento:");
                    System.out.println("Dia:");
                    int day = sc.nextInt();
                    System.out.println("Mês:");
                    int month = sc.nextInt();
                    System.out.println("Ano:");
                    int year = sc.nextInt();

                    while(!(User_input.validDateYMD(day,month,year))){
                    
                    System.out.println("Data Inválida!");
                    System.out.println("Dia:");
                    day = sc.nextInt();
                    System.out.println("Mês:");
                    month = sc.nextInt();
                    System.out.println("Ano:");
                    year = sc.nextInt();
                    }

                    DateYMD datanasc = new DateYMD(day, month, year);


                    // CATEGORIA PROFESSOR
                    System.out.println("Categoria:");
                    String cat = sc.next();

                    while(cat.length()==0){
                        System.out.println("Categoria:");
                        cat = sc.next();
                    }

                    // DEPARTAMENTO
                    System.out.println("Departamento:");
                    String dep = sc.next();

                    while(dep.length()==0){
                        System.out.println("Departamento:");
                        dep = sc.next();
                    }

                    // CRIAR PROFESSOR
                    Professor professor = new Professor(nome, cc, datanasc, cat, dep);


                    // NUMERO TELEMOVEL
                    System.out.println("Insira número Telemóvel:");
                    int tel = sc.nextInt();

                    while(!(User_input.isTelemovelPT(tel))){
                      System.out.println("Número de Telemóvel Inválido!");
                      System.out.println("Número Telemóvel");
                      tel = sc.nextInt();
                    }

                    // EMAIL
                    System.out.println("Insira endereço Email:");
                    String email = sc.next();

                    while(!(User_input.isValidEmail(email))){
                      System.out.println("Endereço Email Errado!");
                      System.out.println("Endereço Email:");
                      email = sc.next();
                    }

                    // CRIAÇAO CONTACTO COMPLETO
                    //Contacto contacto = new Contacto(professor,tel,email);

                    // alteraçao NA LISTA DE CONTACTOS
                    contacts.alterarContactoId(index,professor,tel,email);


                } else {
                    break;
                }

                // FIM DO CASO DE APENAS UM CONTACTO COM X TELE
                //TODO

                    }else  {
                        System.out.println("Existem vários contactos com telemóvel" + tele);
                        System.out.println(match);
                        System.out.println("Insira o ID do contacto a alterar:");
                        System.out.println("IMCOMPLETO!!!");
                    }

                    
                // alterar por email
                }else if(select == 2){
                    System.out.println("Insira Email:");
                    String mail = sc.next();

                    while(!(User_input.isValidEmail(mail))){
                        System.out.println("Endereço Email Errado!");
                        System.out.println("Endereço Email:");
                        mail = sc.next();
                      }

                    List<Contacto> match = contacts.procurarContactoEmail(mail);


                    if(match==null){
                        System.out.println("Não existe contacto com Email " + mail);
                    } else if(match.size()==1){
                        System.out.println("Contacto Encontrado.");
                        //System.out.println(match);

                        // para alterar é necessario verificar
                        // se estamos perante um prof ou aluno!!

                        System.out.println(match.get(0));
                        int index = match.get(0).getId();

                        System.out.println("\nContacto a alterar:");
                        System.out.println("1 - É Aluno");
                        System.out.println("2 - É Professor");
                        int choice = sc.nextInt();

                if(choice==1){
                    // NOME
                    System.out.println("Nome:");
                    String nome = sc.next();
                    while(User_input.countDigits(nome)!=0 || nome.length()==0){
                        System.out.println("Nome Iválido!");
                        System.out.println("Nome:");
                        nome = sc.next();
                    }

                    // CC
                    System.out.println("CC:");
                    int cc = sc.nextInt();
                    while(cc<=0){
                        System.out.println("CC Inválido!");
                        System.out.println("CC:");
                        cc = sc.nextInt();
                    }

                    // DATA NASCIMENTO
                    System.out.println("Data de Nascimento:");
                    System.out.println("Dia:");
                    int day = sc.nextInt();
                    System.out.println("Mês:");
                    int month = sc.nextInt();
                    System.out.println("Ano:");
                    int year = sc.nextInt();

                    while(!(User_input.validDateYMD(day,month,year))){
                    
                    System.out.println("Data Inválida!");
                    System.out.println("Dia:");
                    day = sc.nextInt();
                    System.out.println("Mês:");
                    month = sc.nextInt();
                    System.out.println("Ano:");
                    year = sc.nextInt();
                    }

                    DateYMD datanasc = new DateYMD(day, month, year);


                      // DATA INSCRIÇÃO
                      System.out.println("Data de Inscrição:");
                      System.out.println("Dia:");
                      int dia = sc.nextInt();
                      System.out.println("Mês:");
                      int mes = sc.nextInt();
                      System.out.println("Ano:");
                      int ano = sc.nextInt();
  
                      while(!(User_input.validDateYMD(dia,mes,ano))){
                      
                      System.out.println("Data Inválida!");
                      System.out.println("Dia:");
                      dia = sc.nextInt();
                      System.out.println("Mês:");
                      mes = sc.nextInt();
                      System.out.println("Ano:");
                      ano = sc.nextInt();
                      }
  
                      DateYMD dataInsc = new DateYMD(dia, mes, ano);

                      Aluno aluno = new Aluno(nome, cc, datanasc,dataInsc);

                      // NUMERO TELEMOVEL
                      System.out.println("Insira número Telemóvel:");
                      int tel = sc.nextInt();

                      while(!(User_input.isTelemovelPT(tel))){
                        System.out.println("Número de Telemóvel Inválido!");
                        System.out.println("Número Telemóvel");
                        tel = sc.nextInt();
                      }

                      // EMAIL
                      System.out.println("Insira endereço Email:");
                      String email = sc.next();

                      while(!(User_input.isValidEmail(email))){
                        System.out.println("Endereço Email Errado!");
                        System.out.println("Endereço Email:");
                        email = sc.next();
                      }

                     // CRIAÇAO CONTACTO COMPLETO
                     //Contacto contacto = new Contacto(aluno,tel,email);

                     // Alteraçao NA LISTA DE CONTACTOS
                     contacts.alterarContactoId(index,aluno,tel,email);
                     

                }else if(choice == 2) {

                    // NOME
                    System.out.println("Nome:");
                    String nome = sc.next();
                    while(User_input.countDigits(nome)!=0 || nome.length()==0){
                        System.out.println("Nome Iválido!");
                        System.out.println("Nome:");
                        nome = sc.next();
                    }

                    // CC
                    System.out.println("CC:");
                    int cc = sc.nextInt();
                    while(cc<=0){
                        System.out.println("CC Inválido!");
                        System.out.println("CC:");
                        cc = sc.nextInt();
                    }

                    // DATA NASCIMENTO
                    System.out.println("Data de Nascimento:");
                    System.out.println("Dia:");
                    int day = sc.nextInt();
                    System.out.println("Mês:");
                    int month = sc.nextInt();
                    System.out.println("Ano:");
                    int year = sc.nextInt();

                    while(!(User_input.validDateYMD(day,month,year))){
                    
                    System.out.println("Data Inválida!");
                    System.out.println("Dia:");
                    day = sc.nextInt();
                    System.out.println("Mês:");
                    month = sc.nextInt();
                    System.out.println("Ano:");
                    year = sc.nextInt();
                    }

                    DateYMD datanasc = new DateYMD(day, month, year);


                    // CATEGORIA PROFESSOR
                    System.out.println("Categoria:");
                    String cat = sc.next();

                    while(cat.length()==0){
                        System.out.println("Categoria:");
                        cat = sc.next();
                    }

                    // DEPARTAMENTO
                    System.out.println("Departamento:");
                    String dep = sc.next();

                    while(dep.length()==0){
                        System.out.println("Departamento:");
                        dep = sc.next();
                    }

                    // CRIAR PROFESSOR
                    Professor professor = new Professor(nome, cc, datanasc, cat, dep);


                    // NUMERO TELEMOVEL
                    System.out.println("Insira número Telemóvel:");
                    int tel = sc.nextInt();

                    while(!(User_input.isTelemovelPT(tel))){
                      System.out.println("Número de Telemóvel Inválido!");
                      System.out.println("Número Telemóvel");
                      tel = sc.nextInt();
                    }

                    // EMAIL
                    System.out.println("Insira endereço Email:");
                    String email = sc.next();

                    while(!(User_input.isValidEmail(email))){
                      System.out.println("Endereço Email Errado!");
                      System.out.println("Endereço Email:");
                      email = sc.next();
                    }

                    // CRIAÇAO CONTACTO COMPLETO
                    //Contacto contacto = new Contacto(professor,tel,email);

                    // alteraçao NA LISTA DE CONTACTOS
                    contacts.alterarContactoId(index,professor,tel,email);


                } else {
                    break;
                }

                // FIM DO CASO DE APENAS UM CONTACTO COM X TELE
                //TODO

                    }else  {
                        System.out.println("Existem vários contactos o endereço email" + mail);
                        System.out.println(match);
                        System.out.println("Insira o ID do contacto a alterar:");
                        System.out.println("IMCOMPLETO!!!");
                    }


                }else {
                    break;
                }

            // APAGAR CONTACTO
            } else if(option==3){
                System.out.println("Remover Contacto");
                System.out.println("1 - Procurar por Telemóvel");
                System.out.println("2 - Procurar por Email");
                int select = sc.nextInt();


                if(select ==1){
                    System.out.println("Insira Telemóvel:");
                    int tele = sc.nextInt();
                    while(!(User_input.isTelemovelPT(tele))){
                        System.out.println("Número de Telemóvel Inválido!");
                        System.out.println("Número Telemóvel");
                        tele = sc.nextInt();
                      }

                      List<Contacto> match = contacts.procurarContacto(tele);

                      if(match==null){
                        System.out.println("Não existe contacto com Telemóvel " + tele);
                    } else if(match.size()==1){
                        System.out.println("Contacto Removido.");
                        System.out.println(match);

                        // para alterar é necessario verificar
                        // se estamos perante um prof ou aluno!!

                        int index = match.get(0).getId();
                        contacts.removeContactoIndex(index);

       

                // FIM DO CASO DE APENAS UM CONTACTO COM X TELE
                //TODO

                    }else  {
                        System.out.println("Existem vários contactos com telemóvel" + tele);
                        System.out.println(match);
                        System.out.println("Insira o ID do contacto a remover:");
                        System.out.println("IMCOMPLETO!!!");
                    }



                } else if(select == 2){
                    System.out.println("Insira Email:");
                    String mail = sc.next();

                    while(!(User_input.isValidEmail(mail))){
                        System.out.println("Endereço Email Errado!");
                        System.out.println("Endereço Email:");
                        mail = sc.next();
                      }

                    List<Contacto> match = contacts.procurarContactoEmail(mail);


                    if(match==null){
                        System.out.println("Não existe contacto com Email " + mail);
                    } else if(match.size()==1){
                        System.out.println("Contacto Encontrado.");
                        //System.out.println(match);

                        // para alterar é necessario verificar
                        // se estamos perante um prof ou aluno!!

                        int index = match.get(0).getId();
                        contacts.removeContactoIndex(index);

                        

                // FIM DO CASO DE APENAS UM CONTACTO COM X TELE
                //TODO

                    }else  {
                        System.out.println("Existem vários contactos o endereço email" + mail);
                        System.out.println(match);
                        System.out.println("Insira o ID do contacto a remover:");
                        System.out.println("IMCOMPLETO!!!");
                    }


                } else{
                    break;
                }

            } else if(option ==4){
                System.out.println("\nProcurar Contacto");
                System.out.println("1 - Procurar por Telemóvel");
                System.out.println("2 - Procurar por Email");
                int select = sc.nextInt();



                if(select ==1){
                    System.out.println("Insira Telemóvel:");
                    int tele = sc.nextInt();
                    while(!(User_input.isTelemovelPT(tele))){
                        System.out.println("Número de Telemóvel Inválido!");
                        System.out.println("Número Telemóvel");
                        tele = sc.nextInt();
                      }

                      List<Contacto> match = contacts.procurarContacto(tele);

                      if(match==null){
                        System.out.println("Não existe contacto com Telemóvel " + tele);
                    } else{
                        System.out.println("Contacto:");
                        System.out.println(match);
                    }



                } else if(select == 2){
                    System.out.println("Insira Email:");
                    String mail = sc.next();

                    while(!(User_input.isValidEmail(mail))){
                        System.out.println("Endereço Email Errado!");
                        System.out.println("Endereço Email:");
                        mail = sc.next();
                      }

                    List<Contacto> match = contacts.procurarContactoEmail(mail);


                    if(match==null){
                        System.out.println("Não existe contacto com Email " + mail);
                    } else {
                        System.out.println("Contacto:");
                        System.out.println(match);
                    }


                } else{
                    break;
                }
                
            } else if(option == 5){
                System.out.println("Todos os Contactos:");
                System.out.println(contacts);

            } else {
                break;
            }

        }
        sc.close();
        
    }
    
}
