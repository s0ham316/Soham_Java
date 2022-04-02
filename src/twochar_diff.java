import java.util.Scanner;

public class twochar_diff {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char ch1,ch2;
        System.out.println("Enter The First Character");
        ch1=scanner.next().charAt(0);
        System.out.println("Enter The Second Character");
        ch2=scanner.next().charAt(0);
        int diff=(int) ch1-ch2;
        if (diff==0){
            System.out.println("Both The Characters are Same");
        }
        else if (diff<0){
            System.out.println("The First Character is Smaller");
        }
        else {
            System.out.println("Second Character is Smaller");
        }
    }
}
