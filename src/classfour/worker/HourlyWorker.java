package classfour.worker;

public class HourlyWorker extends Employee {
    private double wage;
    private double hours;

    public HourlyWorker(String firstName, String lastName,
                        double wage, double hours) {
        super(firstName, lastName);
        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double earnings() {
        return this.wage * this.hours;
    }
}
