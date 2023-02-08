package chapter05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        // beginIndex부터 endIndex앞까지 잘라내기
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        // beginIndex부터 끝까지 잘라내기
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

    }
}
