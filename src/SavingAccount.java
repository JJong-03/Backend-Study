public class SavingAccount extends BankAccount implements  Withdrawable{ // extends BankAccount로 불러옴

    boolean isOverdraft; //마이너스 통장
    void transfer(){ // 송금

    };
    public void withdraw() {
        System.out.println("withdraw");
    }
}
