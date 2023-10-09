class GraphicsCardDecorator extends ComputerDecorator {
    public GraphicsCardDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Graphics Card";
    }

    @Override
    public double getCost() {
        return super.getCost() + 200.0;
    }
}