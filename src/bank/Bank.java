package bank;

public class Bank {
    public class Account{
        private long number;
        private double balance;
        
        public long getNumber(){
            return this.number;
        }
        
        public double getBalance(){
            return this.balance;
        }
        
        public Account(long number){
            this.number = number;
        }
        
        public void deposit(double summa){
            this.balance += summa;
        }
        
        public boolean withdraw(double summa){
            if( this.balance < summa ) return false;
            this.balance -= summa;
            return true;
        }
        
        public void show(){
            System.out.printf("%s %d %g",title,this.number,this.balance);
        }                
    }
    
    private String title;
        
        public void show(){
            System.out.println(this.title);
        }
        
        public Bank(String title){
            this.title = title;
        }
}
