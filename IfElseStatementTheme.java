public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n\nЗадание 1. Перевод псевдокода на язык Java \n");
        boolean male = true;
        int age = 18;
        float height = 1.79f;

        if (age > 20) {
            System.out.println("Проверьте, вы обменяли паспорт по достижению 20 лет.");
        } else {
            System.out.println("Первая замена паспорта наступают только в 20 лет.");
        }

        if (!male) {
            System.out.println("Повезет в следующей жизни.");
        } else
            System.out.println("Повезло.");

        if (height < 1.80) {
            System.out.println("Ты помещаешься в стандартную кровать.");
        } else {
            System.out.println("Проверь не свисают ли твои ноги с кровати.");
        }
        char firstLetterName = "Имя".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Максим, возможно это твое имя.");
        } else if (firstLetterName == 'I') {
            System.out.println("Ты точно не Максим.");
        } else {
            System.out.println("Укажи свое имя сам");
        }

        System.out.println("\n\nЗадание 2. Поиск max и min числа \n");
        int a = 100, b = 75;
        if (a < b) {
            System.out.println(b + " Максимальное число " + a + " Минимальное число");
        }
        if (a > b) {
            System.out.println(a + " Максимальное число " + b + " Минимальное число");
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n\nЗадание 3. Проверка числа \n");
        int x = 2;
        System.out.println("Исходное число: " + x);
        if (x == 0) {
            System.out.println("Число " + x + " равно 0");
        } else if ((x % 2) == 0) {
            System.out.println("Число " + x + " четное");
        } else if (x > 0) {
            System.out.println("Число " + x + " положительное");
        }

        System.out.println("\n\nЗадание 4. Поиск одинаковых цифр в числах \n");
        int num1 = 225, num2 = 235;
        System.out.println("Число 1: " + num1 + "," + "Число 2: " + num2);
        int unitsNum1 = num1 % 10;
        int tenseNum1 = num1 / 10 % 10;
        int hundredsNum1 = num1 / 100;
        int unitsNum2 = num2 % 10;
        int tenseNum2 = num2 / 10 % 10;
        int hundredsNum2 = num2 / 100;
        if (unitsNum1 == unitsNum2) {
            System.out.println("Числа имеют одинаковую цифру " + unitsNum1 + " в первом разряде");
        }
        if (tenseNum1 == tenseNum2) {
            System.out.println("Числа имеют одинаковую цифру " + tenseNum1 + " во втором разряде");
        }
        if (hundredsNum1 == hundredsNum2) {
            System.out.println("Числа имеют одинаковую цифру " + 
                hundredsNum1 + " в третьем разряде");
        } else {
            System.out.println("Совпадений не найдено!");
        }

        System.out.println("\n\nЗадание 5. Определение символа по его коду \n");
        char ch = '\u0057';
        System.out.println(ch);
        if (ch>='0' && ch<='9') {
            System.out.println("Это число");
        }
        if (ch >='a' && ch <='z') {
            System.out.println("Это маленькая буква");
        }
        if (ch >='A' && ch <='Z') {
            System.out.println("Это большая буква");
        } else {
            System.out.println("Это не число и не буква");
        }

        System.out.println("\n\nЗадание 6. Подсчет суммы вклада и начисленных банком % \n");
        int deposit = 300_000;
        int condition1 = (deposit * 5 / 100);
        int condition2 = (deposit * 7 / 100);
        int condition3 = (deposit * 10 / 100);

        if (deposit < 100_000) {
            System.out.println("Ваш вклад в рублях: " + deposit + "." + 
                " Начисленный процент в рублях за год " +
                    condition1 + "." + " Итоговая сумма в рублях: " + (deposit + condition1));
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            System.out.println("Ваш вклад в рублях: " + deposit + "." + 
                " Начисленный процент в рублях за год " +
                    condition2 + "." + " Итоговая сумма в рублях: " + (deposit + condition2));
        } else if (deposit > 300_000) {
            System.out.println("Ваш вклад в рублях: " + deposit + "." + 
                " Начисленный процент в рублях за год " +
                    condition3 + "." + " Итоговая сумма в рублях: " + (deposit + condition3));
        } else {
            System.out.println("У вас еще нет банковского вклада в нашем банке");
        }
        System.out.println("\n\nЗадание 7. Определение оценки по предметам \n");
        int historyPercent = 59;
        int codingPercent = 91;
        int midle = ((historyPercent + codingPercent)/2);

        if (historyPercent <=60) {
            System.out.println("История: оценка 2");
        }
        if ((historyPercent >60) && (historyPercent < 73)) {
            System.out.println("История: оценка 3");
        }
        if ((historyPercent >=73) && (historyPercent < 91)) {
            System.out.println("История: оценка 4");
        }
        if(historyPercent >= 91) {
            System.out.println("История: оценка 5");
        }
        if (codingPercent <=60) {
            System.out.println("Программирование: оценка 2 ");
        }
        if ((codingPercent >60) && (codingPercent <73)) {
            System.out.println("Программирование: оценка 3");
        }
        if ((codingPercent >=73) && (codingPercent <91)) {
            System.out.println("Программирование: оценка 4");
        }
        if (codingPercent >=91){
            System.out.println("Программирование: оценка 5");
        }
        if (midle <=60) {
            System.out.println("Средняя оценка: 2 ");
        }
        if ((midle >60) && (midle <73)) {
            System.out.println("Средняя оценка: 3");
        }
        if ((midle >=73) && (midle <91)) {
            System.out.println("Средняя оценка: 4");
        }
        if (midle >=91){
            System.out.println("Средняя оценка: 5");
        }

        System.out.println("\n\nЗадание 8. Расчет прибыли за год \n");
        int rentMonth = 5_000;
        int turnoverMonth = 13_000;
        int purchaseGoods = 9_000;
        System.out.println(" Годовая прибыль составляет: " + 
            (turnoverMonth * 12 - (rentMonth * 12 + purchaseGoods * 12)));

        System.out.println("\n\nЗадание 9. Подсчет количества банкнот \n");
        int usd = 567;
        int unitUsd = usd % 10;
        int tenseUsd = usd / 10 % 10;
        int hundredUsd = usd / 100;
        int unitBanknotes = 50, tenseBanknotes = 1, hundredBanknotes = 5;
        int hundredlacks = (tenseUsd + (hundredUsd - hundredBanknotes) * 10);
        int tenselacks = (unitUsd + (hundredlacks - tenseBanknotes) * 10);

        if (hundredBanknotes >= hundredUsd && tenseBanknotes >= tenseUsd && unitBanknotes >= unitUsd) {
            System.out.println("Для снятия " + usd + " долларов " + "банкомат выдаст: " + 
                hundredUsd + " банкнот по 100 USD, " + tenseUsd + " банкнот по 10 USD и " + unitUsd +
                    " банкнот номиналом по 1 USD");
        }
        if (hundredBanknotes - hundredUsd < 0 ) {
            System.out.println("Для снятия " + usd + " долларов, банкомат выдаст: " + 
                hundredBanknotes + " банкнот по 100 usd, " + hundredlacks + " банкнот по 10 USD и "
                 + unitUsd + " банкнот по 1 USD");
        }
        if (tenseBanknotes -  hundredlacks < 0) {
            System.out.println("Для снятия " + usd + " долларов, банкомат выдаст: " + 
                hundredBanknotes + " банкнот по 100 usd, " + tenseBanknotes + " банкнот по 10 USD и "
                 + tenselacks + " банкнот по 1 USD");
        }
        if ( unitBanknotes - tenselacks <0) {
            System.out.println("В банкомате недостаточно купюр! ");
        }
    }
}