import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = sc.nextInt();

        if (score >= 18) {
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년자입니다");
        }
    }
}