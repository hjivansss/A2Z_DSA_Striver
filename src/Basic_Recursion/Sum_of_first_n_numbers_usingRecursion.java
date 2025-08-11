package Basic_Recursion;

public class Sum_of_first_n_numbers_usingRecursion {
    public static void main(String[] args) {
    int n=6;
    recursion(n,0);
    int sum=recursion2(n);
    System.out.println(sum);

}
//Parameterized way
public static void recursion(int n,int sum){
    if(n<1){
        System.out.println(sum);
        return ;}

    recursion(n-1,sum+n);

}
//Functional way
public static int recursion2(int n){

    if(n==0)
        return 0;
    return n+recursion2(n-1);


}
//we can also use n*(n+1)/2
//we can also use for loop
}