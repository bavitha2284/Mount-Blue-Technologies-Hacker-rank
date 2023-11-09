import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=3;
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int apoints=0;
        int bpoints=0;
        for(int i=0;i<n;i++){
            if(a[i] < b[i]){
                bpoints++;
            }
            else if (b[i] < a[i]){
                apoints++;
            }
            else if(a[i]==b[i]){
                
            }
        }
        System.out.println(apoints+" "+bpoints);
    }
}
