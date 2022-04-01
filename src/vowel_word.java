import java.util.Scanner;

public class vowel_word {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String sent=scanner.nextLine();int c=0, d=0,x=0,cn=0;
        sent=" "+sent;
        sent=sent+" ";
        for (int i=0;i<sent.length();i++){
            if (sent.charAt(i)==' '&&i+1<sent.length()){
                for (x=i+1;sent.charAt(x)!=' ';x++,cn++){
                    d=d+1;
                    if (sent.charAt(x)=='a'||sent.charAt(x)=='e'||sent.charAt(x)=='i'||sent.charAt(x)=='o'||sent.charAt(x)=='u'){
                        c=1;
                    }
                }
                if (c==1){
                    String sent2=sent.substring(x-cn,x);
                    System.out.println(sent2);
                }
                d=0;
                c=0;
                cn=0;
                x=0;
            }
        }
    }
}
