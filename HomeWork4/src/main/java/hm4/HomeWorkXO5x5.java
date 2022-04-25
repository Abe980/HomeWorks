package hm4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkXO5x5 {

    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Игра закончена");
    }

    // проверка победы
    public static boolean checkWin(char symb) {
        for (int i=0; i<SIZE; i++) {
            int sum = 0, sumD = 0, sumI = 0, sumDv = 0, sumDn = 0, sumIv = 0, sumIn = 0;
            for (int j=0; j<SIZE; j++) {
                if (map[i][j] == symb) {
                    sum +=1;
                } else {
                    sum = 0;
                }
                if (sum==DOTS_TO_WIN)  {
                    return true;
                }
                // гл диагональ
                if (i==j && map[i][j] == symb) {
                    sumD +=1;
                } else {
                    sumD = 0;
                }
                // верхняя диагональ
                if (i==j-1 && map[i][j] == symb) {
                    sumDv +=1;
                }
                // нижняя диагональ
                if (i-1==j && map[i][j] == symb) {
                    sumDn +=1;
                }
                // другая гл диагональ
                if (i+j==SIZE-1 && map[i][j] == symb) {
                    sumI +=1;
                } else {
                    sumI = 0;
                }
                // др верхняя диагональ
                if (i+j==SIZE-2 && map[i][j] == symb) {
                    sumIv +=1;
                }
                // др нижняя диагональ
                if (i+j==SIZE && map[i][j] == symb) {
                    sumIn +=1;
                }
                if (sumD==DOTS_TO_WIN || sumDn==DOTS_TO_WIN || sumDv==DOTS_TO_WIN || sumI==DOTS_TO_WIN || sumIv==DOTS_TO_WIN || sumIn==DOTS_TO_WIN)  {
                    return true;
                }
            }
        }

        for (int j=0; j<SIZE; j++) {
            int sum = 0;
            for (int i=0; i<SIZE; i++) {
                if (map[i][j] == symb) {
                    sum +=1;
                } else {
                    sum = 0;
                }
                if (sum==DOTS_TO_WIN)  {
                    return true;
                }
            }
        }
        return false;
    }

    // некуда ходить
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // ход ИИ
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    // ход человека
    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)

        map[y][x] = DOT_X;
    }

    // проверка корректности координат
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    // начальное поле
    public static void initMap() {

        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // печатать поле
    public static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
