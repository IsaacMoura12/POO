package Aula11;

public class Voo {
    protected String f_number;
    protected String time;
    protected String origin;
    protected String delay;

    Voo(String f_number, String time, String origin, String delay){

        assert f_number.length()>0;
        assert time.length()>0;
        assert origin.length()>0;
        this.f_number = f_number;
        this.time = time;
        this.origin = origin;
        this.delay = delay;
    }

    public String getNumber(){
        return f_number;
    }

    public String getTime(){
        return time;
    }

    public String getOrigin(){
        return origin;
    }

    public String getDelay(){
        return delay;
    }

    public void setDelay(String del){
        this.delay = del;
    }
    
}
