import java.util.Scanner;

public class javatest {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 90) {
            System.out.println("Above 90+");
        } else if (num > 80) {
            System.out.println("Abhove 80+");
        } else {
            System.out.println("below 80");
        }
    }
}
