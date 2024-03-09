import java.util.Random;
import java.util.Scanner;
class shruti
{
    public static void main(String[] args) {
    
        Random ra = new Random();
        int a = ra.nextInt(10);
        System.out.println("created");
        int num;
        Scanner sc = new Scanner(System.in);
         do
        {
            
            System.out.println("Enter the number:");
            num = sc.nextInt();
            if (num > a)
            {
                System.out.println("high, Try");
            }
            else if (num < a)
            {
                System.out.println("low,try");
            }
            else if (num == a)
            {
               break;
            }
        }while(num != a);
        sc.close();
        System.out.println("correct");
        
        
    }
}