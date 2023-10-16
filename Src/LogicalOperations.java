import java.util.Scanner;

public class LogicalOperations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press esc or exit to quit the game");
        String response = scanner.next();
        if(!response.equals("esc") || !response.equals("exit")){
            System.out.println("You leave the game");
        }
        else{
            System.out.println("You still playing the game");
        }
        //int temp = 1;
        //if(temp>40) {
        //System.out.println("It is hot outside");
        //}
        //else  if(temp>=20 && temp<=40){
        //System.out.println("It is warm outside");
        //}
        //else{
        //System.out.println("It is cold outside");
        //}
// }
//}
    }
    }