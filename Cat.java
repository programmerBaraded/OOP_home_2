
public class Cat {

    private String name;
    private int appetite;
    private boolean catHunger;

    public Cat (String name, int appetite, boolean catHunger){
        this.name = name;
        this.appetite = appetite;
        this.catHunger = catHunger;
    }
    
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite){
        this.appetite = appetite;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getCatHunger(){
        return catHunger;
    }
    public void setCatHunger(boolean catHunger){
        this.catHunger = catHunger;
    }
    public boolean eat(int appetite, int food){
        if (appetite >= food)
            return false;
        else
            return true;
    }
}