import java.util.Scanner;

class prog2
{
 public static void main(String args[])
{
 Scanner obj= new Scanner(System.in);
 Float less= obj.nextFloat();
 Float more= obj.nextFloat();
 Double output=(less*0.10)+(more*0.25); 
 System.out.print("Your total refund will be " + "$" + String.format("%.2f",output));
}
}

 