import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        if (t <= 10 && t > 0) {
            switch (t) {
                case 1 -> System.out.println("9 45"); // 9 50
                case 2 -> System.out.println("10 35"); // 10 50
                case 3 -> System.out.println("11 35"); // 11 40
                case 4 -> System.out.println("12 25"); // 12 40
                case 5 -> System.out.println("13 25"); // 13 30
                case 6 -> System.out.println("14 15"); // 14 30
                case 7 -> System.out.println("15 15"); // 15 20
                case 8 -> System.out.println("16 25"); // 16 40
                case 9 -> System.out.println("17 25"); // 17 30
                case 10 -> System.out.println("18 15"); // 18 30
            }
        } else {
            System.out.println(" ");
        }
    }
}
