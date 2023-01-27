package chapter04;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6)+1;

        switch (num) {
            case 1:
                System.out.println("1번");
                break;
            case 2:
                System.out.println("2번");
                break;
            case 3:
                System.out.println("3번");
                break;
            case 4:
                System.out.println("4번");
                break;
            case 5:
                System.out.println("5번");
                break;
            case 6:
                System.out.println("6번");
//            변수 값과 동일한 값을 갖는 case가 없으면 default로 가서 실행
/*            default:
                System.out.println("6번");*/
        }
    }
}
