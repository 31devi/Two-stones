import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner kbd=new Scanner(System.in);
     int N=kbd.nextInt();
     if(N%2==0){
       System.out.print("Bob");
     }
     else{
       System.out.print("Alice");
     }
  }
}