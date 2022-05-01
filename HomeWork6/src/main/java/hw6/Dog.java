package hw6;

public class Dog extends Animals {

    private static int scoreDog;

    public static int getScoreDog() {
        return scoreDog;
    }

    public static void setScoreDog(int scoreDog) {
        Dog.scoreDog = scoreDog;
    }

    public Dog(String name) {
        super(name);
        scoreDog++;
    }

    public void run(int dis) {

        if (dis<0) {
            System.out.println(getName()+". Не корректно указана дистанция для бега");
        } else if (dis>500) {
            System.out.println(getName()+" столько не пробежит");
        } else {
            System.out.println(getName()+" пробежал "+dis+" м.");
        }
    }

    public void swim(int dis) {

        if (dis<0) {
            System.out.println(getName()+". Не корректно указана дистанция для плаванья");
        } else if (dis>10) {
            System.out.println(getName()+" столько не проплывет");
        } else {
            System.out.println(getName()+" проплыл "+dis+" м.");
        }
    }


}