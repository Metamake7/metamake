import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Task10();
// Task 1
        System.out.println("Hello");
        System.out.println("Maxat Tuleyev");
    }
// Task 2
    public static void Task2() {
        int a = 74;
        int b = 36;
        int sum = a + b;
        System.out.println("sum of two numbers s eq.to " + sum);
    }
// Task 3
    public static void Task3() {
        int a = 50;
        int b = 3;
        double sum = a / b;
        System.out.println("50/3");
        System.out.println(sum);
    }
// Task 4
    public static void Taks4() {
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + (-3 * 5 / 8);
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
// Task 5
    public static void Task5() {

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x * y);
    }
// Task 6
public static void Task6() {
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);
    }
// Task 7
public static void Task7() {
    int x = scanner.nextInt();
    for (x = 1; x <= 10; x++) ;
    System.out.println(" x " + x + " = ");
    }
// Task 8
public static void Task8() {
    int J, a, v;
    System.out.println("   J    a   v     v  a");
    System.out.println("   J   a a   v   v  a a");
    System.out.println("J  J  aaaaa   V V  aaaaa");
    System.out.println("JJ   a     a   V  a     a");
    }
// Task 9
public static void Task9(){
    double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    System.out.println(result);
    }
// Task 10
public static void Task10(){
    double result = (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    System.out.println(result);
}
}