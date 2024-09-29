public class AllTask {

    //Таск №1 галлоны
    public static double convert(int gallons) {
        return gallons * 3.785;
    }

    //Таск №2 фитнес
    public static int fitCalc(int minutes, int intensity) {
        return minutes * intensity;
    }

    //Таск №3 склад
    public static int containers(int boxes, int bags, int barrels) {
        return (boxes * 20) + (bags * 50) + (barrels * 100);
    }

    //Таск №4 треугольник
    public static String triangleType(int x, int y, int z) {
        if (x + y <= z || x + z <= y || y + z <= x) {
            return "не является треугольником";
        }
        if (x == y && y == z) {
            return "равносторонний";
        }
        if (x == y || x == z || y == z) {
            return "равнобедренный";
        }
        return "разносторонний";
    }

    //Таск №5 сравнение
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }

    //Таск №6 пододеяльники
    public static int howManyItems(int n, double w, double h) {
        int fabricArea = n * 2;
        int itemArea = (int) (w * h);
        return fabricArea / itemArea;
    }

    //Таск №7 факториал
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //Таск №8 наибольший общий множитель
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //Таск №9 выручка
    public static int ticketSaler(int ticketsSold, int ticketPrice) {
        double commission = 0.28; // 28%
        return (int) ((ticketsSold * ticketPrice) * (1 - commission));
    }

    //Таск №10 столы
    public static int tables(int students, int desks) {
        int requiredDesks = (int) Math.ceil(students / 2.0);
        return Math.max(0, requiredDesks - desks);
    }
    public static void main(String[] args) {
        // Test Task 1
        System.out.println("Task 1:");
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));

        // Test Task 2
        System.out.println("\nTask 2:");
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));

        // Test Task 3
        System.out.println("\nTask 3:");
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));

        // Test Task 4
        System.out.println("\nTask 4:");
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));

        // Test Task 5
        System.out.println("\nTask 5:");
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));

        // Test Task 6
        System.out.println("\nTask 6:");
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));

        // Test Task 7
        System.out.println("\nTask 7:");
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));

        // Test Task 8
        System.out.println("\nTask 8:");
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28)); //Ошибка в задании. Наибольший делитель для 259 и 28 это 7 а не 1

        // Test Task 9
        System.out.println("\nTask 9:");
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));

        // Test Task 10
        System.out.println("\nTask 10:");
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }
}
