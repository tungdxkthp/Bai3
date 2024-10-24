import java.util.Random;

public class Lion extends Animal {
    public Lion() {
        super("Sử tử", "Lớn", 50);
    }
    @Override
    public void run() {
        System.out.println(name + " có thể tấn công, chạy nhanh");
    }
    @Override
    public void attack(Hunter hunter) {
        Random random = new Random();
        if(random.nextBoolean()) { // sư tử có 50% tấn công lại
            System.out.println(name + " tấn công lại");
            int damage = 20;
            hunter.Attacked(damage);
        }
    }
    // tính sức khỏe của sư tử
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " nhận " + damage + " sát thương. Sức khỏe còn lại: " + health);
    }
}
