import java.io.*;
import java.util.Scanner;

class prog4
{
public static void main(String args[])
{
 Scanner obj= new Scanner(System.in);
 int a= obj.nextInt();
 int b=a%10;
 System.out.println(Math.abs(b));
}
}
