package hw7;

public class Main {

    public static void main(String[] args) {
        Cat bar = new Cat("Барсик", 5);
        Plate plate = new Plate("Тарелка", 100);
        plate.info();
        bar.eat(plate);
        plate.info();
        System.out.println();

        Cat [] arrCat = new Cat[3];
            arrCat[0] = new Cat("Мурзик", 7);
            arrCat[1] = new Cat("Мурка", 4);
            arrCat[2] = new Cat("Пушок", 12);

        Plate plateSmall = new Plate("Маленькая тарелка", 20);

        plateSmall.info();
        Cat.eatArr(arrCat, plateSmall);
        plateSmall.info();
        System.out.println();

        plateSmall.addFood(8);
    }

}
