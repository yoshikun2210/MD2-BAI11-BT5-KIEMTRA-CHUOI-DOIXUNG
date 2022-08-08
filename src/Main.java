import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String mWord = scanner.nextLine();
        String[] list = mWord.split("");
        String mWord1 = "";

        for (int i = 0; i < list.length; i++) {
            wStack.push(list[i]);
        }
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            mWord1 += wStack.pop();
        }
        System.out.println(mWord1);
        if (mWord.equals(mWord1)){
            System.out.println("Đây là chuỗi đối xứng");
        } else {
            System.out.println("Đây là chuỗi không đối xứng");
        }
    }
}