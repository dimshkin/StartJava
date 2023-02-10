public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n\nЗадание 1. Перевод псевдокода на язык Java \n");
        boolean maleGender = true;
        int age = 18;
        float height = 1.79f;

        if (age > 20) {
            System.out.println("Проверьте, вы обменяли паспорт по достижению 20 лет.");
        } else {
            System.out.println("Первая замена паспорта наступают только в 20 лет.");
        }

        if (!maleGender) {
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
        int a = 105, b = 106;

        if (a == b) {
            System.out.println("Числа равны");
        } else if (b > a) {
            System.out.println(b + " Максимальное число " + a + " Минимальное число");
        } else if (a > b) {
            System.out.println(a + " Максимальное число " + b + " Минимальное число");
        }
        
        System.out.println("\n\nЗадание 3. Проверка числа \n");
        int number = 2;

        System.out.print("Исходное число: " + number);
        if (number == 0) {
        }
        if (number != 0) {
            if ((number % 2) == 0)
                System.out.print(" четное");
            else
                System.out.print(" нечетное");
            if (number > 0)
                System.out.print(", положительное");
            else
                System.out.print(", отрицательное");
        }

        System.out.println("\n\nЗадание 4. Поиск одинаковых цифр в числах \n");
        int num1 = 321, num2 = 123;
        System.out.println("Число 1: " + num1 + "," + "Число 2: " + num2);
        int onesNum1 = num1 % 10;
        int tenseNum1 = num1 / 10 % 10;
        int hundredsNum1 = num1 / 100;
        int onesNum2 = num2 % 10;
        int tenseNum2 = num2 / 10 % 10;
        int hundredsNum2 = num2 / 100;

        if (onesNum1 != onesNum2 && tenseNum1 != tenseNum2 && hundredsNum1 != hundredsNum2) {
            System.out.println("Совпадений не найдено!");
        }
        if (onesNum1 == onesNum2) {
            System.out.println("Числа имеют одинаковую цифру " + onesNum1 + " в первом разряде");
        }
        if (tenseNum1 == tenseNum2) {
            System.out.println("Числа имеют одинаковую цифру " + tenseNum1 + " во втором разряде");
        }
        if (hundredsNum1 == hundredsNum2) {
            System.out.println("Числа имеют одинаковую цифру " + hundredsNum1 + 
                " в третьем разряде");
        }

        System.out.println("\n\nЗадание 5. Определение символа по его коду \n");
        char ch = '\u0057';
        System.out.println(ch);
        if (ch >= '0' && ch <= '9') {
            System.out.println("Это число");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Это маленькая буква");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Это большая буква");
        } else {
            System.out.println("Это не число и не буква");
        }

        System.out.println("\n\nЗадание 6. Подсчет суммы вклада и начисленных банком % \n");
        int deposit = 300_000;
        int offer = 0;

        if (deposit < 100_000) {
            offer = deposit * 5 / 100;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            offer = deposit * 7 / 100;
        } else if (deposit > 300_000) {
            offer = deposit * 10 / 100;
        }
        System.out.println("Ваш вклад в рублях: " + deposit + "." + 
                " Начисленный процент в рублях за год " + offer + "." + " Итоговая сумма в рублях: "
                 + (deposit + offer));

        System.out.println("\n\nЗадание 7. Определение оценки по предметам \n");
        int historyPercent = 59;
        int programmingPercent = 91;
        float programmingScore = 2;
        float historyScore = 2;

        if ((historyPercent > 60) && (historyPercent < 73)) {
            historyScore = 3;
        } else if ((historyPercent >= 73) && (historyPercent < 91)) {
            historyScore = 4;
        } else if (historyPercent >= 91) {
            historyScore =5;
        }

        if ((programmingPercent > 60) && (programmingPercent < 73)) {
            programmingScore = 3;
        } else if ((programmingPercent >= 73) &&(programmingPercent < 91)) {
            programmingScore = 4;
        } else if (programmingPercent >= 91) {
            programmingScore = 5;
        }
        System.out.println("История: оценка " + historyScore + "\nПрограммирование: оценка "
                 + programmingScore + 
                 "\nСредняя оценка: " + ((historyScore + programmingScore) / 2));

        System.out.println("\n\nЗадание 8. Расчет прибыли за год \n");
        int rentMonth = 5_000;
        int turnoverMonth = 13_000;
        int purchaseGoods = 9_000;
        System.out.println(" Годовая прибыль составляет: " + 
            (turnoverMonth - (rentMonth + purchaseGoods)) * 12);

        System.out.println("\n\nЗадание 9. Подсчет количества банкнот \n");
        int usd = 567;
        int unitUsd = usd % 10;
        int tenseUsd = usd / 10 % 10;
        int hundredUsd = usd / 100;
        int unitBanknotes = 50, tenseBanknotes = 1, hundredBanknotes = 5;
        int hundredlacks = (tenseUsd + (hundredUsd - hundredBanknotes) * 10);
        int tenselacks = (unitUsd + (hundredlacks - tenseBanknotes) * 10);
        int hundredNeed = hundredUsd;
        int tenseNeed = tenseUsd;
        int unitNeed = unitUsd;

        if ((unitBanknotes + (tenseBanknotes * 10) + (hundredBanknotes * 100)) < usd) {
            System.out.println("В банкомате недостаточно купюр! ");
        }
         if (hundredBanknotes - hundredUsd > 0) {
            hundredNeed = hundredUsd;
        } else if (hundredBanknotes - hundredUsd < 0) {
            hundredNeed = hundredBanknotes;
            tenseNeed = hundredlacks;
        } else if (tenseBanknotes - hundredlacks < 0) {
            tenseNeed = tenseBanknotes;
            unitNeed = tenselacks;
        }
            System.out.println("Для снятия " + usd + " долларов, банкомат выдаст: " +
                    hundredNeed + " банкнот по 100 usd, " + tenseNeed + " банкнот по 10 USD и "
                    + unitNeed + " банкнот по 1 USD");
    }
}