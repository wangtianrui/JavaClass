package classthree;

public class Three {
    protected int test = 1;

    public static void main(String[] args) {
        oddNumber();
        showMultiplicationTable();

    }

    /*
    输出200以内所有奇数
     */
    public static void oddNumber() {
        int temp = 0;
        int count = 0;
        while (temp < 200) {
            if (temp % 2 == 1) {
                System.out.print(temp + "  ");
                count++;
            }
            if (count % 10 == 0) {
                System.out.println();
            }
            temp++;
        }
    }


    /*
    输出下三角99乘法表
     */
    public static void showMultiplicationTable() {
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {
                if (i <= j) {
                    System.out.print(i + "x" + j + "=" + i * j + '\t');
                }
            }
            System.out.println();
        }
    }
}
