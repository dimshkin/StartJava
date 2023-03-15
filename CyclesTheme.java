public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Задача 1. Подсчет суммы четных и нечетных чисел\n");
        int number = 1;
        int result = -11;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        do {
            result += number;
            if (result % 2 == 0) {
                sumEvenNumber += result;
            } else {
                sumOddNumber += result;
            }
        } while (result < 21);
        System.out.println("В промежутке [-10; 21] сумма четных чисел: " + sumEvenNumber + ", " +
                "сумма нечетных чисел: " + sumOddNumber + ".");

        System.out.println("\n\n Задача 2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int a = 10, b = 5, c = -1;
        int maxNumber = 0;
        int minNumber = 0;

        if (a > b && a > c) {
            maxNumber = a;
            System.out.println("Максимальное число: " + maxNumber);
        }
        if (b > a && b > c) {
            maxNumber = b;
            System.out.println("Максимальное число: " + maxNumber);
        } else {
            minNumber = c;
            System.out.println("Минимальное число: " + minNumber);
        }
        if (a < b && a < c) {
            minNumber = a;
            System.out.println("Минимальное число: " + minNumber);
        }
        if (b < a && b < c) {
            minNumber = a;
            System.out.println("Минимальное число: " + minNumber);
        }
        for (int i = 10; i > -2; i--) {
            System.out.print(i + ", ");
        }

        System.out.println("\n\n Задача 3. Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int reverse = 0;
        int sum = 0;

        while (num != 0) {
            reverse = num % 10;
            System.out.print(reverse + "");
            num /= 10;
            sum += reverse;
        }
        System.out.println("\nСумма цифр числа: " + sum);

        System.out.println("\n\n Задача 4. Вывод чисел на консоль в несколько строк\n");
        int count = 0;

        for (int i = 1; i <= 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count % 5 == 0) {
                System.out.print("\n");
            }
        }
        count = 5 - count % 5;
        for (int i = 0; i < count; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n Задача 5. Проверка количества двоек на четность/нечетность\n");
        int digit = 3242592;
        int numberCopy = digit;
        int countTwo = 0;

        while(digit != 0){
            if (digit % 10 == 2) {
                countTwo++;
            }
            digit /= 10;
        }
        if (countTwo % 2 == 0) {
            System.out.println("Число " + numberCopy + " содержит " + countTwo + 
                    " четное количество двоек");
        } else {
            System.out.println("Число " + numberCopy + " содержит " + countTwo + 
                    " нечетное количество двоек");
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
            if (finish < 0) finish = -finish;
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
                System.out.print("   " + (char)i + "\n");
            }
        }
        for (int i = 97; i <= 122; ++i) {
            if (i % 2 == 0) {
                System.out.printf("%3d", i);
                System.out.print("   " + (char)i + "\n");
            }
        }

        System.out.println("\n\n Задача 8. Отображение ASCII-символов\n");
        int numberPalindrom = 1234321;
        int reverseNumber = 0;
        int remainder = 0;
        int palindromNumber = numberPalindrom;

        while (palindromNumber != 0) {
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