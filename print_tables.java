import java.io.*;
class print_tables
{
public static void main(String args[]) throws IOException
{
System.out.println("Welcome to tables printer \n");
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number which you want to print the table:");
int i=Integer.parseInt(br.readLine());
int j=0;
for (j=1;j<=10;j++)
System.out.println(i+" * "+j+" = "+(i*j));
}
}