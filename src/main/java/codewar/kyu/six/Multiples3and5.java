package codewar.kyu.six;


public class Multiples3and5 {

    public int solution(int number) {
        int result = 0;

        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

}
