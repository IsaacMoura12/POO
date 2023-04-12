package Aula08;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoCompras implements Compra {
    protected List<Produto> carrinho;

    CarrinhoCompras(){
        carrinho = new ArrayList<>();
    }


    @Override
    public void adicionarProduto(Produto produto, int quantidade){
        for (Produto p : carrinho){
            if(p.equals(produto)){
                p.adicionarQuantidade(quantidade);
                return;   
            }
        }
        produto.adicionarQuantidade(quantidade);
        carrinho.add(produto);
    }

    @Override
    public void listarProdutos(){
        for (Produto p : carrinho){
            System.out.println(p);
        }
    }

    @Override
    public double calcularTotal(){
        double total = 0;
        for (Produto p : carrinho){
            total = total + p.getPreco() * p.getQuantidade();
        }
        return total;
    }




    
}
