import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {

        // 예외(Exception)

        ArrayList arrayList = new ArrayList(3);
        try {
            arrayList.get(10);
        } catch (Exception e){
            e.printStackTrace(); // 에러 메세지 보여주기
            System.out.println("에러발생");
        } finally{ // 어떻든 finally는 진행시킴. 함수가 돌아가는지 확인하기 위함.
            System.out.println("finally");
        }
    }
}
