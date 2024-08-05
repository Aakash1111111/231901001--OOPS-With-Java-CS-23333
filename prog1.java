import java.util.Scanner;

class prog1
{
 public static void main(String args[])
{
 Scanner myobj= new Scanner(System.in);
 int widget= myobj.nextInt();
 int gismos= myobj.nextInt();
 System.out.print("The total weight of all these widgets and gismos is ");
 System.out.print( (widget*75) + (gismos*112) );
 System.out.print(" grams");
}
}
