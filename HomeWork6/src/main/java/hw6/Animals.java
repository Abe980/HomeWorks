package hw6;

public abstract class Animals {

    private String name;
    private static int score;

    public Animals (String name) {
        this.name = name;
        score++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Animals.score = score;
    }

    public abstract void run (int d);

    public abstract void swim (int d);
}
