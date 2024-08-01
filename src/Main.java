import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<HashMap<String, String>> questions = new ArrayList<>();

        // 첫 번째 문제
        HashMap<String, String> question1 = new HashMap<>();
        question1.put("question", "1. Python에서 변수를 선언하는 방법은? (점수: 10점)");
        question1.put("choices", "1) var name 2) name = value 3) set name 4) name == value");
        question1.put("correct", "2");
        question1.put("score", "10");
        questions.add(question1);

    }
}