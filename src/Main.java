import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rr = new Random();
        int user_score = 0;
        int computer_score = 0;
        System.out.println("welcome to the rocks,papers and scissors");
        System.out.println("1 for rock" + " " + "2 for scissors" + " " + "3 for paper");
        for (int round = 1; round <= 5; round++) {
            System.out.println("\n Match" + round);
            System.out.println("lets play");
            int user_choice = sc.nextInt();
            int computer_choice = rr.nextInt(1, 4);
            System.out.println("your choice is " + user_choice);
            System.out.println("computer choice is " + computer_choice);
            if (user_choice==computer_choice){
                System.out.println("it is draw");
            }

            else if ((user_choice==1&&computer_choice==2)||(user_choice==2&&computer_choice==3)||(user_choice==3&&
                    computer_choice==1)){
                System.out.println("you won the match");
                user_score++;
            }
            else{
                System.out.println("computer won the match");
                computer_score++;
            }

        }
        System.out.println();
        System.out.println("your score is :" + user_score);
        System.out.println("computer score is :" + computer_score);
        if (user_score == computer_score) {
            System.out.println("It is draw");

        }
        System.out.println();

        if (user_score > computer_score) {
            System.out.println("you won the match ");
        }
        else if (user_score==computer_score) {
            System.out.println("the match is draw!please try again");

        }
        else {
            System.out.println("computer won the match");
            System.out.println("Better! luck next time ");
        }

    }
}