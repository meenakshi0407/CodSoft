import java.util.Scanner;

class account
{
    protected float b,wd,dp;
    protected int acc;
    protected String name,type;
    protected int accNo;

    Scanner sc=new Scanner(System.in);
    account()
    {
        System.out.println("Enter details (name And Type of account) :");
        name = sc.nextLine();
        type= sc.next();
    }
    public void enterBal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur balance : ");
        b= sc.nextFloat();
    }
}

class Withdraw extends account{

    public void checkbal()
    {
        System.out.println("ur acc bal is : "+b);
    }
    public void withdraw()
    {
        System.out.println("Enter amt to be withdrawn : ");
        wd=sc.nextInt();

        if(wd>b)
        {
            System.out.println("Insufficient bal !");

        }
        else if(wd>60000)
        {
            System.out.println("error! request rejected");
        }
        else
        {
            System.out.println("withdrawn: "+wd+"\n and Current balance :"+(b-wd));
            b=b-wd;
        }

    }
    public void deposit()
    {
        System.out.println("enter amt to be deposited");
        dp= sc.nextFloat();

        System.out.println("new balance: "+(b+dp));
        b=b+dp;
    }
}

class ATMInterface
{

    public static void main(String args[])
    {
        Withdraw prs = new Withdraw();
        prs.enterBal();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1-checkBal \n 2-withdraw \n 3-Deposit \n");
        int ch= sc.nextInt();
        while (true) {

            switch (ch) {

                case 1:
                    prs.checkbal();
                    return;

                case 2:
                    prs.withdraw();
                    return;

                case 3:
                    prs.deposit();
                    return;

                default:
                    break;
            }
        }
    }
}
