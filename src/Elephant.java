import java.util.Random;

public class Elephant extends Animal {
    public Elephant() {
        super("Voi", "Rất Lớn", 100);
    }
    @Override
    public void run() {
        System.out.println(" có thể tấn công. Rất khỏe");
    }
    // tính sát thương của voi khi tấn công người chơi
    @Override
    public void attack(Hunter hunter) {
        Random random = new Random();
        if (random.nextBoolean()) { // voi có 50% tấn công lại
            System.out.println(name + " tấn công lại");
            int damage = 40;
            hunter.Attacked(damage);
        }
    }
    // tính sức khỏe của voi khi bị tấn công
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " nhận " + damage + " sát thương. Sức khỏe còn lại: " + health);
    }
}
