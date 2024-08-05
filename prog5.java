import java.util.Scanner;

class prog5
{
 public static void main(String args[])
{
 Scanner obj= new Scanner(System.in);
 int a= obj.nextInt();
 int b= obj.nextInt();
 int c= Math.abs(a%10);
 int d= Math.abs(b%10);
 System.out.println(c+d);
}
}
