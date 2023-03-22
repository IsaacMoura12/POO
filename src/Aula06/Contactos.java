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

    public void removeContactoId(int id){
        int control = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId()==id){
                lista.remove(i);
                System.out.println("Contacto Removido.");
                control++;
            }       
        } if(control == 0){
            System.out.println("Não existe contacto com id" + id);
        }

    }

    public void removeContactoIndex(int index){
        if(lista.get(index)==null){
            System.out.println("Não existe contacto neste indice!!");
        }else {
            lista.remove(index);
        }
    }

    public void removeContacto(int telemovel){
        int control = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getTel()==telemovel){
                lista.remove(i);
                System.out.println("Contacto Removido.");
                control++;
            }       
        } if(control == 0){
            System.out.println("Não existe contacto com o telemovel" + telemovel);
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


    public void alterarContactoId(int id,Pessoa pessoa, int tel, String email){
        
        int index = procurarIndex(id);

        if(index !=-1){
            lista.get(index).setEmail(email);
            lista.get(index).setPessoa(pessoa);
            lista.get(index).setTel(tel);
        }
        

        
        
        //int control = 0;
        //for (int i = 0; i < lista.size(); i++) {
            //Contacto tmp = lista.get(i);
            //if(tmp.getId()==id){
                //lista.get(i).setEmail(email);
                //lista.get(i).setPessoa(pessoa);
                //lista.get(i).setTel(tel);
                //control++;
            //}   
        //} if(control ==0){
            //System.out.println("Nenhum contacto com id " + id);
        //}

    }

    
    public Contacto procurarContactoid(int id) {
        for (Contacto c : lista) {
            if (c.getId() == id) {
                return c;
            }
        }
        System.out.println("Contacto com id " + id + " não encontrado.");
        return null;
    }

    public int procurarIndex(int id) {
        for (int i = 0; i < lista.size(); i++) {
            //Contacto c = lista.get(i);
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    

    public void procurarContactotmp(String nome){
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


    public List<Contacto> procurarContacto(String nome){
        List<Contacto> matchingContacts = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            Contacto tmp = lista.get(i);
            if(tmp.getNomePessoa().equals(nome)){
                matchingContacts.add(tmp);
            }
        } if(!(matchingContacts.isEmpty())){
            return matchingContacts;
        } else {
            return null;
        }

    }

    public void procurarContactotmp(int telemovel){
        int control = 0;
        for (int i = 0; i < lista.size(); i++) {
            Contacto tmp = lista.get(i);
            if(tmp.getTel()==telemovel){
                control++;
                System.out.println(tmp);
            }          
        } if(control == 0){
            System.out.println("Contacto com telemovel " + telemovel + " não encontrado.");
        }
    }

    public List<Contacto> procurarContacto(int telemovel){
        List<Contacto> matchingContacts = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            Contacto tmp = lista.get(i);
            if(tmp.getTel()==telemovel){
                matchingContacts.add(tmp); // add matching contacts to the list
            }          
        } if(!(matchingContacts.isEmpty())){
            return matchingContacts;
        } else {
            return null;
        }
        
    }

    public List<Contacto> procurarContactoEmail(String email) {
        List<Contacto> matchingContacts = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            Contacto tmp = lista.get(i);
            if(tmp.getEmail().equals(email)){
                matchingContacts.add(tmp);
            }
        } 
        if(!matchingContacts.isEmpty()){
            return matchingContacts;
        } else {
            return null;
        }
    }

    public List<Contacto> listarContactos(){
        return lista;
    }

    public int getSize(){
        return lista.size();
    }
    

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
    for (Contacto c : lista) {
        sb.append(c.toString()).append("\n");
    }
    return sb.toString();
    } 
}
