package Aula08;

public class ProdutoDesconto extends ProdutoGenerico{
    protected int desconto;


    ProdutoDesconto(String nome, int stock, double preco, int desconto){
        super(nome, stock, preco);

        assert desconto>0;
        this.desconto = desconto;

    }

    @Override
    public double getPreco(){
        double tmp = preco * desconto/100;
        preco = preco - tmp;
        return preco;
    }

    @Override
    public String toString(){
        return "Produto Descontado: " + nome + " , Stock: " + stock + ", Preço: " + preco + ", Desconto:" + desconto;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof ProdutoDesconto))
        return false;
        ProdutoDesconto that = (ProdutoDesconto) other;
        return this.nome == that.nome  && this.preco == that.preco && this.desconto == that.desconto;
    }
    
}
