public class Hunter {
    private String name;
    private String weapon; // vũ khí (cung hoặc súng)
    private int health; // sức khỏe
    private int score; // điểm
    // constructor
    public Hunter(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
        this.health = 100;
        this.score = 0;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public int getHealth() {
    return health;
    }

    // tính điểm của con vật
    public void scoreAnimal(Animal animal) {
        if(animal instanceof Deer) {
            score += 20;
        }
        else if(animal instanceof Lion) {
            score += 50;
        } else if (animal instanceof Elephant) {
            score += 100;
        }
        System.out.println(name + " đã săn được " + animal.getName() + ". Tổng điểm: " + score);
    }
    // tính sức khỏe của người chơi khi bị tấn công
    public void Attacked(int damage) {
        health -= damage;
        System.out.println("Người chơi " + name + " nhận " + damage + " sát thương. Sức khỏe còn lại: " + health);
    }
    // tính damage cho thợ săn
    public void hunt(Animal animal) {
        // equals() dùng để so sánh chuỗi
        int damage = weapon.equals("Súng") ? 30 : 10; // damage súng là 40, damage cung là 20
        System.out.println(name + " săn " + animal.getName() + " với vũ khí " + weapon + ".");
        animal.takeDamage(damage);
        //
        if(animal.getHealth() > 0) {
            animal.attack(this);
        }
        else {
            scoreAnimal(animal);
        }
    }
}
