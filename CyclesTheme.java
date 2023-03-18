public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println(" Задача 1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -11;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        do {
            counter += 1;
            if (counter % 2 == 0) {
                sumEvenNumber += counter;
            } else {
                sumOddNumber += counter;
            }
        } while (counter < 21);
        System.out.println("В промежутке [-10; 21] сумма четных чисел: " + sumEvenNumber + ", " +
                "сумма нечетных чисел: " + sumOddNumber + ".");

        System.out.println("\n\n Задача 2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int a = 10, b = 5, c = -1;
        int maxNumber = 10;
        int minNumber = -1;
        System.out.println("Минимальное число: " + minNumber + "; Максимальное число: " + maxNumber );
        for (int i = 10; i > -2; i--) {
            System.out.print(i + ", ");
        }

        System.out.println("\n\n Задача 3. Вывод реверсивного числа и суммы его цифр\n");
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
            sum += digit;
        }
        System.out.println("\nСумма цифр числа: " + sum);

        System.out.println("\n\n Задача 4. Вывод чисел на консоль в несколько строк\n");
        int count = 0;
        int nullChek;

        for (int i = 1; i <= 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
            nullChek = 5 - count % 5;
            if (count % 5 == 0) {
            } else {
                for (int i = 0; i < nullChek; i++) {
                    System.out.printf("%3d", 0);
                }
            }

        System.out.println("\n\n Задача 5. Проверка количества двоек на четность/нечетность\n");
        int numberChek = 3242592;
        int copyNumber = numberChek;
        int countTwos = 0;

        while(numberChek > 0) {
            if (numberChek % 10 == 2) {
                countTwos++;
            }
            numberChek /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + copyNumber + " содержит " + 
                    countTwos + " четное количество двоек");
        } else {
            System.out.println("Число " + copyNumber + " содержит " + 
                    countTwos + " нечетное количество двоек");
        }

        System.out.println("\n\n Задача 6. Отображение фигур в консоли\n");
        int rectangle = 10;

        for (int i = 5; i < rectangle; i++) {
            for (int j = 0; j < rectangle; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        int numberStrings = 5;
        char numberSign = '#';
        int countStrings = 0;

        while (numberStrings >= countStrings) {
            int j = 0;
            while (j++ < numberStrings - countStrings ) {
                System.out.print(numberSign);
            }
            System.out.print("\n");
            countStrings++;
        }

        int maxNumberChar = 3;
        int starting = -maxNumberChar + 1;
        do {
            int numberStartChar = 1;
            int finish = starting;
            if (finish < 0) finish = - finish;
            do {
                System.out.print('$');
                ++numberStartChar;
            } while (numberStartChar <= maxNumberChar - finish);
            System.out.println();
            ++starting;
        } while (starting <= maxNumberChar - 1);

        System.out.println("\n\n Задача 7. Отображение ASCII-символов\n");
        System.out.println("Dec" + " Char");
        for (int i = 1; i <= 47; ++i) {
            if (i % 2 != 0 ) {
                System.out.printf("%3d", i );
                System.out.print("   " + (char) i + "\n");
            }
        }
        for (int i = 97; i <= 122; ++i) {
            if (i % 2 == 0) {
                System.out.printf("%3d", i);
                System.out.print("   " + (char) i + "\n");
            }
        }

        System.out.println("\n\n Задача 8. Отображение ASCII-символов\n");
        int numberPalindrom = 1234321;
        int reverseNumber = 0;
        int remainder = 0;
        int palindromNumber = numberPalindrom;

        while (palindromNumber > 0) {
            remainder = palindromNumber % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            palindromNumber = palindromNumber / 10;
        }
        if (numberPalindrom == reverseNumber) {
            System.out.println(reverseNumber + " Палиндром");
        } else {
            System.out.println(reverseNumber + " Не является палиндромом");
        }

        System.out.println("\n\n Задача 9. Определение, является ли число счастливым\n");
        int sum1 = 0;
        int sum2 = 0;
        int numberCheck = 857986;
        int countNumber = 0;

        while (numberCheck != 0) {
            if (countNumber < 3) {
                sum2 += numberCheck % 10;
            } else {
                sum1 += numberCheck % 10;
            }
            countNumber++;
            numberCheck /= 10;
        }
        if (sum1 == sum2) {
            System.out.println("Сумма цифр 857 = " + sum1 + " Сумма цифр 986 "
                    + sum2 + " число счастливое");
        } else {
            System.out.println("Сумма цифр 857 = " + sum1 + " Сумма цифр 986 "
                    + sum2 + " число несчастливое");
        }

        System.out.println("\n\n Задача 10. Вывод таблицы умножения Пифагора\n");
        System.out.println("  |   2  3  4  5  6  7  8  9 " +  "\n" + "----------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d",(j * i),"\t");
            }
            System.out.println();
        }

        }
    }