import java.util.*;
public class ABCD{
 public static void main (String args[]){
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter The starting alpha bet");
  char a=sc.next().charAt(0);
  System.out.println("Enter The ending alpha bet");
  char b=sc.next().charAt(0);

  for (char i=a;i<=b;i++){
   for (char j=a;j<=i;j++){
    System.out.print(j);
   } 
   System.out.println();
  }
 }
}