package chapter05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        // indexOf() 메소드는 주어진 문자열이 시작되는 인덱스를 리턴
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        String substring = subject.substring(location);
        System.out.println(substring);

        // indexOf() 메소드 사용 시 주어진 문자열이 포함되어 있지 않으면
        // indexOf() 메소드는 -1 을 리턴한다.
        location = subject.indexOf("자바");
        if(location != -1) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }

        // 주어진 문자열이 단순히 포함되어 있는지만 조사하고 싶으면
        // contains() 메소드를 사용하면 편리하다
        // 주어진 문자열이 포함되어 있으면 true를 리턴하고
        // 그렇지 않으면 false를 리턴한다.
        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}
