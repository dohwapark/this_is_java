package chapter05;

import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 0;
        int[] scores = null;
//        int score = sc.nextInt();
//        int[] scores = new int[students];
        boolean run = true;
        while (run) {
            System.out.println("---------------------------------------");
            System.out.println("1. 학생수 2. 점수입력 3.점수리스트 4.분석 5. 종료");
            System.out.println("---------------------------------------");

            int num = sc.nextInt();

            if (num == 1) {
                System.out.print("학생 수 : ");
                students = sc.nextInt();
                scores = new int[students];
            } else if (num == 2) {
                for (int i = 0; i < students; i++) {
                    System.out.print("score[" + i + "] : ");
                    int score = sc.nextInt();
                    scores[i] = score;
                }
            } else if (num == 3) {
                for (int i = 0; i < students; i++) {
                    System.out.print("score[" + i + "] : ");
                    System.out.print(scores[i]);
                    System.out.println();
                }
            } else if (num == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0;
                for (int i = 0; i < students; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                    sum+= scores[i];
                }
                avg = (double) sum / students;
                System.out.println("최고 점수 : " + max);
                System.out.println("평균 : " + avg);
            } else if (num == 5) {
                run = false;
            }
            //check
        }

    }
}
