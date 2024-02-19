import java.util.Scanner;

public class ReverseOfgivenNumber {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int Lastdigit=n%10;
            rev=(rev*10)+Lastdigit;
            n=n/10;


        }
        System.out.println(rev);
    }
}
