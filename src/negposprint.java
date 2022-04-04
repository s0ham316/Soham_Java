import java.util.Scanner;

public class negposprint {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter element at index "+i+" of the array");
            arr[i]=scanner.nextInt();
        }
        for (int j : arr) {
            if (j < 0) {
                System.out.print(j + " ");
            }
        }
        for (int j : arr) {
            if (j >= 0) {
                System.out.print(j + " ");
            }
        }
    }
}
