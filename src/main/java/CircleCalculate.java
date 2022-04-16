import java.util.Scanner;

public class CircleCalculate {
    public static final double PI = 3.14;
    public static final double Q = 90; // угол сектора круга

    public static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }

    public static double calculateCircleLength(int radius) {
        return 2 * PI * radius;
    }

    public static double calculateCircleSector(int radius) {
        return (Q * PI * radius) / 180;
    }

    public static String Massege() {
        return "Всё хорошо";
    }

    public static int LenghtRadius(int radius) {
        return (int) (Math.log10(radius) + 1);
    }

    public static void main(String[] args) {
        System.out.println("Введите значение радиуса в сантиментрах но не более 99:");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double area = calculateCircleArea(radius);
        double length = calculateCircleLength(radius);
        double sector = calculateCircleSector(radius);
        System.out.println("Площадь круга: " + area + " см.кв.");
        System.out.println("Периметр круга: " + length + " см.");
        System.out.println("Площадь сектора круга: " + sector + " см.кв.");
        System.out.println(Massege());
        LenghtRadius(radius);
        System.out.println(LenghtRadius(radius));

    }
}
