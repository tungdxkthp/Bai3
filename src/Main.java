import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo người chơi
        Hunter hunter = new Hunter("Tùng", "Súng");
        // mảng chứa khởi tạo các đối tượng thú
        Animal[] animals = {new Deer(), new Lion(), new Elephant()};
        //Animal[] animals = {new Lion(), new Elephant()};
        //Animal animal = new Deer();
        Random rand = new Random();
        //
        for(int i=0; i<10; i++) {
            Animal animal = animals[rand.nextInt(animals.length)];
            hunter.hunt(animal);

            if(hunter.getHealth() <= 0) {
                System.out.println("Thợ săn đã chết. Kết thúc trò chơi");
                break;
            }
            /*if(animal.health < 0 ) {
                break;
            }*/
        }
        System.out.println("Điểm số của " + hunter.getName() + ": " + hunter.getScore());
    }
}