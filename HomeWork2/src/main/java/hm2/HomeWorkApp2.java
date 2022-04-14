package hm2;

public class HomeWorkApp2 {

    public static void main(String[] args) {

        System.out.println(sum(14, -5));

        pn(8);

        System.out.println(pnB(-2));

        prT("Что-то", 4);

        int year=2300;
        boolean l=leap(year);
        System.out.println(l);
        if (l==true) {
            System.out.println(year+" - високосный");
        } else {
            System.out.println(year+" - не високосный");
        }

    }

    public static boolean sum(int a, int b) {
        if (a+b<10 || a+b>20) {
            return false;
        } else {
            return true;
        }
    }

    public static void pn(int c) {
        if (c<0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }

    public static boolean pnB(int d) {
        if (d<0) {
            return true;
        } else {
            return false;
        }
    }

    public static void prT(String t, int k) {
        for (int i=1; i<=k; i++) {
            System.out.println(t);
        }
    }

    public static boolean leap(int y) {

        if (y%4!=0 || (y%100==0 && y%400!=0)) {
            return false;
        } else {
            return true;
        }
    }
}
