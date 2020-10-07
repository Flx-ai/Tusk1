package vsu.cs.ru.num15;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double cat1 = readValue();
        double cat2 = calcCat2(cat1);

        followLogic(cat1,cat2);
    }

    static double readValue() {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите длину катета ");
        return num.nextDouble();
    }

    static double calcCat2(double cat1) {
        double cat2 = cat1;
        return cat2;
    }

    static double calcHypot(double cat1, double cat2) {
        double hypot = Math.sqrt(cat1 * cat1 + cat2 * cat2);
        return hypot;
    }

    static double calcRadius(double hypot) {
        double radius = hypot/2;
        return radius;
    }

    static double calcAreaCircle(double radius) {
        double areaCircle = Math.PI * radius * radius;
        System.out.printf("Площадь круга = %1$.2f%n", areaCircle);
        return areaCircle;
    }

    static double calcSideSquare(double radius) {
        double sideSquare = 2 * radius;
        return sideSquare;
    }

    static double calcAreaSquare(double sideSquare) {
        double areaSquare = sideSquare * sideSquare;
        return areaSquare;
    }

    static double calcAreaPaintedPart(double areaSquare, double areaCircle) {
        double diffAreas = areaSquare - areaCircle;
        System.out.printf("Площадь закрашенной части = %1$.2f", diffAreas);
        return diffAreas;
    }

    static void followLogic(double cat1,double cat2){
        double hypot = calcHypot(cat1, cat2);
        double radius = calcRadius(hypot);
        double areaCircle = calcAreaCircle(radius);
        double sideSquare = calcSideSquare(radius);
        double areaSquare = calcAreaSquare(sideSquare);
        double diffAreas = calcAreaPaintedPart(areaSquare, areaCircle);
    }
}
