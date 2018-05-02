package classsix;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void showMyStrategy() {
        this.strategy.strategyInterface();
    }
}
