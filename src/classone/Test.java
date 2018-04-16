package classone;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//1-2+3*(4-5)
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chr = s.toCharArray();  //输入的字符数组
        int len = chr.length;
        char[] b = new char[len];  //开辟一个新等大数组
        Stack<Character> stack = new Stack<>();
        toHouZui(chr, b);  //传入数组和等大placeholder
        for (int i = 0; i < len; i++) {
            System.out.println(b[i]);
        }
        for (int i = 0; i < len; i++) {
            if (!isop(b[i])) stack.push(b[i]);
            else {
                if (b[i] == '*') {
                    int x = (int) (stack.pop());
                    int y = (int) (stack.pop());
                    stack.push((char) (x * y));
                } else if (b[i] == '/') {
                    int x = (int) (stack.pop());
                    int y = (int) (stack.pop());
                    stack.push((char) (x / y));
                } else if (b[i] == '+') {
                    int x = (int) (stack.pop());
                    int y = (int) (stack.pop());
                    stack.push((char) (x + y));
                } else if (b[i] == '-') {
                    int x = (int) (stack.pop());
                    int y = (int) (stack.pop());
                    stack.push((char) (x - y));
                }
            }
        }
        System.out.println(stack.pop());
    }

    private static void toHouZui(char[] a, char[] b) {
        int len = a.length; //输入数组大小
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int i = 0;
        while (count < len) {
            if (isop(a[count])) {
                if (a[count] == '(') {
                    stack.push(a[count]);
                    count++;
                    continue;
                }
                if (stack.size() > 0 && proir(a[count], stack.peek()) > 0) {
                    stack.push(a[count]);
                    count++;
                    continue;
                }
                while ((stack.size() > 0) && (proir(a[count], stack.peek()) == 0 || proir(a[count], stack.peek()) < 0 || stack.peek() != '(')) {
                    b[i++] = stack.pop();
                }
                stack.push(a[count]);
            } else {
                b[i++] = a[count];

            }
            count++;
        }

    }

    private static int proir(char a, char b) {
        if (a == b) return 0;
        if (a == '*' || a == '/') {
            if (b == '*' || b == '/')
                return 0;
            else if (b == '+' || b == '-')
                return 1;
        }
        if (a == '+' || a == '-') {
            if (b == '*' || b == '/')
                return -1;
            else if (b == '+' || b == '-')
                return 0;
        }
        return 0;

    }

    private static boolean isop(char a) {
        if (a == '+' || a == '-' || a == '*' || a == '/' || a == '(' || a == ')') return true;
        else return false;
    }
/*
    private static Stack<Character> noKuoHao(char[] input) {
        Stack<Character> re = new Stack<>();
        int temp = 0;
        ArrayList<Integer> chengChuPostion = getChengChuPosition(input);
        if (chengChuPostion.size() != 0) {
            for (Integer i : chengChuPostion) {

            }
        }
        while (temp < input.length) {

        }
    }

    private static ArrayList<Integer> getChengChuPosition(char[] input) {
        int temp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp < input.length) {
            if (input[temp] == '*' || input[temp] == '/') {
                list.add(temp);
            }
        }
        return list;
    }*/
}
