package hw1;

public class HomeWorkApp {
    public static void main (String [] args) {
        printThreeWords();
        checkSumSign();
        prinyColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    public static void checkSumSign() {
        int a = 11;
        int b = -22;

        if ((a+b)>=0) {
            System.out.println ("Сумма положительная");
        } else {
            System.out.println ("Сумма отрицательная");
        }
    }

    public static void prinyColor() {
        int value=5;

        if (value<=0) {
            System.out.println ("Красный");
        }
        if (value<=100) {
            System.out.println ("Желтый");
        }
        if (value>100) {
            System.out.println ("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a=1, b=3;
        if (a>=b) {
            System.out.println ("a>=b");
        } else {
            System.out.println ("a<b");
        }
    }
}
