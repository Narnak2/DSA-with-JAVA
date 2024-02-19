package Function.src;

public class ProductOfAandB {
    public static int  multiply(int a ,int b){
        int product=a*b;
        return product;

    }
    public static void main(String args[]){
        int a=3;
        int b=2;
        int prod=multiply(a,b);
        System.out.println("a*b is ="+prod);

        int prondd =multiply(20 ,30);
        System.out.println(prondd);


    }
}
