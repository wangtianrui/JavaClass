package classfour.worker;

public class Worker extends Employee {
    private double salary;
    private double commission;
    private int quantity;

    public Worker(String firstName, String lastName,
                  double salary, double commission, int quantity) {
        super(firstName, lastName);
        this.salary = salary;
        this.commission = commission;
        this.quantity = quantity;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setQuantity(int quantity) {
         /*
        如果销售额和奖金挂钩，逻辑处理写在这儿
         */
        this.quantity = quantity;
    }

    @Override
    public double earnings() {
        return this.salary + this.commission;
    }
}
