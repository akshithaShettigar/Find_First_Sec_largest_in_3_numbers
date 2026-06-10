//find the 1st and 2nd largest in given three numbers by using methods
import java.util.Scanner;
class largest{
    int n1,n2,n3;
    int large;
    int secLarge;
    largest(int n1,int n2, int n3){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
    }
    void calc(){
        if(n1>n2){
            large=n1;
            secLarge=n2;
        }else{
            large=n2;
            secLarge=n1;
        }
        if(n3>large){
            large=secLarge;
            large=n3;
        }else if(n3>secLarge){
            secLarge=n3;
        }
         System.out.println("The Largest number is :"+large);
        System.out.println("The second largest is :"+secLarge);
    }
   
}
class FSLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a numbers:\t");
        int n1= sc.nextInt();
         int n2= sc.nextInt();
          int n3= sc.nextInt();
        largest r1= new largest(n1,n2,n3);
        r1.calc();
   }
    }

