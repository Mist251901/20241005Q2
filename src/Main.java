import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        scanner.close();

        int Money = 0;
        int day = 0;

        while (Money < price) {
            day++;
            Money += day;
        }

        System.out.println(day);
    }
}
