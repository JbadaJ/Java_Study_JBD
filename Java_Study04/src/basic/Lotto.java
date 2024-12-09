package basic;

import java.util.*;

public class Lotto{
    public static void main(String[] args) {
        // 로또 번호 생성
        Set<Integer> lottoNumbers = generateLottoNumbers();

        // 출력
        System.out.println("Generated Lotto Numbers: " + lottoNumbers);
    }

    /**
     * 로또 번호 생성 (1~45 사이의 중복 없는 6개)
     */
    public static Set<Integer> generateLottoNumbers() {
        Set<Integer> lottoNumbers = new TreeSet<>(); // 정렬된 중복 없는 집합
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int number = random.nextInt(45) + 1; // 1부터 45까지
            lottoNumbers.add(number); // 중복 자동 제거
        }
        return lottoNumbers;
    }
}
