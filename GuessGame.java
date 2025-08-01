import java.util.Random;
import java.util.Scanner;
 
public class GuessGame{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        int guess;
        boolean playAgain=true;
        int dificult;
        int totPlay=0;
        int totWin=0;
        while(playAgain){
        System.out.println("Choose dificulty : ");
        System.out.println("1.Easy (1-50), 7 attempts");
            System.out.println("2.Medium (1-100), 5 attempts");
                System.out.println("3.Hard (1-200), 4 attempts");
                System.out.print("Enter the dificulty (1,2 or 3) : ");
                dificult=scanner.nextInt();
            int maxNum=0;
            int maxAttempts=0;
            if(dificult == 1){
                maxNum=50;
                maxAttempts=7;
            }
            else if (dificult == 2){
                maxNum=100;
                maxAttempts=5;
            }
            else if (dificult == 3){
                maxNum=200;
             maxAttempts=4;
            }
            else{
                System.out.println("You should enter 1,2 or 3!");
                continue;
            }
            int number =random.nextInt(1,maxNum+1);
            System.out.print("Guess the number : ");
            guess=scanner.nextInt();
             int attempt=1;
             boolean correct=false;
            while(attempt<maxAttempts){
                if(guess == number){
                    System.out.println("🎉 CORRECT! , The number was : " +number);
                    totWin++;
                    correct=true;
                    break;
                }
                else if(guess <number){
                    System.out.println("TOO LOW ⬇️");
                }
                else {
                    System.out.println("TOO HIGH ⬆️");
                }
                System.out.print("Try again : ");
                guess=scanner.nextInt();
               attempt++;
            }
            if(!correct){
                System.out.println("😢 SORRY you didnt guess it , The number was : " +number);
               }
            totPlay++;
               System.out.print("Do you want to play again (yes/no) : ");
               scanner.nextLine();
               String playA = scanner.nextLine().trim().toLowerCase();
               playAgain=playA.equals("yes");
        }
        System.out.println("\n😃Thank Your for playing!");
        System.out.println("🎮Your total played games are : "+totPlay);
        System.out.println("🥇Your total wins : "+totWin);
 scanner.close();
            }
    }
