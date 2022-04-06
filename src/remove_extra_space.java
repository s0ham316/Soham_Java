import java.util.Scanner;

public class remove_extra_space {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Sentence with Extra Spaces");
        String sent=scanner.nextLine();
        System.out.println(sent.replaceAll("\\s+"," ").trim());
    }
}
