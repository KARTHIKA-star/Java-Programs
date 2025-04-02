import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class Solution {

    public static void main(String[] args) {
        HashMap<Integer,HashSet<Integer>>hm=new HashMap<>();
        int n,T,R,i,j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(n-->0){
           T=s.nextInt();
           R=s.nextInt();
            for(j=1;j<=R;j++){
               int id=s.nextInt();
               int c=s.nextInt();                
                hm.put(id,new HashSet<>());

            if (hm.get(id).contains(c)){
                System.out.println("Scenario #"+ (n+1)+ ": impossible");
                break;
            }
            else
            {
                hm.get(id).add(id);
               
            }
           
        }
           
              System.out.println("Scenario #"+ (n+1) + ": possible");
        }
         
    }
    
}