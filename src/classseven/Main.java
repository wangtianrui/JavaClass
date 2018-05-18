package classseven;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /**
         * txt文件查找
         */
        File file = new File("E:/javaprogrames/JavaStudy/src/classseven/testroom");
        if (file.exists()) {
            findTXT(file);
        } else {
            System.out.println("文件打开失败");
        }


        /**
         * 文件复制
         */
        String resourcePath = "E:/javaprogrames/JavaStudy/src/classseven/testroom/我是txt.txt";
        String goalPath = "E:/javaprogrames/JavaStudy/src/classseven/copytest/我是txt.txt";
        try {
            copyData(resourcePath, goalPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * txt文件查找
     *
     * @param file
     */
    private static void findTXT(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.exists() && f.isDirectory()) {
                findTXT(f);
            } else if (f.getName().endsWith(".txt")) {
                System.out.println(f.getName());
            }
        }
    }

    private static void copyData(String resourcePath, String goalPath) throws IOException {
        FileInputStream inputer = null;
        FileOutputStream outputer = null;

        File inputFile = new File(resourcePath);
        File outputFile = new File(goalPath);

        if (!(inputFile.exists())) {
            System.out.println("文件操作失败");
            return;
        } else if (!outputFile.exists()) {
            outputFile.createNewFile();
            System.out.println("目标目录没有相应文件，已创建");
        }
        try {
            inputer = new FileInputStream(inputFile);
            outputer = new FileOutputStream(outputFile);
            byte[] bytes = new byte[1024];
            int byteRead;
            while ((byteRead = inputer.read(bytes)) > 0) {
                outputer.write(bytes, 0, byteRead);
            }
            System.out.println("复制结束");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            inputer.close();
            outputer.close();
        }

}
}
