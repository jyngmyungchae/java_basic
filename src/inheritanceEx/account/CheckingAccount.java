package inheritanceEx.account;

public class CheckingAccount extends Account{

    private String cardNo;

    CheckingAccount (String accId, String ownerName, long balance, String cardNo){
        super(accId, balance, ownerName);
        this.cardNo=cardNo;
    }

    void pay (String cardNo, long money){
        if(this.cardNo.equals(cardNo) && money <=getBalance()){
            withdraw(money);
            return;
        }
        System.out.println("지불이 불가능합니다.");
    }

    @Override
    public void calcRate() {}
}
