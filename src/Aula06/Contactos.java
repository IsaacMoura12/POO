package Aula06;
import java.util.List;
import java.util.ArrayList;

public class Contactos {
    private List<Contacto> lista;

    public Contactos(){
        lista = new ArrayList<>();
    }

    public void addContacto(Contacto contacto){
        if(lista.contains(contacto)){
            System.out.println("Contacto já existe");
        } else {
            lista.add(contacto);
        }
    }

    public void removeContacto(Contacto contacto){
        if (!lista.contains(contacto)){
            System.out.println("Contacto não existe!");
        } else {
            lista.remove(contacto);
        }
    }

    public void removeContacto(int id){
        int control = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId()==id){
                lista.remove(i);
                System.out.println("Contacto Removido.");
                control++;
            }       
        } if(control == 0){
            System.out.println("Não existe contacto com o id" + id);
        }
    }

    public void removeContacto(String nome){
        int control = 0;
        for (int i = 0; i < lista.size(); i++) {
            Contacto tmp = lista.get(i);
            if(tmp.getNomePessoa().equals(nome)){
                lista.remove(i);
                control++;
                System.out.println("Contacto Removido.");
            }   
        } if(control == 0) {
            System.out.println("Não existe contacto com o nome " + nome);
        }

    }


    // usa o procurar contacto
    public void alterarContactoId(int id){
        for (int i = 0; i < lista.size(); i++) {
            Contacto tmp = lista.get(i);
            //if()
            
        }

    }

    


    public void alterarContactoNome(Contacto contacto, String nome){

    }


    public void procurarContacto(String nome){
        int control = 0;
        for (int i = 0; i < lista.size(); i++) {
            Contacto tmp = lista.get(i);
            if(tmp.getNomePessoa().equals(nome)){
                control++;
                System.out.println(tmp);
                
            } 
            
        } if(control == 0){
            System.out.println("Contacto com nome " + nome + " não encontrado.");

        }
        
    }

    public void procurarContacto(int id){
        int control = 0;
        for (int i = 0; i < lista.size(); i++) {
            Contacto tmp = lista.get(i);
            if(tmp.getId()==id){
                control++;
                System.out.println(tmp);
            }          
        } if(control == 0){
            System.out.println("Contacto com id " + id + " não encontrado.");
        }
    }


    
}
