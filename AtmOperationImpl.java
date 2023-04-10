import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface{
    ATM atm= new ATM();
    // HashMap<Double, String> ministmt= new HashMap<>();  //[amount: message]
    Map<Double, String> ministmt= new LinkedHashMap<>();
    // to print mini statement like last inserted first use stack and store value in tuple 
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance());

        
    }
    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 500 == 0) {
            if(atm.getBalance() >= withdrawAmount) {
                System.out.println("Collect your cash "+withdrawAmount);
                ministmt.put(withdrawAmount, " Amount withdrawn");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
        else {
            System.out.println("Please enter amount in multiple of 500 ");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount+" Deposited Successfully !!");
        ministmt.put(depositAmount, " Amount deposited");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }
    @Override
    public void miniStatement() {
        for(Map.Entry<Double, String> m: ministmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        
    }

}