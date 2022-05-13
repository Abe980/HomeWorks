package hw7;

public class Plate {

    private int food;
    private String titlePlate;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public String getTitlePlate() {
        return titlePlate;
    }

    public void setTitlePlate(String titlePlate) {
        this.titlePlate = titlePlate;
    }

    public Plate(String titlePlate, int food) {
        this.titlePlate = titlePlate;
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food>=n) {
            food -= n;

            return true;
        } else {
            System.out.println ("Недостаточно еды");
            return false;
        }
    }
    public void info() {
        System.out.println(titlePlate+": " + food);
    }

    public void addFood (int f) {
        System.out.println(titlePlate+"  "+food);
        System.out.println("Добавляем "+f+" еды");
        food += f;
        System.out.println(titlePlate+"  "+food);
    }

}
