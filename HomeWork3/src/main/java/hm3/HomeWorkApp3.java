package hm3;

public class HomeWorkApp3 {

    public static void main(String [] args) {

        // задание 1
        System.out.println("Задание 1");
        int [] intArr = {1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0};

        print1DArray(intArr);

        for (int i=0; i<intArr.length; i++) {
            if (intArr[i]==1) {
                intArr[i]=0;
            } else if (intArr[i]==0) {
                intArr[i]=1;
            } else {
                System.out.println("Некорректно задан элемент массива "+i);
            }
        }

        print1DArray(intArr);
        System.out.println();

        // задание 2
        System.out.println("Задание 2");
        int [] arr100 = new int[100];

        for (int i=0; i<arr100.length; i++) {
            arr100[i]=i+1;
            System.out.print(arr100[i]+" ");
        }
        System.out.println();
        System.out.println();


        // задание 3
        System.out.println("Задание 3");
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        print1DArray(arr);

        for (int i=0; i<arr.length; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2;
            }
        }

        print1DArray(arr);
        System.out.println();

        // задание 4
        System.out.println("Задание 4");
        int index=5;
        int [][] table = new int [index][index];
        for (int i=0; i<index; i++) {
            for (int j=0; j<index; j++) {
                if (i==j || (i+j)==index-1) {
                    table[i][j]=1;
                } else {
                    table[i][j]=0;
                }
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // задание 5
        System.out.println("Задание 5");
        int [] arrLenValue=lenValue(8, 1);
        print1DArray(arrLenValue);
        System.out.println();

        // задание 6
        System.out.println("Задание 6");
        int [] oArr= {3, 7, 2, 8, 3, 2};
        int min=oArr[0], max=oArr[0];
        for (int i=0; i<oArr.length-1; i++) {
            if (oArr[i]<min) {
                min=oArr[i];
            } else if (oArr[i]>max) {
                max=oArr[i];
            }
        }
        System.out.print("Минимальный(е) элемент(ы) с индексом:");
        for (int i=0; i<oArr.length; i++) {
            if (oArr[i]==min) {
                System.out.print(" "+i+",");
            }
        }
        System.out.println(" и значением "+min);
        System.out.print("Максимальный(е) элемент(ы) с индексом:");
        for (int i=0; i<oArr.length; i++) {
            if (oArr[i]==max) {
                System.out.print(" "+i+",");
            }
        }
        System.out.println(" и значением "+max);
        System.out.println();

        // задание 7
        System.out.println("Задание 7");
        int [] eqArr = {12, 2, 4, 1, 5};
        print1DArray(eqArr);
        System.out.println(equalParts(eqArr));
        System.out.println();

        /*
        задание 8, два варианта
        Вариант1 если нужна демонстрация смещения и в одну сторону и в другую.
        Вариант2 приведение к смещению только в одну сторону(если важен только результат
        */
        System.out.println("Задание 8 Вариант1");
        int [] arrOffSet = {1, 2, 3, 4, 5, 6, 7};
        print1DArray(arrOffSet);
        int n=-2;
        n=n%arrOffSet.length;
        System.out.println(n);

        if (n>=0) {
            for (int j=0; j<n; j++) {
                int temp=arrOffSet[0];
                for (int i=0; i<arrOffSet.length-1; i++) {
                    arrOffSet[i]=arrOffSet[i+1];
                }
                arrOffSet[arrOffSet.length-1]=temp;
            }
        } else {
            for (int j=0; j<-n; j++) {
                int temp=arrOffSet[arrOffSet.length-1];
                for (int i=arrOffSet.length-1; i>0; i--) {
                    arrOffSet[i]=arrOffSet[i-1];
                }
                arrOffSet[0]=temp;
            }
        }
        print1DArray(arrOffSet);

        System.out.println("Задание 8 Вариант2");
        int [] arrOffSet2 = {1, 2, 3, 4, 5, 6, 7};
        print1DArray(arrOffSet2);
        int n2=-2;
        n2=n2%arrOffSet2.length;
        System.out.println(n2);
        if (n2<0) {
            n2=n2+arrOffSet2.length;
        }
        System.out.println(n2);
        for (int j=0; j<n2; j++) {
            int temp2=arrOffSet2[0];
            for (int i=0; i<arrOffSet2.length-1; i++) {
                arrOffSet2[i]=arrOffSet2[i+1];
            }
            arrOffSet2[arrOffSet2.length-1]=temp2;
        }
        print1DArray(arrOffSet2);


    }

    // печать одномерного массива
    public static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // к заданию 5
    public static int[] lenValue (int len, int initialValue) {
        int [] lV = new int[len];
        for (int i=0; i<len; i++) {
            lV[i]=initialValue;
        }
        return lV;
    }

    // к заданию 7
    public static boolean equalParts(int xArr[]) {
        int sum=0, lSum=0;
        for (int i=0; i<xArr.length; i++) {
            sum +=xArr[i];
        }
        for (int i=0; i<xArr.length-1; i++) {
            lSum +=xArr[i];
            if (lSum==sum/2) {
                return true;
            }
        }
        return false;
    }
}
