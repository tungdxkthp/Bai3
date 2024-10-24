public class Deer extends Animal {
    public Deer() {
        super("Hươu", "Nhỏ", 30);
    }

    @Override
    public void run() {
        System.out.println(name + " không tấn công, chạy nhanh");
    }
    @Override
    public void attack(Hunter hunter) {} // hươu không tâ công lại
    @Override
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " nhận " + damage + " sát thương. Sức khỏe còn: " + health);
    }
}
