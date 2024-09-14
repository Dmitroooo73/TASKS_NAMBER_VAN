import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class GallonToLiterConverter1 {

    // Константа для перевода галлонов в литры
    public static final double GALLON_TO_LITER = 3.78541;

    // Константа для текста " литров"
    public static final String LITER_SUFFIX = " литров";

    // Приватный конструктор для предотвращения создания экземпляра
    private GallonToLiterConverter1() {
        throw new UnsupportedOperationException("Utility class");
    }

    // Метод для преобразования галлонов в литры
    public static double convert(int gallons) {
        return gallons * GALLON_TO_LITER;
    }

    // Функция для расчета сожженных калорий
    public static int fitCalc(int timeInMinutes, int intensity) {
        int caloriesPerMinute = switch (intensity) {
            case 1 -> 1;  // Низкая интенсивность
            case 2 -> 2;  // Средняя интенсивность
            case 3 -> 3;  // Высокая интенсивность
            default -> throw new IllegalArgumentException("Некорректная интенсивность. Введите 1, 2 или 3.");
        };
        return timeInMinutes * caloriesPerMinute;
    }

    // Функция для подсчета общего количества товаров на складе
    public static int containers(int boxes, int bags, int barrels) {
        return boxes * 20 + bags * 50 + barrels * 100;
    }

    // Функция для определения типа треугольника
    public static String triangleType(int X, int Y, int Z) {
        if (X + Y <= Z || X + Z <= Y || Y + Z <= X) {
            return "не является треугольником";
        }

        if (X == Y && Y == Z) {
            return "равносторонний";
        } else if (X == Y || Y == Z || X == Z) {
            return "равнобедренный";
        } else {
            return "разносторонний";
        }
    }

    // Функция для нахождения большего числа с помощью тернарного оператора
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }

    // Функция для расчета количества пододеяльников
    public static int howManyItems(double n, double w, double h) {
        double availableFabric = n * 2;
        double itemArea = w * h;
        return (int) (availableFabric / itemArea);
    }

    // Функция для вычисления факториала
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    // Функция для нахождения наибольшего общего делителя (НОД)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Функция для расчета общей выручки от продажи билетов
    public static int ticketSaler(int ticketsSold, int ticketPrice) {
        double serviceFee = 0.08; // Комиссия 8%
        return (int) (ticketsSold * ticketPrice * (1 - serviceFee));
    }

    // Функция для расчета, сколько парт не хватает для всех студентов
    public static int tables(int students, int desks) {
        int requiredDesks = (students + 1) / 2; // Каждые 2 студента за одной партой
        return Math.max(0, requiredDesks - desks); // Если парт хватает, вернуть 0
    }

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.err.println("UTF-8 encoding is not supported!");
            return;
        }

        // Примеры использования функции ticketSaler
        System.out.printf("Общая выручка за 70 билетов по 1500 руб: %d%n", ticketSaler(70, 1500));
        System.out.printf("Общая выручка за 24 билета по 950 руб: %d%n", ticketSaler(24, 950));
        System.out.printf("Общая выручка за 53 билета по 1250 руб: %d%n", ticketSaler(53, 1250));

        // Примеры использования функции tables
        System.out.printf("Студентов: 5, парт: 2. Нужно дополнительных парт: %d%n", tables(5, 2));
        System.out.printf("Студентов: 31, парт: 20. Нужно дополнительных парт: %d%n", tables(31, 20));
        System.out.printf("Студентов: 123, парт: 58. Нужно дополнительных парт: %d%n", tables(123, 58));

          // Примеры использования функции gcd
        System.out.printf("НОД 48 и 18 = %d%n", gcd(48, 18));
        System.out.printf("НОД 52 и 8 = %d%n", gcd(52, 8));
        System.out.printf("НОД 259 и 28 = %d%n", gcd(259, 28));

        // Примеры использования функции factorial
        System.out.printf("Факториал 3 = %d%n", factorial(3));
        System.out.printf("Факториал 5 = %d%n", factorial(5));
        System.out.printf("Факториал 7 = %d%n", factorial(7));

        // Примеры использования конвертера галлонов в литры
        System.out.printf("%d галлонов = %.3f%s%n", 5, convert(5), LITER_SUFFIX);
        System.out.printf("%d галлона = %.3f%s%n", 3, convert(3), LITER_SUFFIX);
        System.out.printf("%d галлонов = %.3f%s%n", 8, convert(8), LITER_SUFFIX);

        // Примеры использования расчета калорий
        System.out.printf("Сожжено калорий за 15 минут низкой интенсивности: %d%n", fitCalc(15, 1));
        System.out.printf("Сожжено калорий за 24 минуты средней интенсивности: %d%n", fitCalc(24, 2));
        System.out.printf("Сожжено калорий за 41 минуту высокой интенсивности: %d%n", fitCalc(41, 3));

        // Примеры использования функции containers
        System.out.printf("Общее количество товаров (3 коробки, 4 мешка, 2 бочки): %d%n", containers(3, 4, 2));
        System.out.printf("Общее количество товаров (5 коробок, 0 мешков, 2 бочки): %d%n", containers(5, 0, 2));
        System.out.printf("Общее количество товаров (4 коробки, 1 мешок, 4 бочки): %d%n", containers(4, 1, 4));

        // Примеры использования функции triangleType
        System.out.printf("Тип треугольника (5, 5, 5): %s%n", triangleType(5, 5, 5));
        System.out.printf("Тип треугольника (5, 4, 5): %s%n", triangleType(5, 4, 5));
        System.out.printf("Тип треугольника (3, 4, 5): %s%n", triangleType(3, 4, 5));
        System.out.printf("Тип треугольника (5, 1, 1): %s%n", triangleType(5, 1, 1));

        // Примеры использования функции ternaryEvaluation
        System.out.printf("Большее число между 8 и 4: %d%n", ternaryEvaluation(8, 4));
        System.out.printf("Большее число между 1 и 11: %d%n", ternaryEvaluation(1, 11));
        System.out.printf("Большее число между 5 и 9: %d%n", ternaryEvaluation(5, 9));

        // Примеры использования функции howManyItems
        System.out.printf("Количество пододеяльников (ткань 22 м, 1.4x2 м): %d%n", howManyItems(22, 1.4, 2));
        System.out.printf("Количество пододеяльников (ткань 45 м, 1.8x1.9 м): %d%n", howManyItems(45, 1.8, 1.9));
        System.out.printf("Количество пододеяльников (ткань 100 м, 2x2 м): %d%n", howManyItems(100, 2, 2));
    }
}
