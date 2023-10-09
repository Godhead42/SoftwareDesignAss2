class BasicProcessor implements Processor {
    @Override
    public String getDescription() {
        return "Basic Processor";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
