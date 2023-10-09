class ProcessorDecorator extends ComputerDecorator {
    private Processor processor;

    public ProcessorDecorator(Computer computer, Processor processor) {
        super(computer);
        this.processor = processor;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + processor.getDescription();
    }

    @Override
    public double getCost() {
        return super.getCost() + processor.getCost();
    }
}