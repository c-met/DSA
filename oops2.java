public class oops2 {
    public static void main(String[] args) {
         BankAccount myAcc = new BankAccount();
    myAcc.username = "unknown";
    myAcc.setpassword("uuhjb");
        
    }
    
}
class BankAccount{
    public String username;
   private String password;
   public void setpassword(String pwd){
    password=pwd;
   }
     
}