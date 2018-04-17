package classfour;

import classfour.shapes.CCircle;
import classfour.shapes.CRectangle;
import classfour.shapes.CShape;
import classfour.worker.HourlyWorker;
import classfour.worker.Worker;

public class four {
    public static void main(String[] args) {
        testWorker();
        System.out.println("-----------------------------------------------");
        testShape();
    }

    public static void testWorker() {
        HourlyWorker hourlyWorker = new HourlyWorker("王", "天锐",
                15.75, 0);
        System.out.println(hourlyWorker + "当前工资为:" + hourlyWorker.earnings());
        hourlyWorker.setHours(13.72);
        System.out.println(hourlyWorker + "工作13.7小时后工资为:" + hourlyWorker.earnings());
        hourlyWorker.setWage(12.01);
        System.out.println(hourlyWorker + "工资修改为每小时12.0元后工资为:" + hourlyWorker.earnings());

        Worker worker = new Worker("小", "王", 2000, 0, 0);
        System.out.println(worker + "的底薪为:" + worker.earnings());
        worker.setCommission(3200.2);
        System.out.println(worker + "得到3200.2元奖金后为：" + worker.earnings());
        worker.setSalary(3000);
        System.out.println(worker + "工作很努力，底薪增加为3000后，奖金为3200.2的工资为：" + worker.earnings());
    }

    public static void testShape() {
        CShape rectangle = new CRectangle(12.3, 11.7);
        System.out.println(rectangle.toString());

        CShape circle = new CCircle(2.7);
        System.out.println(circle.toString());
    }

}
