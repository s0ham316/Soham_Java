import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int[] newarr=new int[n];
        System.out.println("Enter Array Elements");
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int n1=n-1;
        for (int i=0;i<n;i++){
            newarr[i]=arr[n1];
            n1--;
        }
        for (int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
