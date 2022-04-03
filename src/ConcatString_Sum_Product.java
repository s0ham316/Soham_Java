import java.util.Scanner;

public class ConcatString_Sum_Product {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int sum=0,prod=1,num;
        for (int i=1;i<=10;i++){
            System.out.println("Enter the Number: ");
            num=scanner.nextInt();
            sum+=num;
            prod*=num;
        }
        System.out.println("Concatenated String: ");
        System.out.println(sum +Integer.toString(prod));
    }
}
