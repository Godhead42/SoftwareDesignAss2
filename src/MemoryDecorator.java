public class MemoryDecorator extends ComputerDecorator {
    public MemoryDecorator(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Memory";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.0;
    }
}
