import java.util.Scanner;
    import java.util.Scanner;
public class Question1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        }
}
