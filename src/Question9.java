import java.util.Scanner;


public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수:");
        int number1 = sc.nextInt();
        System.out.print("두번째 수:");
        int number2 = sc.nextInt();

        System.out.print("어떤 연산을 할까요? 1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 ");
        int cal = sc.nextInt();

        switch(cal){
            case 1:
                System.out.println("" + (number1 + number2));
                break;
            case 2:
                System.out.println("" + (number1 - number2));
                break;
            case 3:
                System.out.println("" + (number1 * number2));
                break;
            case 4:
                if(number2 == 0){
                    System.out.println("0으로 나눌수 없습니다.");
                }
                else {
                    System.out.println("" + (number1 / number2));}
                break;

        }


    }
}