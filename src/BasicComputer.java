class BasicComputer implements Computer {
    @Override
    public String getDescription() {
        return "Basic Computer";
    }

    @Override
    public double getCost() {
        return 500.0;
    }
}