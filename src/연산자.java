import java.util.ArrayList;

public class 연산자 {
    public static void main(String[] args) {

     ArrayList list = new ArrayList(10); // 10개의 요소를 담은 ArrayList
        list.add(100);
        list.add("INFP"); //.add 값 추가하기

        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));// .get 값을 받기
        }
    }
}

