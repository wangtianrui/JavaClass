package classsix;

public class six {
    public static void main(String[] args) {
        Context contextA = new Context(new StrategyA());
        contextA.showMyStrategy();
        Context contextB = new Context(new StrategyB());
        contextB.showMyStrategy();
    }
}
