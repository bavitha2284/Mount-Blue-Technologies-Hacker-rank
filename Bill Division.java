import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int bill[]=new int[n];
        
        for(int i=0;i<n;i++){
            bill[i]=sc.nextInt();
        }
        int bActual=0;
        int sum=0;
        int bCharged=sc.nextInt();
        
        for(int i=0;i<bill.length;i++){
            if(i==k){
                continue;
            }
           sum += bill[i];
        }
        // System.out.println(sum);
        bActual = sum/2;
        // System.out.println(bActual);
        if(bCharged== bActual){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(Math.abs(bCharged-bActual));
        }
    }
}
