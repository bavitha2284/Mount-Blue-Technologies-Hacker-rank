import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k1=sc.nextInt();
        int j1=sc.nextInt();
        int k2=sc.nextInt();
        int j2=sc.nextInt();
        // follow arthematic progression a+nd
        float n=(float)(k1-k2)/(float)(j2-j1);
        float m=n/(int)n;
        if( n<1 || m!=1 ){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
