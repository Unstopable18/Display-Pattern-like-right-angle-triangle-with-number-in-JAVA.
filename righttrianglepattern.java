import java.util.Scanner;
public class righttrianglepattern 
{   
    public static void main(String[] args)
    {
        int i,j,n,p;
        System.out.println("********************");
        System.out.print("Input number of rows : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("********************");
        System.out.print("Input pattern character : ");
        p = scanner.nextInt();
        System.out.println("********************");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(p);
            System.out.println("");
        }
        System.out.println("********************");
    }
}