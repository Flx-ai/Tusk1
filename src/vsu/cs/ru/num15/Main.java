package vsu.cs.ru.num15;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double cat1 = readValue();
        double cat2 = calcCat2(cat1);

        logic(cat1,cat2);
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
        System.out.printf("Площадь круга = %2$.2f%n",  areaCircle);
        return areaCircle;
    }

    static double calcSideSquare(double r) {
        double sideSquare = 2 * r;
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

    static void logic(double cat1,double cat2){
        double c = calcHypot(cat1, cat2);
        double r = calcRadius(c);
        double areaCircle = calcAreaCircle(r);
        double sideSquare = calcSideSquare(r);
        double areaSquare = calcAreaSquare(sideSquare);
        double diffAreas = calcAreaPaintedPart(areaSquare, areaCircle);
    }
}
