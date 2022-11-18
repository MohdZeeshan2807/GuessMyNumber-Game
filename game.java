
import java.util.Scanner;
public class game{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        System.out.println("Welcome to MY GAME! ");
        System.out.println("Let's launch the game ");
        
        do{
            System.out.print("Guess my number(1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber){
                System.out.println("Hurray! ... CORRECT NUMBER ... You won!!");
                break;
            }

            else if(userNumber > myNumber){
                System.out.println("Oops your number is too large, try once more!");
            }

            else if(userNumber < myNumber){
                System.out.println("Oops your number is too small, try once more!");
            }

        }while( userNumber >= 0);
        System.out.println("My number was " + myNumber);
        
    }
}

