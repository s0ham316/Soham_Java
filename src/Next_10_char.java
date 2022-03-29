import java.util.Scanner;

public class Next_10_char {
    public static void main(String[] args){
        char c;
        Scanner scanner=new Scanner(System.in);
        c=scanner.next().charAt(0);
        int n = (int) c + 10;
        System.out.println((char)n);
    }
}
