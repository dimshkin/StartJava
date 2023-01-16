public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n\nЗадание 1. Вывод значений переменных на консоль\n");

        byte op = 8;
        short videocard = 1536;
        int processor = 2600;
        long hard = 262_144L;
        float monitor_inch = 13.3f;
        double mind = 101.8432;
        char os_x = 120;
        boolean happening = true;

        System.out.println("1" + "." + " " + "Вывод значений переменных на консоль");
        System.out.println(op + " " + "Gb" + " " + "-" + " " + "Оперативная память");
        System.out.println(videocard + " " + "MHz" + " " + "-" + " " + "Видеокарта");
        System.out.println(processor + " " + "MHz" + " " + "-" + " " + "Процессор");
        System.out.println(hard + " " + "Mb" + " " + "-" + " " + "Жесткий диск");
        System.out.println(monitor_inch + " " + "inch" + " " + "-" + " " + "Монитор");
        System.out.println(mind + " " + "Gb" + " " + "-" + " " + "Свободной памяти");
        System.out.println(os_x + " " + "OS Операционная система");
        System.out.println("Ноутбук работает" + " " + "-" + " " + "it's" + " " + happening + "!");


        System.out.println("\n\nЗадание 2. Расчет стоимости товара со скидкой\n");

        int book_cost = 200; //book's cost
        int pen_cost = 100; // pen's cost
        int sale_procent = 11; // sale in %
        int sum_prod = book_cost + pen_cost;
        int sum_sale = sum_prod * sale_procent / 100;

        System.out.println("Сумма скидки" + " " + sum_sale  + " " + "руб.");
        System.out.println("Стоимость товаров со скидкой" + " " + (sum_prod - sum_sale) + " " +
                "руб.");

        System.out.println("\n\nЗадание 3. Вывод слова JAVA \n");

        char a = 97;
        char J = 74;
        char V = 86;
        char v = 118;

        System.out.println(" " + " " + " " + J + " " + " " + " " + " " + a + " " + " " + v + " " +
                " " + " " + " " + " " + v + " " + " " + a);
        System.out.println(" " + " " + " " + J + " " + " " + " " + a + " " + a + " " + " " + v + " "
                + " " + " " + v + " " + " " + a + " " + a);
        System.out.println(J + " " + " " + J + " " + " " + a + a + a + a + a + " " + " " + V + " " +
                V + " " + " " + a + a + a + a + a);
        System.out.println(" " + J + J + " " + " " + a + " " + " " + " " + " " + " " + a + " " + " "
                + V + " " + " " + a + " " + " " + " " + " " + " " + a);

        System.out.println("\n\nЗадание 4. Вывод min и max значений целых числовых типов\n");

        byte byteMax = 127, byteMin = -128;
        byte byteMaxIn = byteMax++;
        byte byteMinIn = byteMin++;
        byte byteMaxDec = byteMax--;
        byte byteMinDec = byteMin--;
        short shortMax = 32_767, shortMin = -32_768;
        short shortMaxIn = shortMax++;
        short shortMinIn = shortMin++;
        short shortMaxDec = shortMax--;
        short shortMinDec = shortMin--;
        int intMax = 2_147_483_647, intMin = -2_147_483_647;
        int intMaxIn = intMax++;
        int intMinIn = intMin++;
        int intMaxDec = intMax--;
        int intMinDec = intMin--;
        long longMax = 9_223_372_036_854_775_807L, longMin = -9_223_372_036_854_775_808L;
        long longMaxIn = longMax++;
        long longMinIn = longMin++;
        long longMaxDec = longMax--;
        long longMinDec = longMin--;


        System.out.println("Максимальное значение byte" + " " + byteMax + " " + 
                "Минимальное значение byte " + byteMin + "\nИнкремент byte" + " " + byteMaxIn + " " 
                + byteMinIn  + "\nДекремент byte" + " " + byteMaxDec + " " + byteMinDec);



        System.out.println("\nМаксимальное значение short" + " " + shortMax + " " + 
                "Минимальное значение short " + shortMin  + "\nИнкремент short" + " " + shortMaxIn 
                + " " + shortMinIn + "\nДекремент short" + " " + shortMaxDec + " " + shortMinDec);


        System.out.println("\nМаксимальное значение int" + " " + intMax + " " +
                "Минимальное значение int " + intMin + "\nИнкремент int" + " " + intMaxIn + " " + 
                intMinIn + "\nДекремент int" + " " + intMaxDec + " " + intMinDec);


        System.out.println("\nМаксимальное значение long" + " " + longMax + " " + 
                "Минимальное значение long" + longMin + "\nИнкремент long" + " " + longMaxIn + " " 
                + longMinIn + "\nДекремент long" + " " + longMaxDec + " " + longMinDec);



        System.out.println("\n\nЗадание 5. Перестановка значений переменных\n");

        int x = 2, y = 5, c = 3;
        System.out.println("Начальные значения:" + " " + " x = " + x + "," + " y = " + y);


        System.out.print("С помощью переменной 'c':");
        x += c;
        y -= c;

        System.out.print("x = " + x  + "," + " " +
                "y = " + y);


        System.out.println ("\nС помощью арифмет., действий:" + " " + "x = " + (x - c) + "," + " " +
                "y = " + (y + c));

        System.out.print("Побитовый способ:");
        x ^=  y;
        y ^=  x;
        x ^=  y;

        System.out.print(" x = " + x + "," + " " + "y = " + y);


        System.out.println("\n\nЗадание 6. Вывод символов и их кодов\n");

        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        System.out.println( "35: " + ch1 + " " + "\n38: " + ch2 + " " + "\n64: " + ch3 + " " +
                "\n94: " + ch4 + " " + "\n95: " + ch5);

        System.out.println("\n\nЗадание 7. Вывод в консоль ASCII-арт Дюка\n");

        char sright = 47;
        char sleft = 92;
        char lineDown = 95;
        char pleft = 40;
        char pright = 41;

        System.out.println("    " + sright + "" + sleft + "     ");
        System.out.println("   " + sright + "  " + sleft + "    ");
        System.out.println("  " + sright + lineDown + pleft + " " + pright + sleft + "   ");
        System.out.println(" " + sright + "      " + sleft + "  ");
        System.out.println(sright + "" + lineDown + "" + lineDown + "" + lineDown + "" + lineDown +
                sright + sleft + lineDown + lineDown + sleft + " ");

        System.out.println("\n\nЗадание 8. Вывод количества сотен, десятков и единиц числа\n");

        int number = 123;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 10 / 10;
        int sum = units + tens + hundreds;
        int mult = units * tens * hundreds;
        System.out.println("Число " + number + " содержит:\n" + hundreds + " сотен\n" + tens +
                " десятков\n" + units + " единиц\n" + "Сумма его цифр = " + sum + 
                "\nПроизведение =" + mult);

        System.out.println("\n\nЗадание 9. Вывод времени\n");

        int sumsec = 86399;
        int summin = sumsec / 60;
        int sec = sumsec % 60;
        int hours = summin / 60;
        int min = summin % 60;

        System.out.println(hours + " : " + min + " : " + sec);
    }
}



