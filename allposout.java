import java.util.*;
public class allposout{
 public static void main (String args[]){
  Scanner sc=new Scanner (System.in); 
  Random r=new Random();
  System.out.println("Enter digit");
  int n=sc.nextInt();
  int in[]=new int [n];
  int a=0,fc=1,c=0,n1=0,k=0,k1=1;
  for (int i=0;i<n;i++){
   in[i]=sc.nextInt();
   a=a*10+in[i];
  }
  for (int i=1;i<n+1;i++){
   fc*=i;
  }
  int rs[]=new int [fc];
  while (c<fc){
   for(int i=0;i<n;i++){
    int j = r.nextInt(0,n);
    int t=in[i];
    in[i]=in[j];
    in[j]=t;
   }
   n1=0;
   for (int i=0;i<n;i++){
    n1=n1*10+in[i]; 
   }
   k = 0;
   for (int i = 0; i < c; i++) {
    if (rs[i] == n1) {
     k = 1;
     break;
    }
   }
   if (k == 0) {
    rs[c] = n1;
    System.out.println(n1);
    c++;
   }
  }
 }
}