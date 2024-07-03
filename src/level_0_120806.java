//정수 num1과 num2가 매개변수로 주어질 때. num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 환성해주세요.

public class level_0_120806 {
    public int solution(int num1, int num2) {
        //num1과 num2로 나눈 값을 저장합니다.
        double a = (double) num1 / num2;

        //결과에 1000을 곱합니다.
        double b = a * 1000;

        //정수 부분을 추출합니다.
        int answer = (int) b;

        return answer;
    }
}