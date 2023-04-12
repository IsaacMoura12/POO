package Aula08;

public class ProdutoGenerico implements Produto {
    protected String nome;
    protected int stock;
    protected double preco;


    ProdutoGenerico(String nome, int stock, double preco){
        assert nome.length()>0;
        assert stock>=0;
        assert preco >0;
        this.nome = nome;
        this.preco = preco;
        this.stock = stock;
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public double getPreco(){
        return preco;
    }

    @Override
    public int getQuantidade(){
        return stock;
    }

    @Override
    public void adicionarQuantidade(int quantidade){
        this.stock = this.stock + quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade){
        assert stock >= quantidade;
        this.stock = this.stock - quantidade;
    }


    @Override
    public String toString(){
        return "Produto: " + nome + " , Stock: " + stock + ", Preço: " + preco;
    }


    @Override
    public boolean equals(Object other){
        if(!(other instanceof ProdutoGenerico))
        return false;
        ProdutoGenerico that = (ProdutoGenerico) other;
        return this.nome == that.nome  && this.preco == that.preco;
    }
    
}
