import java.util.*;

public class Question {
    public void runQuest() {

        // 정답 저장을 위한 리스트 생성
        List<Integer> answerList = new ArrayList<>();

        // 점수 계산
        int score = getScore(answerList);

        // 결과 출력
        printResult(answerList, score);
    }

    private static int getScore(List<Integer> answerList) {
        int score = 0;
        Integer[] scoreArr = {10, 15, 10, 5};
        Integer[] indexArr = {0, 1, 2, 3};
        List<Integer> indexList = Arrays.asList(indexArr);
        Collections.shuffle(indexList);

        String[] quesArr = {"Python에서 변수를 선언하는 방법은?", "Python에서 리스트(List)의 특징은 무엇인가요?",
                "Python에서 조건문을 작성하는 방법은?", "Python에서 함수를 정의하는 방법은?"};
        String[][] questArr = {
                {"var name", "name = value", "set name", "name == value"},
                {"순서가 있고 변경 가능하다", "중복된 값을 가질 수 없다", "원소를 추가하거나 삭제할 수 없다", "정렬된 상태로 유지된다"},
                {"if-else", "for-in", "while", "def"},
                {"class", "def", "import", "return"}
        };

        for (int i = 0; i < quesArr.length; i++) {
            int idx = indexList.get(i);
            System.out.println((i + 1) + ". " + quesArr[idx] + " (점수 : " + scoreArr[idx] + "점)");

            Integer[] indexArr02 = {0, 1, 2, 3};
            List<Integer> indexList02 = Arrays.asList(indexArr02);
            Collections.shuffle(indexList02);

            for (int j = 0; j < questArr[idx].length; j++) {
                if (j > 0) System.out.print(" ");
                int idx02 = indexList02.get(j);
                System.out.print((j + 1) + ") " + questArr[idx][idx02]);
            }
            System.out.print("\n" + "-정답 : ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            answerList.add(answer);
            if (questArr[idx][answer - 1].equals("name == value")) score += scoreArr[idx];
            else if (questArr[idx][answer - 1].equals("중복된 값을 가질 수 없다")) score += scoreArr[idx];
            else if (questArr[idx][answer - 1].equals("while")) score += scoreArr[idx];
            else if (questArr[idx][answer - 1].equals("def")) score += scoreArr[idx];
        }
        return score;
    }

    private static void printResult(List<Integer> answerList, int score) {
        System.out.println("—----- 결과 —-------------");
        System.out.print("응답한 내용 : ");
        for (int i = 0; i < answerList.size(); i++) {
            System.out.print(i + 1 + "번 " + answerList.get(i) + ", ");
        }
        System.out.println("\n당신 응답 합계 : " + score + "점");
        String grade = "";
        if (score > 30) grade = "A";
        else if (score > 20) grade = "B";
        else if (score > 10) grade = "C";
        else grade = "F";
        System.out.println("학점은 " + grade + "입니다");
    }
}
