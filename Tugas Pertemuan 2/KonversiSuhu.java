package P2;

public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        // a. Celcius ke Fahrenheit dan sebaliknya
        double cToF = (C * 9.0 / 5.0) + 32;
        double fToC = (F - 32) * 5.0 / 9.0;

        // b. Celcius ke Reamur dan sebaliknya
        double cToR = C * 4.0 / 5.0;
        double rToC = R * 5.0 / 4.0;

        // c. Fahrenheit ke Reamur dan sebaliknya
        double fToR = (F - 32) * 4.0 / 9.0;
        double rToF = (R * 9.0 / 4.0) + 32;

        System.out.println("a. Celcius (" + C + " C) ke Fahrenheit: " + cToF + " F");
        System.out.println("   Fahrenheit (" + F + " F) ke Celcius: " + fToC + " C");
        System.out.println("b. Celcius (" + C + " C) ke Reamur: " + cToR + " R");
        System.out.println("   Reamur (" + R + " R) ke Celcius: " + rToC + " C");
        System.out.println("c. Fahrenheit (" + F + " F) ke Reamur: " + fToR + " R");
        System.out.println("   Reamur (" + R + " R) ke Fahrenheit: " + rToF + " F");
    }
}