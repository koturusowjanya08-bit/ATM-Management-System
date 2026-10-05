import java.util.Scanner;
public class ATMmanagementsystem {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int correctpin =1234;
        double balance=1000;
        int choice;
        System.out.println("Enter your PIN : ");
        int pin = sc.nextInt();

        if(pin != correctpin){
            System.out.println("Incorrect pin!");
             System.out.println("Access Denied.");
            sc.close();
            return;
        }



        do{
            System.out.println("\n=====ATM MENU=====");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit ");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            
            choice =sc.nextInt();
            switch(choice){
                case 1 :System.out.println("Your Balance is :  " + balance);
                break;

                case 2 : System.out.println("Enter deposit amount :");
                double deposit = sc.nextDouble();

                if(deposit > 0){
                    balance = balance + deposit;
                    System.out.println("Amount deposited Successfully.");
                    System.out.println("New Balance :  " + balance);
                }else{
                    System.out.println("Invalid deposit amount");
                }
                break;

                case 3 :
                    System.out.println("Enter withdraw amount :");
                    double withdraw = sc.nextDouble();

                if(withdraw <= 0){
                    System.out.println("Invalid withdraw amount.");
                }else if(withdraw > balance){
                    System.out.println("Insufficient balance.");
                }else{
                    balance = balance - withdraw;
                    System.out.println("Please Collect Your Cash.");
                    System.out.println("Remaining Balance : " + balance);
                }
                
                case 4 : 
                System.out.println("Thank you for using the ATM");
                break;


                default:
                    System.out.println("Invalid choice.please try again");
            }
        }while(choice!=4);

        sc.close();
    }
    
}
