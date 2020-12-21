public class Portion extends BaseObject{
    int value;
    private String name;
    public Portion (int value){
        this.value=value;
       // this.name = name;
    }
    public void setValue(int value){this.value=value;}
    public int getValue(){
        return value;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
