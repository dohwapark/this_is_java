package chapter05;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2;
        System.out.println(arr1 == arr2); // false
        System.out.println(arr2 == arr3); // true
        // arr1 과 arr2 의 저장 항목은 같지만 서로 다은 배열 객체로 생성 되므로 false
    }
}
