import Inheritance.Cat;
import Inheritance.Table;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 99;

        System.out.println("arr1[0]: " + arr1[0]);
    }
}
