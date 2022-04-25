package hm4;

/*
не самый умный ИИ, чтобы доработать надо расписать частные случаи для первых двух ходов...
но тогда его нельзя будет обыграть (в варианте 3х3)
проверка победы "наивная", более продвинутые в версиях 5х5
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWorkXO3x3WithAI {

    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
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

    // условия победы
    public static boolean checkWin(char symb) {
        for (int i=0; i<SIZE; i++) {
            int sum = 0;
            for (int j=0; j<SIZE; j++) {
                if (map[i][j] == symb) {
                    sum +=1;
                } else break;
            }
            if (sum==DOTS_TO_WIN)  {
                return true;
            }
        }

        for (int j=0; j<SIZE; j++) {
            int sum = 0;
            for (int i=0; i<SIZE; i++) {
                if (map[i][j] == symb) {
                    sum +=1;
                } else break;
            }
            if (sum==DOTS_TO_WIN)  {
                return true;
            }
        }

        int sumD = 0, sumI = 0;
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                if (i==j && map[i][j] == symb) {
                    sumD +=1;
                }
                if (i+j==SIZE-1 && map[i][j] == symb) {
                    sumI +=1;
                }
            }
        }
        if (sumD==DOTS_TO_WIN || sumI==DOTS_TO_WIN)  {
            return true;
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
        for (int i=0; i<SIZE; i++) {
            int sum = 0, sumAI=0;
            for (int j=0; j<SIZE; j++) {
                if (map[i][j] == DOT_O) {
                    sumAI +=1;
                }
                if (map[i][j] == DOT_X) {
                    sum +=1;
                }
                if (sum==DOTS_TO_WIN-1 && sumAI==0) {
                    y = i;
                    do {
                        x = rand.nextInt(SIZE);
                    } while (!isCellValid(x, y));
                    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT_O;
                    return;
                }
            }
        }
        for (int j=0; j<SIZE; j++) {
            int sum = 0, sumAI=0;
            for (int i=0; i<SIZE; i++) {
                if (map[i][j] == DOT_O) {
                    sumAI +=1;
                }
                if (map[i][j] == DOT_X) {
                    sum +=1;
                }
                if (sum==DOTS_TO_WIN-1 && sumAI==0) {
                    x = j;
                    do {
                        y = rand.nextInt(SIZE);
                    } while (!isCellValid(x, y));
                    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT_O;
                    return;
                }
            }
        }
        int sum1 = 0, sumAI1=0;
        for (int i=0; i<SIZE; i++) {

            for (int j=0; j<SIZE; j++) {
                if (i==j && map[i][j] == DOT_O) {
                    sumAI1 +=1;
                }
                if (i==j && map[i][j] == DOT_X) {
                    sum1 +=1;
                    System.out.println(sum1);
                }
                if (sum1==DOTS_TO_WIN-1 && sumAI1==0) {
                    do {
                        y = rand.nextInt(SIZE);
                        x = y;
                    } while (!isCellValid(x, y));
                    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT_O;
                    return;
                }
            }
        }
        int sum2 = 0, sumAI2=0;
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                if (i+j==SIZE-1 && map[i][j] == DOT_O) {
                    sumAI2 +=1;
                }
                if (i+j==SIZE-1 && map[i][j] == DOT_X) {
                    sum2 +=1;
                }
                if (sum2==DOTS_TO_WIN-1 && sumAI2==0) {
                    do {
                        x = rand.nextInt(SIZE);
                        y = SIZE-1-x;
                    } while (!isCellValid(x, y));
                    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT_O;
                    return;
                }
            }
        }
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


    public static boolean isCellValid(int x, int y) {

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }


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
