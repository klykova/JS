import java.util.Scanner;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        String gender = "мужской";
        int age = 25;
        double heigh = 0.8;
        String name = "Michael";
        System.out.println("1. Перевод псевдокода на язык Java");
        if (gender != "мужской") {
            System.out.println("Добрый день, молодой человек");
        } else {
            System.out.println("Здравствуйте, девушка");
        }
        if (age > 18) {
            System.out.println("Вы можете проходить");
        } else {
            System.out.println("Вы можете проходить только в присутствии взрослого");
        }
        if (heigh < 1.8) {
            System.out.println("Вы допущены к данному аттракциону");
        } else {
            System.out.println("К сожалению, вы не можете пройти");
        }
        char firstLetter = name.charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Присаживайтесь за первый стол");
        } else if (firstLetter == 'I') {
            System.out.println("Присаживайтесь за второй стол");
        } else {
            System.out.println("Подойдите к другому администратору");
        }
        System.out.println();
        System.out.println("2. Поиск большего числа");
        int numberOne = 245;
        int numberTwo = 246;
        if (numberOne < numberTwo) {
            System.out.println(numberOne + "<" + numberTwo);
        } else if (numberOne > numberTwo) {
            System.out.println(numberOne + ">" + numberTwo);
        } else {
            System.out.println(numberOne + "=" + numberTwo);
        }
        System.out.println();
        System.out.println("3. Проверка числа");
        int number1 = -345;
        if (number1 == 0) {
            System.out.println("Число равно нулю");
            System. exit(0);
        }
        boolean isEvenNumber = number1 % 2 == 0;
        if (isEvenNumber == true) {
            System.out.print(number1 + " является четным");
        } else {
            System.out.print(number1 + " является нечетным");
        }
        if (number1 < 0) {
            System.out.println(" и отрицательным");
        } else {
            System.out.println(" и положительным");
        }
        System.out.println();
        System.out.println("4. Поиск одинаковых цифр в числах");
        int digitOne = 123;
        int digitTwo = 223;
        int a1 = digitOne / 100;
        int b1 = digitOne / 10 % 10;
        int c1 = digitOne - a1 * 100 - b1 * 10;
        int a2 = digitTwo / 100;
        int b2 = digitTwo / 10 % 10;
        int c2 = digitTwo - a2 * 100 - b2 * 10;
        if (digitOne > 999 && digitTwo > 999) {
            System.out.println("Числа не подходят для разбора");
            System.exit(0);
        }
        if (a1 != a2 && b1 != b2 && c1 != c2) {
            System.out.println("Равных цифр нет");
            System.exit(0);
        }
        if (a1 == a2 && b1 != b2 && c1 != c2) {
            System.out.println(digitOne + " и " + digitTwo +
                    "имеют одинаковую цифру " + a1 + " в разряде сотни");
        }
        if (a1 != a2 && b1 == b2 && c1 != c2) {
            System.out.println(digitOne + " и " + digitTwo +
                    "имеют одинаковую цифру " + b1 + " в разряде десятки");
        }
        if (a1 != a2 && b1 != b2 && c1 == c2) {
            System.out.println(digitOne + " и " + digitTwo +
                    "имеют одинаковую цифру " + c1 + " в разряде единицы");
        }
        if (a1 == a2 && b1 == b2 && c1 != c2) {
            System.out.println(digitOne + " и " + digitTwo + 
                    "имеют одинаковые цифры " + a1 + " и " + b1 + " в разрядах сотен и десятков");
        }
        if (a1 != a2 && b1 == b2 && c1 == c2) {
            System.out.println(digitOne + " и " + digitTwo + 
                    "имеют одинаковые цифры " + b1 + " и " + c1 + " в разряде десятков и единиц ");
        }
        if (a1 == a2 && b1 != b2 && c1 == c2) {
            System.out.println(digitOne + "и " + digitTwo + 
                    "имеют одинаковые цифры " + a1 + " и " + c1 + " в разряде сотен и единиц");
        }
        if (a1 == a2 && b1 == b2 && c1 == c2) {
            System.out.println("Числа полностью одинаковые");
        }
        System.out.println();
        System.out.println("5. Определение символа по его коду");
        char asciiCharacter = (char) '\u0057';
        boolean numberIs = Character.isDigit(asciiCharacter);
        boolean letterIs = Character.isLetter(asciiCharacter);
        if (numberIs == false && letterIs == false) {
            System.out.println("Ваш код: " + asciiCharacter + " - не буква и не цифра");
            System.exit(0);
        }
        if (numberIs == true) {
            System.out.println("Ваш код: " + asciiCharacter + " - цифра");
            System.exit(0);
        }
        boolean upperCaseIs = Character.isUpperCase(asciiCharacter);
        if (letterIs == true) {
            if (upperCaseIs == true) {
                System.out.println("Ваш код: " + asciiCharacter + " - это заглавная буква");
            } else {
                System.out.println("Ваш код: " + asciiCharacter + " - это прописная буква");
            }
        }
        System.out.println();
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000;
        if (deposit < 100000) {
            int procentMoney = (deposit * 5 / 100);
            int recievedMoney = procentMoney + deposit;
            System.out.println("сумма вклада= " + deposit + ", сумма начисленных процентов= " +
                    procentMoney + ", итоговая сумма с процентами= " + recievedMoney);
        } else if (100000 < deposit && deposit < 300000) {
            int procentMoney = (deposit * 7 / 100);
            int recievedMoney = procentMoney + deposit;
            System.out.println("сумма вклада= " + deposit + ", сумма начисленных процентов= " + procentMoney +
                    ", итоговая сумма с процентами= " + recievedMoney);
        } else if (deposit > 300000) {
            int procentMoney = (deposit * 10 / 100);
            int recievedMoney = procentMoney + deposit;
            System.out.println("сумма вклада= " + deposit + ", сумма начисленных процентов= " + procentMoney +
                    ", итоговая сумма с процентами= " + recievedMoney);
        }
        System.out.println();
        System.out.println("7. Определение оценки по предметам");
        int historyMarkPercent = 59;
        int programmingMarkPercent = 92;
        int averagePercent = (programmingMarkPercent + historyMarkPercent) / 2;
        int historyMark = 0;
        int programmingMark = 0;
        if (historyMarkPercent <= 60) {
            historyMark = 2;
            System.out.println("оценка по истории 2 ");
        }
        if (historyMarkPercent > 60 && historyMarkPercent <= 73) {
            historyMark = 3;
            System.out.println("оценка по истории 3 ");
        }
        if (historyMarkPercent > 73 && historyMarkPercent <= 91) {
            historyMark = 4;
            System.out.println("оценка по истории 4");
        }
        if (historyMarkPercent > 91) {
            historyMark = 5;
            System.out.println("оценка по истории 5 ");
        }
        if (programmingMarkPercent <= 60) {
            programmingMark = 2;
            System.out.println("оценка по программированию 2 ");
        }
        if (programmingMarkPercent > 60 && programmingMarkPercent <= 73) {
            programmingMark = 3;
            System.out.println("оценка по программированию 3 ");
        }
        if (programmingMarkPercent > 73 && programmingMarkPercent <= 91) {
            programmingMark = 4;
            System.out.println("оценка по программированию 4");
        }
        if (programmingMarkPercent > 91) {
            programmingMark = 5;
            System.out.println("оценка по программированию 5 ");
        }
        int averageMark = (programmingMark + historyMark) / 2;
        System.out.println("средний балл оценок по предметам " + averageMark);
        System.out.println("средний процент оценок по предметам " + averagePercent);
        System.out.println();
        System.out.println("8. Расчет годовой прибыли");
        int realization = 13000;
        int rent = 5000;
        int cost = 9000; 
        int profitYear = realization * 12 - rent * 12 - cost * 12;
        if (profitYear > 0) {
            System.out.println("+" + profitYear + " руб.");
        } else {
            System.out.println(profitYear + " руб.");
        }
    }
}



