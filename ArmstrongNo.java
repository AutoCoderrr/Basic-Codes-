import java.util.Scanner;

public class ArmstrongNo {
    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int x = sc.nextInt();
        

        boolean rs= isArmStrong(x);
        if(rs)
        System.out.println("Amstrong no ");
        else
        System.out.println("not a armstrong no ");

sc.close();
    }
    static boolean isArmStrong(int n){
        int sum =0, temp=n;
        int cd= countDigits(n);
        do{
            int d=n%10;
            sum = sum +pow(d, cd);
            n= n/10;
        }while(n!=0);
            return sum == temp;

        }

        static int countDigits(int n){
            int count = 0;
            do {
                n = n/10;
                count++;

            }while(n!=0);
            return count;
        }
        static int pow(int n, int p){
            int prod =1;
            while(p>0){
                prod = prod *n;
                p--;
            }
            return prod;
        }
    }


    

