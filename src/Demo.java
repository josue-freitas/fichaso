import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        float firstValue, secondValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the first value: ");
        firstValue = sc.nextFloat();
        System.out.println("Insert the second value: ");
        secondValue = sc.nextFloat();
        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " x " + secondValue + " = " + (firstValue * secondValue));
        System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
    }
}
