package Aula09;

public class  Plane {
    protected String id;
    protected String fabricante;
    protected String modelo;
    protected int ano;
    protected int maxPassageiros;
    protected int maxVelocidade;



    public Plane(String id, String fabricante, String modelo, int ano, int maxPassageiros, int maxVelocidade){

        assert id.length()>0;
        assert fabricante.length()>0;
        assert modelo.length()>0;
        assert ano >0;
        assert maxPassageiros>0;
        assert maxVelocidade>0;

        this.id = id;
        this.modelo= modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.maxPassageiros = maxPassageiros;
        this.maxVelocidade = maxVelocidade;
    }
    public String getPlaneType(){
        return "";
    }

    public String getFabricante(){
        return fabricante;
    }

    public String getId(){
        return id;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public int getMaxPax(){
        return maxPassageiros;
    }

    public int getMaxVel(){
        return maxVelocidade;
    }

    @Override
    public String toString(){
        return "Aircraft " + id + ": " + fabricante + " " + modelo + "| Year: " + ano + " MaxPax: " + maxPassageiros + ", MaxVel: " + maxVelocidade;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Plane))
        return false;
        Plane that = (Plane) other;
        return this.id.equals(that.id);

    }
}
