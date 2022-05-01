package hw6;

public class Cat extends Animals {

    private static int scoreCat;

    public static int getScoreCat() {
        return scoreCat;
    }
    public static void setScoreCat(int scoreCat) {
        Cat.scoreCat = scoreCat;
    }
    public Cat(String name) {
        super(name);
        scoreCat++;
    }
    public void run (int dis) {

        if (dis<0) {
            System.out.println(getName()+". Не корректно указана дистанция для бега");
        } else if (dis>200) {
            System.out.println(getName()+" столько не пробежит");
        } else {
            System.out.println(getName()+" пробежал "+dis+" м.");
        }
    }

    public void swim(int dis) {

        System.out.println(getName()+" не умеет плавать.");

    }
}
