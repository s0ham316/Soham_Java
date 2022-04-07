import java.util.Scanner;

public class Second_max_min {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int i;
        System.out.println("Enter the elements of the array");
        for (i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int min,max=0,smax=0,smin=0;
        for (i=0;i<n;i++){
            if (arr[i]>max){
                smax=max;
                max=arr[i];
            }
        }
        i=0;
        if (max==arr[i]){
            smax=arr[i+1];
            for (i=2;i<n;i++){
                if (arr[i]>smax)
                    smax=arr[i];
            }
            System.out.println("Second Max = "+smax);
        }
        else {
            System.out.println("Second Max = "+smax);
        }
        min=max;
        for (i=0;i<n;i++){
            if (arr[i]<min){
                smin=min;
                min=arr[i];
            }
        }
        i=0;
        if (min==arr[i]){
            smin=arr[i+1];
            for (i=2;i<n;i++){
                if (arr[i]<smin)
                    smin=arr[i];
            }
            System.out.println("Second Min = "+smin);
        }
        else {
            System.out.println("Second Min = "+smin);
        }
    }
}
