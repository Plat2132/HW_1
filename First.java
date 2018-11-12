

import java.util.Scanner;

class First {
    // task_01
    public static void main(String[] args) {

        // task_1();
        // task_02();
        // task_4();
        //task_05();
        //task_16();
        //task_19();
        //task_ad();
        //task_6();
        //task_7();
        //task_9();
        //task_10();
        //task_11();
    }

    public static void task_1() {
        Scanner in = new Scanner(System.in);

        double ves;
        double massa;

        System.out.print("Введите ваш вес (в кг)= ");
        massa = in.nextDouble();

        ves = (massa * 16) / 100;

        System.out.println("Ваш вес на Луне= " + ves + " Кг");
    }

    public static void task_4() {
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }

        int whileOperator = 1;
        while (whileOperator <= 100) {
            if (whileOperator % 2 == 0) {
                System.out.println(whileOperator);
            }
            whileOperator++;
        }

        do {

            if (whileOperator % 2 == 0) {
                System.out.println(whileOperator);
            }
            whileOperator--;
        } while (whileOperator > 100);

    }

    public static void task_02() {
        int[] num = new int[2];

        num[0] = 20;

        num[1] = 100;

        for (int i = 0; i < num.length; i++) {

            num[i] = (int) (num[i] * 1.1);

            System.out.println(num[i]);
        }
    }

    public static void task_05() {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task_16() {
        for (int i = 0; i < 101; i += 10) {
            System.out.println(i);
        }
    }

    public static void task_19() {
        Scanner in = new Scanner(System.in);
        double dolcor = 2.10;
        double rub;
        System.out.println(" Введите сумму в рублях ");
        rub = in.nextDouble();
        System.out.println(rub + " рублей в $ " + rub / dolcor);

    }

    public static void task_ad() {
        Scanner in = new Scanner(System.in);
        int sec;
        int min;
        int hour;
        int days;
        System.out.println("Введите количесвто дней");
        days = in.nextInt();
        hour = days * 24;
        min = hour * 60;
        sec = min * 60;
        System.out.println("Количество часов = " + hour + "\nСекунды = " + sec + "\nМинуты = " + min);
    }

    public static void task_6() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void task_7() {
        int sum = 0;
        for (int i = 20; i <= 200; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    public static void task_9() {
        int one = 2;
        int two = 5;
        int temp = one;

        one = two;
        two = temp;

        System.out.println(one + " " + two);
    }

    public static void task_10() {
        int a = 3;
        int b = 6;
        int c = a + b;
        System.out.println(c);
    }

    public static void task_11() {
        int a = 2;
        int b = 3;
        int c = 1;
        int x;

    }
}





