import java.util.*;
class Main{
    public  static void main(String args[]){
      Scanner sc=new Scanner(System.in);
     
    

System.out.println();}
    


    
    public   boolean [] prime(int n){
        boolean a[]=new boolean[n];
        a[0]=true;
        a[1]=true;
        for(int i=2;i*i<n;i++){
            if(!a[i]){
            for(int j=i*2;j<n;j+=i){
                a[j]=true;
            }}
        }
    
        return a;

    }
    





}