
import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=0;
        int max=0;
        int ma=0;int mi=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
         min=a[0];
            max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
                mi++;
            }else if(a[i]>max){
                max=a[i];
                ma++;
            }
        }
        
        System.out.println(ma+" "+ mi);
       
    
    }
}
  
