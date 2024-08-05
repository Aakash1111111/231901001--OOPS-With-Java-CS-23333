import java.util.Scanner;

class prog6
{
public static void main(String args[])
{
Scanner obj =new Scanner(System.in);
int Total=obj.nextInt();
int year=Total/365;
int b=Total-(365*year);
int months=b/30;
int days=b-(months*30);
System.out.println("YEARS:"+year+" MONTH:"+months+" DAYS:"+days);
}
}