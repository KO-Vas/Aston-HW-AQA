public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isHungry = true;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int requiredFood) {
        if (bowl.decreaseFood(requiredFood)) {
            isHungry = false;
            System.out.println(getName() + " поел.");
        } else {
            System.out.println(getName() + " не смог поесть. Недостаточно еды.");
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    public static int getCatCount() {
        return catCount;
    }
}