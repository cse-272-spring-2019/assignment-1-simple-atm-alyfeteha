package ATM;

public class MoneyAction {
        String creditcardnumber="0000" ;
        static double balancex ;
        int x;
    HistoryOfTransactions history=new HistoryOfTransactions();
    public int verification(String num){
            x = 0;
        if(num.equals(creditcardnumber))
            x = 1;
        return x;
        }

    public void Deposite(double y){
       balancex=balancex+y;
        history.array.add("Deposite");
        history.array1.add(y);
    }
    public double Withdraw(double z) {
            balancex -= z;
            history.array.add("Withdraw");
            history.array1.add(z);
            return balancex;
        }
        public double Queryu(){
        return balancex;
        }

}
