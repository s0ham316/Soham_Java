public class pattern_char1 {
    public static void main(String[] args){
        int i,j,flag=1;
        char c;
        for (i=65;i<=90;i++){
            for (j=65;j<=i;j++){
                if (flag==1)
                    c=(char)j;
                else
                    c=(char)(j+32);
                System.out.print(c);
            }
            System.out.println();
            flag*=-1;
        }
    }
}
