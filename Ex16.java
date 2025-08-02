import java.util.Scanner;

public class Ex16 {
    public static void main(String [] args){
Scanner scanner =new Scanner(System.in);
String again;
 do{
    System.out.print("Analyze a number : ");
 int number=scanner.nextInt();
  if(isEven(number)){
    System.out.println(number + " is Even!");
  }
  else{
    System.out.println(number + " is Odd!");
  }
  String sign=signOfNumber(number);
  System.out.println(number + " is " + sign);

  if(isPerfectSquare(number)){
    System.out.println(number + " is a perfect square!");
  }
  else{
    System.out.println(number + " is NOT a perfect square!");
  }
  System.out.print("Do you want to analyze again (y/n)? : ");
  scanner.nextLine();
  again=scanner.nextLine().trim().toLowerCase();
 }while(again.equals("y"));
      System.out.println("\n👋🏻");
      scanner.close();
    }
    static boolean isEven(int number){
        if (number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    static String signOfNumber(int number){
        if(number>0){
            return "Positive";
        }
        else if(number<0){
            return "Negative";
        }
        else{
      return "Zero";
        }
    }
 static boolean isPerfectSquare(int number){
    if(Math.sqrt(number)%1==0){
        return true;
    }
    else {
        return false;
    }

 }
}
