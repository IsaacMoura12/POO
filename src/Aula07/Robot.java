package Aula07;

public class Robot extends ObjetoMovel{
    protected String id;
    protected String type; // fazer com enum
    protected int goals;




    Robot(int x, int y , int distance, String id, String type, int goals){
        super(x,y,distance);
        assert id.length()>0;
        this.id = id;
        assert type.length()>0;
        this.type = type;
        assert goals >=0;
        this.goals = goals;

    }   


    public String getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public int getGoals(){
        return goals;
    }


    public void scoreGoal(){
        goals++;
    }

    // 2 robots na mesma coordenada 
    public boolean robotColision(Robot other){

        if(this.id != other.id){
        if(this.x == other.x && this.y == other.y){
            return true;
        } else {
            return false;
        }
    }
    return false;
    }

    @Override
    public String toString(){
        return "Robot Id: " + id + " is at coordinates: (" + x + "," + y + ")" + " and distance:" + distance; 
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Robot))
        return false;
        Robot that = (Robot) other;
        return this.id == that.id;
    }
    
}
