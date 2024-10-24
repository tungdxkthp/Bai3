// lớp trừu tượng Animal
public abstract class Animal {
    protected String name;
    protected String size;
    protected int health;
    // Constructor
    public Animal(String name, String size, int health) {
        this.name = name;
        this.size = size;
        this.health = health;
    }
    //
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getHealth() {
        return health;
    }
    //phương thức trừu tượng run()
    public abstract void run();
    //Có phương thức trừu tượng attack() để biểu diễn hành vi tấn công của con thú khi nó phản ứng lại người chơi.
    public abstract void attack(Hunter hunter);
    //Có phương thức takeDamage(int damage) để con thú nhận sát thương khi bị tấn công.
    public abstract void takeDamage(int damage);


}
