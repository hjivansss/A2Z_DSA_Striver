package Basic_Maths;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.println(armstrong(1634));

    }

    public static boolean armstrong(int n){
        int digit=0;
        double sum=0;
        int temp=n;
        int temp2=n;
        while(temp!=0){
            temp=temp/10;
            digit++;
        }

        while(n>0){
            int ld=n%10;
            sum=sum+Math.pow(ld,digit);
            n=n/10;
        }

        return sum==temp2;
    }
}