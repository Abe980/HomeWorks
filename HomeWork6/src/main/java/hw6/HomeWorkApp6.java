package hw6;

public class HomeWorkApp6 {

    public static void main(String[] args) {

        Dog bob = new Dog ("Бобик");
        bob.run(150);
        bob.swim(11);

        Dog shar = new Dog ("Шарик");
        shar.run(-3);
        shar.swim(7);

        Dog tuz = new Dog ("Тузик");
        tuz.run(75);
        tuz.swim(2);

        Cat bar = new Cat ("Барсик");
        bar.run(100);
        bar.swim(7);

        Cat mur = new Cat ("Мурзик");
        mur.run(50);
        mur.swim(7);

        System.out.println("Всего животных: "+Animals.getScore());
        System.out.println("Собак: "+Dog.getScoreDog());
        System.out.println("Котов: "+Cat.getScoreCat());

    }
}
