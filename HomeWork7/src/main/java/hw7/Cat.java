package hw7;

public class Cat {

    private String name;
    private int appetite;
    private boolean fed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFed() {
        return fed;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fed=false;
    }
    public void eat(Plate p) {

        fed=p.decreaseFood(appetite);
        System.out.println(name+"  "+(fed==true ? "сыт" : "голоден"));
    }

    public static void eatArr(Cat[] a, Plate p) {
        for (Cat e : a) {
            e.eat(p);
        }
    }

}
