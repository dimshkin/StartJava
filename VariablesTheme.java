public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("\n\nЗадание 1\n");

        // TODO Problem 1
        byte op = 8;
        short video = 1536;
        int processor = 2600;
        long hard = 262_144L;
        float monitor = 13.3f;
        double mind = 101.8432;
        char symbol = 120;
        boolean happening = true;

        System.out.println("1" + "." + " " + "Вывод значений переменных на консоль");
        System.out.println(op + " " + "Gb" + " " + "-" + " " + "Оперативная память");
        System.out.println(video + " " + "MHz" + " " + "-" + " " + "Видеокарта");
        System.out.println(processor + " " + "MHz" + " " + "-" + " " + "Процессор");
        System.out.println(hard + " " + "Mb" + " " + "-" + " " + "Жесткий диск");
        System.out.println(monitor + " " + "inch" + " " + "-" + " " + "Монитор");
        System.out.println(mind + " " + "Gb" + " " + "-" + " " + "Свободной памяти");
        System.out.println(symbol + " " + "OS Операционная система");
        System.out.println("Ноутбук работает" + " " + "-" + " " + "it's" + " " + happening + "!");

        // end problem 1

        System.out.println("\n\nЗадание 2\n");

        //TODO Problem 2
        int book = 200; //book's cost
        int pen = 100; // pen's cost
        int sale = 11; // sale in %

        System.out.println("2" + "." + " " + "Расчет стоимости товара со скидкой");
        System.out.println("Сумма скидки" + " " + (book + pen) * sale / 100 + " " + "руб.");
        System.out.println("Стоимость товаров со скидкой" + " " + ((book + pen)-((book +pen) * sale
                / 100)) + " " + "руб.");
        // end Problem 2

        System.out.println("\n\nЗадание 3 \n");

        //TODO Problem 3
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
        // end Problem 3

        System.out.println("\n\nЗадание 4\n");

        //TODO Problem 4
        byte byteMax = 127, byteMin = -128;
        short shortMax = 32_767, shortMin = -32_768;
        int intMax = 2_147_483_647, intMin = -2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L, longMin = -9_223_372_036_854_775_808L;

        System.out.println("Максимальное значение byte" + " " + byteMax + " " +
                "Миниальное значение byte " + byteMin);

        byteMax ++;
        byteMin ++;

        System.out.println("Инкремент byte" + " " + byteMax + " " + byteMin);

        byteMax --;
        byteMin --;

        System.out.println("Декремент byte" + " " + byteMax + " " + byteMin);

        System.out.println("Максимальное значение short" + " " + shortMax + " " +
                "Миниальное значение short " +
                shortMin);

        shortMax ++;
        shortMin ++;

        System.out.println("Инкремент short" + " " + shortMax + " " + shortMin);

        shortMax --;
        shortMin --;

        System.out.println("Декремент short" + " " + shortMax + " " + shortMin);

        System.out.println("Максимальное значение int" + " " + intMax + " " +
                "Миниальное значение int " + intMin);

        intMax ++;
        intMin ++;

        System.out.println("Инкремент int" + " " + intMax + " " + intMin);

        intMax --;
        intMin --;

        System.out.println("Декремент int" + " " + intMax + " " + intMin);

        System.out.println("Максимальное значение long" + " " + byteMax + " " +
                "Миниальное значение long" + byteMin);

        longMax ++;
        longMin ++;

        System.out.println("Инкремент long" + " " + longMax + " " + longMin);

        longMax --;
        longMin --;

        System.out.println("Декремент long" + " " + longMax + " " + longMin);

        // end Problem 4

        System.out.println("\n\nЗадание 5\n");

        /// TODO Problem 5

        int x = 2, y = 5, c = 3;
        System.out.println("Начальные значения:" + " " + " x = " + x + "," + " y = " + y);
        x += c;
        y -= c;
        System.out.println("С помощью переменной 'c':" + " " + "x = " + x + "," + " " +
                "y = " + y);

        System.out.println ("С помощью арифмет., действий:" + " " + "x = " + (x - c) + "," + " " +
                "y = " + (y + c));
        // может быть я не совсем верно понял, как реализовать с помощью арифметических действий
        //но если универсальность, то показалось с помощью действий над переменными.
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;

        System.out.println("Побитовый способ:" + " x = " + x + "," + " " + "y = " + y);

        // end Problem 5

        System.out.println("\n\nЗадание 6\n");

        // TODO Problem 6

        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        System.out.println( "35: " + ch1 + " " + "\n38: " + ch2 + " " + "\n64: " + ch3 + " " +
                "\n94: " + ch4 + " " + "\n95: " + ch5);

        // end Problem 6

        System.out.println("\n\nЗадание 7\n");

        // TODO Problem 7

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

        // end Problem 7

        System.out.println("\n\nЗадание 8\n");

        //TODO Problem 8

        int number = 123;
        int units = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 10 / 10;
        int sum = units + tens + hundreds;
        int mult = units * tens * hundreds;
        System.out.println("Число " + number + " содержит:\n" + hundreds + " сотен\n" + tens + 
            " десятков\n" + units + " единиц\n" + "Сумма его цифр = " + sum + "\nПроизведение = "
             + mult);

        // end Problem 8

        System.out.println("\n\nЗадание 9\n");

        //TODO Problem 9

        int sumsec = 86399;
        int summin = sumsec / 60;
        int sec = sumsec % 60;
        int hours = summin / 60;
        int min = summin % 60;

        System.out.println(hours + " : " + min + " : " + sec);

        // end Problem 9
    }
}


