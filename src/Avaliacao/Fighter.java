package Avaliacao;

public abstract class Fighter {
    protected String nome;
    protected int vida;
    protected int vitorias;
    protected int derrotas;

    Fighter(String nome, int vida, int vitorias, int derrotas){
        assert nome.length()>0;
        this.nome = nome;
        assert vida >=0;
        this.vida = vida;
        assert vitorias>=0;
        this.vitorias = vitorias;
        assert derrotas>=0;
        this.derrotas = derrotas;
    }

    public String getNome(){
        return nome;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int damage){
        vida = vida - damage;
    }

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int ganhou){
        vitorias++;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public void setDerrotas(int perdeu){
        derrotas++;
    }


    public boolean isAlive(){
        if(vida>0){
            return true;
        }
        return false;
    }

    public abstract void attack(Fighter figther);



    @Override
    public String toString(){
        return "Wrestler " + nome + " : (" + getVitorias()+ "W / " + getDerrotas() + "L)";
    }


    @Override
    public boolean equals(Object other){
        if(!(other instanceof Fighter))
        return false;
        Fighter that = (Fighter) other;
        return this.nome.equals(that.nome);

    }

    
}
