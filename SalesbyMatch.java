import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            count=1;
            if(a[i]!=0){
                for(int j=i+1;j<a.length;j++ ){
                    if(a[i]==a[j]){
                        a[j]= 0;
                        // System.out.println(j + " "+  a[j]);
                        count++;
                        
                    }
                }
                sum = sum + (count/2); 
            }
            
        }
        System.out.println(sum);
    }
}
