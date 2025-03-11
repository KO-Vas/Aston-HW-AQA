public class Main {
    public static void main(String[] args) {
        // Создание животных
        Dog bobik = new Dog("Бобик");
        Cat murzik = new Cat("Мурзик");

        bobik.run(150);   // Бобик пробежал 150 м.
        bobik.swim(5);    // Бобик проплыл 5 м.
        murzik.run(250);  // Мурзик не может пробежать 250 м.
        murzik.swim(1);   // Мурзик не умеет плавать.

        // Счётчики
        System.out.println("Животных: " + Animal.getAnimalCount()); // 2
        System.out.println("Собак: " + Dog.getDogCount());          // 1
        System.out.println("Котов: " + Cat.getCatCount());          // 1

        // Проверка миски
        Bowl bowl = new Bowl(25);
        Cat[] cats = {
                new Cat("Васька"),
                new Cat("Рыжик"),
                new Cat("Пушок")
        };

        for (Cat cat : cats) {
            cat.eat(bowl, 10); // Каждому коту нужно 10 еды
        }

        // Сытость котов
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт? " + !cat.isHungry());
        }

        // Добавление еды
        bowl.addFood(15); // Теперь в миске 15 еды
        cats[0].eat(bowl, 10); // Васька поел
    }
}