//객체지향 - 클래스 (main 함수를 만들지 않음)
public class BankAccount {
    // 멤버변수
    // private => 동일 클래스에서만 참조가 가능하고 변경이 가능하다.
    private int bankCode; //은행코드
    private int accountNo; //계좌번호
    private String owner; //소유주
    private int balance; //잔액
    private boolean isDormant; //휴먼계정인지
    private int password; //PW

    // 메소드
    void inquiry(){ //계좌 조회

    }
    void deposit(){ //입금

    }
    void withdraw(){ //출금

    }
    void heldInDormant(){ //휴먼으로 변경

    }
    void changePassword(int password){
        this.password = password;
    }
    // 생성자
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치!
    // new 연산자와 함께 사용
    BankAccount(){}
    BankAccount(int bankCode,  //입력 값들
                int accountNo,
                String owner,
                int balance,
                int password,
                boolean isDormant
    ){
      this.bankCode = bankCode; //class에 정의된 자기 자신을 가리킴
        this.accountNo = accountNo;
        this.owner= owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = isDormant;
    }

    //getter 와 setter는 화면의 우클릭으로 generate에서 만들 수 있다
    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
// 이렇게 만들어 놓고 다른 파일에서 BankAccount를 이용한다.
