import java.util.Scanner;

public class frequency_sentence {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Sentence");
        String sent=scanner.nextLine();
        int count=0;
        for (int i=0;i<sent.length();i++){
            char c=sent.charAt(i);
            for (int j=0;j<sent.length();j++){
                if (c==sent.charAt(j)){
                    count++;
                }
            }
            if (c!='0' && c!=' ') {
                System.out.println("Frequency of " + c + " is " + count);
            }
            sent=sent.replace(c,'0');
            count=0;
        }
    }
}
