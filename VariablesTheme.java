public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n\nЗадание 1. Вывод значений переменных на консоль\n");

        byte ram = 8;
        short videoCard = 1536;
        int processor = 2600;
        long hard = 262_144L;
        float monitorInch = 13.3f;
        double mind = 101.8432;
        char osХ = 120;
        boolean happy = true;

        System.out.println("1" + "." + " " + "Вывод значений переменных на консоль");
        System.out.println(ram + " " + "Gb" + " " + "-" + " " + "Оперативная память");
        System.out.println(videoCard + " " + "MHz" + " " + "-" + " " + "Видеокарта");
        System.out.println(processor + " " + "MHz" + " " + "-" + " " + "Процессор");
        System.out.println(hard + " " + "Mb" + " " + "-" + " " + "Жесткий диск");
        System.out.println(monitorInch + " " + "inch" + " " + "-" + " " + "Монитор");
        System.out.println(mind + " " + "Gb" + " " + "-" + " " + "Свободной памяти");
        System.out.println(osХ + " " + "OS Операционная система");
        System.out.println("Ноутбук работает" + " " + "-" + " " + "it's" + " " + happy + "!");

        System.out.println("\n\nЗадание 2. Расчет стоимости товара со скидкой\n");

        int bookPrice = 200;
        int penPrice = 100;
        int pricePrecent = 11;
        int sumGoods = bookPrice + penPrice;
        int discountPrice = sumGoods * pricePrecent / 100;

        System.out.println("Сумма скидки" + " " + sumGoods  + " " + "руб.");
        System.out.println("Стоимость товаров со скидкой" + " " + (sumGoods - discountPrice) + " " +
                "руб.");

        System.out.println("\nЗадание 3. Вывод слова JAVA \n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nЗадание 4. Вывод min и max значений целых числовых типов\n");

        byte byteMax = 127;

        System.out.println("Максимальное значение byte " + byteMax + "\nИнкремент " + (++byteMax)
                + "\nДекремент " + (--byteMax));

        short shortMax = 32_767;

        System.out.println("\nМаксимальное значение short " + shortMax + "\nИнкремент " + 
                (++shortMax) + "\nДекремент " + (--shortMax));

        int intMax = 2_147_483_647;

        System.out.println("\nМаксимальное значение int " + intMax + "\nИнкремент " + (++intMax)
                + "\nДекремент " + (--intMax));

        long longMax = 9_223_372_036_854_775_807L;

        System.out.println("\nМаксимальное значение long " + longMax + "\nИнкремент " + (++longMax)
                + "\nДекремент " + (--longMax));

        System.out.println("\nЗадание 5. Перестановка значений переменных\n");

        int x = 2, y = 5;

        System.out.println("Начальные значения:" + " " + " x = " + x + "," + " y = " + y);

        System.out.print("С помощью переменной 'c':");

        int c = x;
        x = y;
        y = c;

        System.out.print("x = " + x  + "," + " " + "y = " + y);

        System.out.println ("\nС помощью арифмет., действий:");

        x -= y;
        y += x;
        x -= x;

        System.out.println("x = " + x  + "," + " " + "y = " + y);

        System.out.print("Побитовый способ:");
        x ^= y;
        y ^= x;
        x ^= y;

        System.out.print(" x = " + x + "," + " " + "y = " + y);

        System.out.println("\nЗадание 6. Вывод символов и их кодов\n");

        char char35 = '#';
        char char38 = '&';
        char char64 = '@';
        char char94 = '^';
        char char95 = '_';
        System.out.println((int)char35 + " " + char35 + "\n" + (int)char38 + " " + char38 + "\n" 
                + (int)char64 + " " + char64 + "\n" + (int)char94 + " " + char94 + "\n" + 
                (int)char95 + " " + char95 + "\n");

        System.out.println("\nЗадание 7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char parenthesesOpen = '(';
        char parenthesesClose = ')';

        System.out.println("    " + slash + "" + backslash + "     ");
        System.out.println("   " + slash + "  " + backslash + "    ");
        System.out.println("  " + slash + underscore + parenthesesOpen + " " + 
                parenthesesClose + backslash + "   ");
        System.out.println(" " + slash + "      " + backslash + "  ");
        System.out.println(slash + "" + underscore + "" + underscore + "" + underscore + "" 
                + underscore + slash + backslash + underscore + 
                underscore + backslash + " ");

        System.out.println("\nЗадание 8. Вывод количества сотен, десятков и единиц числа\n");

        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int sum = ones + tens + hundreds;
        int mult = ones * tens * hundreds;
        System.out.println("Число " + number + " содержит:\n" + hundreds + " сотен\n" + tens +
                " десятков\n" + ones + " единиц\n" + "Сумма цифр числа = " + sum +
                "\nПроизведение цифр числа = " + mult);

        System.out.println("\nЗадание 9. Вывод времени\n");

        int totalSeconds = 86399;
        int summin = totalSeconds / 60;
        int sec = totalSeconds % 60;
        int hours = summin / 60;
        int min = summin % 60;

        System.out.println(hours + ":" + min + ":" + sec);
    }
}



