import java.util.Scanner;

public class perfect_squares {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[20];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter number at index "+i);
            arr[i]=scanner.nextInt();
        }
        for (int j : arr) {
            for (int c = 1; c <= j; c++) {
                if (c * c == j) {
                    System.out.print(j+" ");
                }
            }
        }
    }
}
