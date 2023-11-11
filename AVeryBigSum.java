import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0l;
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
