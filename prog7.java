import java.util.Scanner;

class prog7
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
int l=0;
if(a>=10)
{
l=(a/10)%10;
}
else
{
l=-1;
}
System.out.println(l);
}
}