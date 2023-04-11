package Aula08;

import java.util.Scanner;

import Aula08.Carne.Variedade;
import Aula08.Peixe.Tipo;

import java.util.ArrayList;
import java.util.List;

public class EmentaTester {
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        // inicializaçoes: 

        List <Carne> carnes = new ArrayList<>();
        List <Peixe> peixes = new ArrayList<>();
        List <Cereal> cereais = new ArrayList<>();
        List <Legume> legumes = new ArrayList<>();
        List<Prato> pratos = new ArrayList<>();



        Ementa ementa = new Ementa("Ementa", "Universidade Aveiro");






        while(true){
            System.out.println("\nOperações:");
            System.out.println("1 - Adicionar Ingredientes");
            System.out.println("2 - Pratos");
            System.out.println("3 - Ementa");
            System.out.println("0 - Sair");
            System.out.println("\nOption: ");

            int option = sc.nextInt();


            if(option ==1){
                while(true){
                    System.out.println("1 - Adicionar Carne");
                    System.out.println("2 - Adicionar Peixe");
                    System.out.println("3 - Adicionar Cereal");
                    System.out.println("4 - Adicionar Legume");
                    System.out.println("0 - Voltar");
                    System.out.println("\nOption: ");
                    int select = sc.nextInt();

                    if(select == 1){
                        System.out.println("Tipo de Carne:");
                        System.out.println("vaca, porco, peru, frango, outra");
                        String tipo = sc.nextLine();

                       
                        Variedade variedade = Variedade.valueOf(tipo);
                        

                        System.out.println("Calorias:");
                        double cal = sc.nextDouble();
                        while(cal <= 0){
                            System.out.println("Calorias Inválidas!");
                            System.out.println("Calorias");
                            cal = sc.nextDouble();
                        }

                        System.out.println("Peso (gr):");
                        double peso = sc.nextDouble();

                        while(peso <=0){
                            System.out.println("Peso Inválido!");
                            System.err.println("Peso (gr):");
                            peso = sc.nextDouble();

                        }

                        


                        System.out.println("Proteína:");
                        double proteina = sc.nextDouble();

                        while(proteina<=0){
                            System.out.println("Proteína Inválida!");
                            System.out.println("Proteína:");
                            proteina = sc.nextDouble();
                        }

                        // calculos para valor de 100gr

                        double tmp = peso/100;
                        proteina = proteina * tmp;
                        cal = cal * tmp;

                        Carne carne = new Carne(proteina, cal, peso, variedade);
                        carnes.add(carne);
                        System.out.println("Carne Adicionada!");


                    }else if(select == 2){


                        System.out.println("Tipo de Peixe:");
                        System.out.println("congelado, fresco");
                        String tipo = sc.nextLine();

                        
                        Tipo variedade =  Tipo.valueOf(tipo);

                        System.out.println("Calorias:");
                        double cal = sc.nextDouble();
                        while(cal <= 0){
                            System.out.println("Calorias Inválidas!");
                            System.out.println("Calorias");
                            cal = sc.nextDouble();
                        }

                        System.out.println("Peso (gr):");
                        double peso = sc.nextDouble();

                        while(peso <=0){
                            System.out.println("Peso Inválido!");
                            System.err.println("Peso (gr):");
                            peso = sc.nextDouble();

                        }

                        


                        System.out.println("Proteína:");
                        double proteina = sc.nextDouble();

                        while(proteina<=0){
                            System.out.println("Proteína Inválida!");
                            System.out.println("Proteína:");
                            proteina = sc.nextDouble();
                        }

                        // calculos para valor de 100gr

                        double tmp = peso/100;
                        proteina = proteina * tmp;
                        cal = cal * tmp;
                        
                        Peixe peixe = new Peixe(proteina, cal, peso, variedade);
                        peixes.add(peixe);
                        System.out.println("Peixe Adicionado!");


                        
                    } else if(select == 3){


                        System.out.println("Tipo de Cereal:");
                        String tipo = sc.nextLine();
                        while(tipo.length()<=0){
                            System.out.println("Cereal Inválido!");
                            System.out.println("Tipo de Cereal:");
                            tipo = sc.nextLine();

                        }

                        System.out.println("Calorias:");
                        double cal = sc.nextDouble();
                        while(cal <= 0){
                            System.out.println("Calorias Inválidas!");
                            System.out.println("Calorias");
                            cal = sc.nextDouble();
                        }

                        System.out.println("Peso (gr):");
                        double peso = sc.nextDouble();

                        while(peso <=0){
                            System.out.println("Peso Inválido!");
                            System.err.println("Peso (gr):");
                            peso = sc.nextDouble();

                        }

                        


                        System.out.println("Proteína:");
                        double proteina = sc.nextDouble();

                        while(proteina<=0){
                            System.out.println("Proteína Inválida!");
                            System.out.println("Proteína:");
                            proteina = sc.nextDouble();
                        }

                        // calculos para valor de 100gr

                        double tmp = peso/100;
                        proteina = proteina * tmp;
                        cal = cal * tmp;
                        
                        Cereal cereal = new Cereal(proteina, cal, peso, tipo);
                        cereais.add(cereal);
                        System.out.println("Cereal Adicionado!");

                    } else if(select == 4){

                        System.out.println("Tipo de Legume:");
                        String tipo = sc.nextLine();
                        while(tipo.length()<=0){
                            System.out.println("Legume Inválido!");
                            System.out.println("Tipo de Legume:");
                            tipo = sc.nextLine();

                        }

                        System.out.println("Calorias:");
                        double cal = sc.nextDouble();
                        while(cal <= 0){
                            System.out.println("Calorias Inválidas!");
                            System.out.println("Calorias");
                            cal = sc.nextDouble();
                        }

                        System.out.println("Peso (gr):");
                        double peso = sc.nextDouble();

                        while(peso <=0){
                            System.out.println("Peso Inválido!");
                            System.err.println("Peso (gr):");
                            peso = sc.nextDouble();

                        }

                        


                        System.out.println("Proteína:");
                        double proteina = sc.nextDouble();

                        while(proteina<=0){
                            System.out.println("Proteína Inválida!");
                            System.out.println("Proteína:");
                            proteina = sc.nextDouble();
                        }

                        // calculos para valor de 100gr

                        double tmp = peso/100;
                        proteina = proteina * tmp;
                        cal = cal * tmp;
                        
                        Legume legume = new Legume(proteina, cal, peso, tipo);
                        legumes.add(legume);
                        System.out.println("Legume Adicionado!");


                    }else if(select ==0){
                        break;

                    }else {
                        System.out.println("Operação Inválida!");

                    }





                }






            } else if( option == 2){

                while(true){
                    System.out.println("1 - Criar Prato");
                    System.out.println("2 - Apagar Prato");
                    System.out.println("3 - Alterar Prato");
                    System.out.println("0 - Voltar");
                    System.out.println("\nOption: ");
                    int select = sc.nextInt();

                    if(select==1){


                    }else if(select==2){

                    }else if(select ==3){

                    }else if(select== 0){
                        break;

                    } else {
                        System.out.println("Operação Inválida!");


                    }

                }

            } else if(option == 3){

            } else if(option == 0){
                break;
            } else {
                System.out.println("Operação Inválida!");
            }




        }
        
    }
    
}
