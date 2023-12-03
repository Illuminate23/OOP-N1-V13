import java.util.Scanner;

public class PolygonAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество вершин многоугольника:");
        int n = scanner.nextInt();

        double[][] points = new double[n][2];

        System.out.println("Введите координаты вершин (x и y), разделяя их пробелом:");
        for (int i = 0; i < n; i++) {
            System.out.println("Вершина " + (i + 1) + ":");
            points[i][0] = scanner.nextDouble(); 
            points[i][1] = scanner.nextDouble(); 
        }

        double area = calculateArea(points);
        System.out.println("Площадь многоугольника: " + area);
        scanner.close();
    }

    private static double calculateArea(double[][] points) {
        double area = 0.0;
        int n = points.length;

        for (int i = 0; i < n - 1; i++) {
            area += (points[i][0] * points[i + 1][1]) - (points[i + 1][0] * points[i][1]);
        }

        area += (points[n - 1][0] * points[0][1]) - (points[0][0] * points[n - 1][1]);
        return Math.abs(area / 2.0);
    }
}
