import java.util.Scanner;

public class consonant_word {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Sentence");
        String str=scanner.nextLine();
        str=str+" ";String vowel="AEIOUaeiou";
        int n=str.length(),i,k=0;
        for(i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch==' '){
                String word=str.substring(k,i);
                k=i+1;
                int j;
                for (j=0; j<word.length(); j++)
                    if (vowel.indexOf(word.charAt(j))!=-1)
                        break;
                if (j==word.length())
                    System.out.println(word);
            }
        }
    }
}
