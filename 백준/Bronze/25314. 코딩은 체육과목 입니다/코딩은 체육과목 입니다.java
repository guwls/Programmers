import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int totlaLong = num / 4;

        for (int i = 0; i < totlaLong; i++) {
            System.out.print("long ");
        }

        System.out.print("int");
    }
}