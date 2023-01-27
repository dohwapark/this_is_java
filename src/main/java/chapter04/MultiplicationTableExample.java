package chapter04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("ㅡㅡㅡ " + i + "단 ㅡㅡㅡ");
            for (int j = 1; j < 9; j++) {
                System.out.println("\t"+i + "x" + j + "=" + (i * j));
            }
        }
    }
}
