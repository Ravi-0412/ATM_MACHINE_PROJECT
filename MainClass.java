import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterface operation= new AtmOperationImpl();
        // 1st validate the user using ATM pin
        // setting the ATM pin
        int Pin= 1234;
        // ask the atm pin from the user and then validate 
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome To SBI !!");
        System.out.print("Enter Pin : ");
        int atmPin= sc.nextInt();
        if(atmPin== Pin) {
            // System.out.println("Validation Successful");
            // show the menu
            while(true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Mini Statement\n5.Exit");
                // Ask for choice
                System.out.println("Enter Choice : ");
                int choice= sc.nextInt();
                if(choice== 1){
                    operation.viewBalance();

                }
                else if(choice== 2){
                    System.out.println("Enter Amount to withdraw : ");
                    double amount= sc.nextDouble();
                    operation.withdrawAmount(amount);


                }
                else if(choice== 3){
                    System.out.println("Enter Amount to deposit : ");
                    double amount= sc.nextDouble();
                    operation.depositAmount(amount);

                    
                    
                }
                else if(choice== 4){
                    operation.miniStatement();
                    
                }
                else if(choice== 5){
                    System.out.println("Collect Your ATM Card\nThank you! ");
                    System.exit(0);
                    
                }
                else {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else {
            System.out.println("Incorrect Pin");
            System.exit(0);
        }
    }

}
