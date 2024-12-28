package basic;

import java.util.Scanner;

public class FindInString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 문장 입력
        System.out.print("첫 번째 문장을 입력하세요: ");
        String sentence = scanner.nextLine();

        // 검색할 단어나 문장 입력
        System.out.print("찾고 싶은 단어나 문장을 입력하세요: ");
        String word = scanner.nextLine();

        scanner.close();

        // 등장 횟수 계산
        int count = countOccurrences(sentence, word);

        // 결과 출력
        System.out.println("결과: " + count + "번 등장합니다.");
    }

    /**
     * sentence 안에 word가 몇 번 등장하는지 계산하는 메서드
     * (중첩되지 않는 방식으로 검색)
     */
    public static int countOccurrences(String sentence, String word) {
        int count = 0;
        int index = 0;

        // indexOf를 이용해 word가 더 이상 나타나지 않을 때까지 찾기
        while ((index = sentence.indexOf(word, index)) != -1) {
            count++;
            // 찾은 위치 바로 뒤부터 다시 검색
            index += word.length();
        }
        return count;
    }
}
