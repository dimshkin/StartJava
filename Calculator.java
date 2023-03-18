public class Calculator {
    public static void main(String[] args) {

        System.out.println("Задача 1. Калькулятор\n");
        int a = 4;
        int b = 2;
        int result = 1;
        char sign = '^';

        if (a < 0 && b < 0) {
            System.out.println("Введенное число является отрицательным, введите другое число");
        } else {
            if (sign == '+') {
                int sum = a + b;
                result = sum;
            } else if (sign == '-') {
                int sum = a - b;
                result = sum;
            } else if (sign == '*') {
                int sum = a * b;
                result = sum;
            } else if (sign == '/') {
                int sum = a / b;
                result = sum;
            } else if (sign == '%') {
                int sum = a % b;
                result = sum;
            } else if (sign == '^') {
                int sum = 1;
                for (int i = 1; i <= b; i++)
                    sum *= a;
                result = sum;
            }
        }
        System.out.println(a + " " + sign + "  " + b + " = " + result);

        System.out.println("Задача 2. Угадай число\n");
        int compNumber = 2;
        int humanNumber = 2;

        for (int i = 1; i <= compNumber; ++i) {

        }
            if (compNumber == humanNumber) {
                System.out.println("Вы победили!");

            } else if (compNumber < humanNumber) {
                System.out.println("Число " + humanNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + humanNumber + " меньше того, что загадал компьютер");
            }
        }
    }