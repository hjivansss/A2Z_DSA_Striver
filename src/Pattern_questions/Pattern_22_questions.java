package Pattern_questions;

public class Pattern_22_questions {
    public static void main(String[] args) {
        pattern22(5);
    }
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void pattern2(int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        int c=1;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(c);
            }
            System.out.println();
            c=c+1;
        }
    }
    public static void pattern5(int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n-i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <n-i; j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    //imp
    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        pattern7( n);
        pattern8(n);
    }
    //imp
    public static void pattern10(int n){
        for(int i=1;i<2*n;i++){
            int stars=i;
            if(i>n){stars=2*n-i;}
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //imp
    public static void pattern11(int n){
        int start=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){start=0;}
            else{start=1;}
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=2*n-2*i+1;j>=2;j--){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void pattern13(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count + " ");
                count+=1;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n) {
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for(int i=0;i<n;i++){
            for(char ch = 'A'; ch<='A'+(n-i-1);ch++){
                System.out.print(ch + " ");

            }
            System.out.println();

        }
    }
    public static void pattern16(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)((int)('A'+i)) + " ");

            }
            System.out.println();

        }
    }
    //imp
    public static void pattern17(int n){
        // Outer loop for the number of rows.
        for(int i=0;i<n;i++){

            //  spaces.
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //  characters.
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){

                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }

            // for printing the spaces again.
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void pattern18(int n){
        // Outer loop for the no. of rows.
        for(int i=0;i<n;i++){

            // Inner loop for printing the alphabets from
            // A + N -1 -i (i is row no.) to A + N -1 ( E in this case).
            for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){

                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void pattern19(int n) {
        int iniSpaces = 0;
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            //Spaces
            for (int j = 0; j < iniSpaces; j++) {
                System.out.print("  ");
            }

            //stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            iniSpaces += 2;
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            iniSpaces -= 2;
            //stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            //Spaces
            for (int j = 0; j < iniSpaces; j++) {
                System.out.print("  ");
            }
            //Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    //imp
    public static void pattern20(int n){
        // initialising the spaces.
        int spaces = 2*n-2;

        // Outer loop for printing row.
        for(int i = 1;i<=2*n-1;i++){

            // stars for first half
            int stars = i;

            // stars for the second half.
            if(i>n) stars = 2*n - i;

            //for printing the stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            //for printing the spaces
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            //for printing the stars
            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }

            System.out.println();
            if(i<n) spaces -=2;
            else spaces +=2;
        }
    }
    public static void pattern21(int n){
        // outer loop for no. of rows.
        for(int i=0;i<n;i++){

            // inner loop for printing the stars at borders only.
            for(int j=0;j<n;j++){

                if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("*");

                    // if not border index, print space.
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                System.out.print(n-min(min(top,bottom),min(left,right)));
            }
            System.out.println();
        }
    }
    public static int min(int a,int b){
        if(a<b) return a;
        else return b;

    }
}