package classone;
import java.util.Random;
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        char a = 'a';
        int b = 9;
        char test = '王';
        //unicode 是所有文字的一个对应的表
        System.out.println(Integer.toHexString(test));
        getUnicode();
        showNumbers();
        reverseOrder();
        game();
    }

    /*
    猜数游戏
     */
    public static boolean game() {
        Random getNumber = new Random();
        int randomNumber = getNumber.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("这是一个0~10的数");
        int inputNumber;
        while (randomNumber != (inputNumber = input.nextInt())) {
            System.out.println("错了哦");
            if (randomNumber > inputNumber) {
                System.out.println("正确答案比这个大");
            } else {
                System.out.println("正确答案比这个小");
            }
        }
        System.out.println("回答正确！");
        return false;
    }

    /*
    输出希腊字母表
     */
    public static void getUnicode() {
        for (char item = 'α'; item <= 'ω'; item++) {
            System.out.println(item);
        }
        char item = 'α';
        System.out.println(Integer.toHexString(item));
        item = 'ω';
        System.out.println(Integer.toHexString(item));
    }

    /*
    输出数组各元素和数组名
     */
    public static void showNumbers() {
        int numbers[] = {1, 5, 6, 2, 7, 3};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println(numbers);
    }

    /*
    数组倒序后输出
     */
    public static void reverseOrder() {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        System.out.println("逆序前：");

        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < (numbers.length / 2); i++) {
            int temp = 0;
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1]; //注意-1
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("逆序后:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
