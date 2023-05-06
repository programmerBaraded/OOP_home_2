import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        
        Plate plate = new Plate(100);
        plate.info();
        Cat cat1 = new Cat("Murzik", 26, true);
        Cat cat2 = new Cat("Garry", 30, true);
        Cat cat3 = new Cat("Funtik", 40, true);
        Cat cat4 = new Cat("Pupsik", 15, true);
        Cat cat5 = new Cat("Puffnutiy", 15, true);
        Cat cat6 = new Cat("Garfield", 40, true);

        Cat[] cats = new Cat[] {cat1, cat2, cat3, cat4, cat5, cat6};

        for (Cat cat : cats) {
            while (true) {
                if (cat.eat(cat.getAppetite(), plate.getFood()) & cat.getCatHunger()) {
                    plate.setFood(plate.leftFood(cat.getAppetite(), plate.getFood()));
                    cat.setCatHunger(false);
                    System.out.printf("%s поел и теперь сыт. \n", cat.getName());
                    plate.info();
                    break;
                }
                else{
                    System.out.printf("%s остался голодным. \n", cat.getName());
                    System.out.println("Насыпь коту корм или оставь его голодать. \n");
                    System.out.printf("1 - выберете досыпать корм \n" +
                    "2 - оставить %s голодным \n", cat.getName());
                    Scanner scan = new Scanner(System.in);
                    int choice = scan.nextInt();
                    if (choice != 1)
                        break;            
                    else {
                        System.out.println("Выберете сколько корма вы хотите добавить в тарелку.");
                        plate.AddFood(scan.nextInt());
                        plate.info();
                    }
              
                }
            }
        }
        for (Cat cat : cats) {
            if (cat.getCatHunger())
                System.out.printf("%s так и не поел и остался голодным. \n", cat.getName());
        }
    }
    
}
