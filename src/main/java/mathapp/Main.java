package mathapp;
import mathlib.MathOperations;
public class Main {
    public static void main(String[] args) {
        long a = 462;
        long b = 1071;
        System.out.println("Демонстрация работы библиотеки mathlib");
        System.out.printf("Факториал 5!  = %d%n", MathOperations.factorial(5));
        System.out.printf("Факториал 10! = %d%n", MathOperations.factorial(10));
        System.out.printf("Факториал 20! = %d%n", MathOperations.factorial(20));
        System.out.printf("НОД(%d, %d) = %d%n", a, b, MathOperations.gcd(a, b));
        System.out.printf("НОК(%d, %d) = %d%n", a, b, MathOperations.lcm(a, b));
        long[] candidates = {1, 2, 17, 561, 7919, 104729};
        for (long n : candidates) {
            System.out.printf("Число %d простое? %s%n",
                    n, MathOperations.isPrime(n) ? "да" : "нет");
        }
    }
}


