public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 6);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat();
        plate.setFood(plate.getFood() - cat.getAppetite());
        // System.out.printf("Кот поел и насытился. В тарелке осталось %d еды.\n", plate.info());
    }
    
}
