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

        int bookCost = 200;
        int penCost = 100;
        int pricePrecent = 11;
        int sumGoods = bookCost + penCost;
        int discountPrice = sumGoods * pricePrecent / 100;

        System.out.println("Сумма скидки" + " " + sumGoods  + " " + "руб.");
        System.out.println("Стоимость товаров со скидкой" + " " + (sumGoods - discountPrice) + " " +
                "руб.");

        System.out.println("\nЗадание 3. Вывод слова JAVA \n");

        System.out.println(" " + " " + " " + "J" + " " + " " + " " + " " + "a" + " " + " " + "v" + 
                " " + " " + " " + " " + " " + "v" + " " + " " + "a");
        System.out.println(" " + " " + " " + "J" + " " + " " + " " + "a" + " " + "a" + " " + " " + 
                "v" + " " + " " + " " + "v" + " " + " " + "a" + " " + "a");
        System.out.println("J" + " " + " " + "J" + " " + " " + "a" + "a" + "a" + "a" + "a" + " " + 
                " " + "V" + " " + "V" + " " + " " + "a" + "a" + "a" + "a" + "a");
        System.out.println(" " + "J" + "J" + " " + " " + "a" + " " + " " + " " + " " + " " + "a" + 
                " " + " " + "V" + " " + " " + "a" + " " + " " + " " + " " + " " + "a");

        System.out.println("\nЗадание 4. Вывод min и max значений целых числовых типов\n");

        byte byteMax = 127;

        System.out.println("Максимальное значение byte " + byteMax + "\nИнкремент " + (++byteMax)
                + "\nДекремент " + (--byteMax));

        byte byteMin = -128;

        System.out.println("Минимальное значение byte " + byteMin + " " + "\nИнкремент " + 
                (++byteMin) + "\nДекремент " + (--byteMin));

        short shortMax = 32_767;

        System.out.println("\nМаксимальное значение short " + shortMax + "\nИнкремент " + 
                (++shortMax) + "\nДекремент " + (--shortMax));

        short shortMin = -32_768;

        System.out.println("Минимальное значение short " + shortMin + "\nИнкремент" + (++shortMin)
                + "\nДекремент " + (--shortMin));

        int intMax = 2_147_483_647;

        System.out.println("\nМаксимальное значение int " + intMax + "\nИнкремент " + (++intMax)
                + "\nДекремент " + (--intMax));

        int intMin = -2_147_483_647;

        System.out.println("Минимальное значение int " + intMin + "\nИнкремент" + (++intMin)
                + "\nДекремент " + (--intMin));

        long longMax = 9_223_372_036_854_775_807L;

        System.out.println("\nМаксимальное значение long " + longMax + "\nИнкремент " + (++longMax)
                + "\nДекремент " + (--longMax));

        long longMin = -9_223_372_036_854_775_808L;

        System.out.println("Минимальное значение long " + longMin + "\nИнкремент" + (++longMin)
                + "\nДекремент " + (--longMin));

        System.out.println("\nЗадание 5. Перестановка значений переменных\n");

        int x = 2, y = 5;

        System.out.println("Начальные значения:" + " " + " x = " + x + "," + " y = " + y);

        System.out.print("С помощью переменной 'c':");

        int c;
        c = x;
        x = y;
        y = c;

        System.out.print("x = " + x  + "," + " " +
                "y = " + y);

        System.out.println ("\nС помощью арифмет., действий:");

        x = x - y;
        y = y + x;
        x = y - x;

        System.out.println("x = " + x  + "," + " " +
                "y = " + y);

        System.out.print("Побитовый способ:");
        x ^=  y;
        y ^=  x;
        x ^=  y;

        System.out.print(" x = " + x + "," + " " + "y = " + y);

        System.out.println("\nЗадание 6. Вывод символов и их кодов\n");

        char char35 = '#';
        char char38 = '&';
        char char64 = '@';
        char char94 = '^';
        char char95 = '_';
        System.out.println( (int) char35 + " " + char35 + "\n" + (int) char38 + " " + char38 + "\n" 
                + (int) char64 + " " + char64 + "\n" + (int) char94 + " " + char94 + "\n" + 
                (int) char95 + " " + char95 + "\n");

        System.out.println("\nЗадание 7. Вывод в консоль ASCII-арт Дюка\n");

        char forwardSlash = 47;
        char backwardSlash = 92;
        char UnderScore = 95;
        char parenthesesLeft = 40;
        char parenthesesRight = 41;

        System.out.println("    " + forwardSlash + "" + backwardSlash + "     ");
        System.out.println("   " + forwardSlash + "  " + backwardSlash + "    ");
        System.out.println("  " + forwardSlash + UnderScore + parenthesesLeft + " " + 
                parenthesesRight + backwardSlash + "   ");
        System.out.println(" " + forwardSlash + "      " + backwardSlash + "  ");
        System.out.println(forwardSlash + "" + UnderScore + "" + UnderScore + "" + UnderScore + "" 
                + UnderScore + forwardSlash + backwardSlash + UnderScore + 
                UnderScore + backwardSlash + " ");

        System.out.println("\nЗадание 8. Вывод количества сотен, десятков и единиц числа\n");

        int number = 123;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 10 / 10;
        int sum = units + tens + hundreds;
        int mult = units * tens * hundreds;
        System.out.println("Число " + number + " содержит:\n" + hundreds + " сотен\n" + tens +
                " десятков\n" + units + " единиц\n" + "Сумма его цифр = " + sum +
                "\nПроизведение =" + mult);

        System.out.println("\nЗадание 9. Вывод времени\n");

        int sumsec = 86399;
        int summin = sumsec / 60;
        int sec = sumsec % 60;
        int hours = summin / 60;
        int min = summin % 60;

        System.out.println(hours + " : " + min + " : " + sec);
    }
}



