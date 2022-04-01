import java.util.Scanner;

public class replace_char_withnext {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no. of characters in array");
        int n=scanner.nextInt();
        char[] arr=new char[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.next().charAt(0);
        }
        char temp=arr[0];
        for(int c=0;c<n;c++){
            arr[c]=arr[c+1];
            if (c+1==n-1){
                arr[n-1]=temp;
                for (int d=0;d<n;d++){
                    System.out.print(arr[d]+" ");
                }
                System.exit(0);
            }
        }
    }
}
