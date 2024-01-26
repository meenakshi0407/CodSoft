import java.util.Scanner;

public class grade {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n=5;
         int sub[]=new int[n];

        System.out.println("Enter the marks for :\n 1-DSA\n 2-OOP \n 3-BCN \n 4-LDCO \n 5-DM\n");
        for(int i=0;i<n;i++){
            System.out.println("Enter the marks for - "+(i+1)+" : ");
            sub[i]=sc.nextInt();
        }

        int sum=0;

        for(int i=0;i<n;i++){
            sum+=sub[i];
        }
        
        System.out.println(sum);

        int total=n*100;
        System.out.println("The aggregate of all Subjects is : "+total);

        int per=(sum*100)/total;
        System.out.println("The percentages obtained : "+per+"%");

        if(per>=80 && per<=100)
        {
            System.out.println("The grade is - A");
        }
        else if(per>=70 && per<=79)
        {
            System.out.println("The grade is - B");
        }
        else if(per>=60 && per<=69)
        {
            System.out.println("The grade is - C");
        }
        else if(per>=50 && per<=59)
        {
            System.out.println("The grade is - D");
        }
        else if(per>=0 && per<=49)
        {
            System.out.println("The grade is - F");
        }
    }
}
