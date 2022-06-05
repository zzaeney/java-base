import java.util.Random;
import java.util.Scanner;

public class UpDownExid {
    public static void main(String[] args) {
        int computer = new Random().nextInt(99) + 1; //27
        System.out.println("맞춰봐.. 내 마음 속 숫..자 " + computer);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("맞춰봐.. 어느쪽이게?");
            int number = sc.nextInt();
            if (number == computer) {
                System.out.println("맞췄네..?");
                break;
            } else if (number > computer) {
                System.out.println("너무 크자너..?");
            } else {
                System.out.println("넘 작은디 ;;");
            }
        }
    }
}