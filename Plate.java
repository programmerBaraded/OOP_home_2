public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void info(){
        System.out.println("plate: " + food);
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

    public int leftFood(int appetite, int food) {
        food -= appetite;
        return food;
    }

    public void AddFood(int addFood){
        if (addFood >= 0) {
            this.food += addFood;
        }
    }
}
