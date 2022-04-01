import java.util.Scanner;

public class high_potential_word {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] arr=new String[10];
        int i;
        for (i=0;i<10;i++){
            System.out.println("Enter the Word");
            arr[i]=scanner.next();
        }
        String w=" ";
        int max=0;
        for (i=0;i<10;i++){
            int sum=0;
            for (int j=0;j<arr[i].length();j++){
                sum+=arr[i].charAt(j);
            }
            if (sum>max){
                max=sum;
                w=arr[i];
            }
        }
        System.out.println("Word with Highest Potential="+w);
    }
}
