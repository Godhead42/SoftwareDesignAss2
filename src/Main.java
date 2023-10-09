public class Main {
    public static void main(String[] args) {
        Computer computer = new BasicComputer();

        // Добавление комплектующих
        computer = new ProcessorDecorator(computer, new HighPerformanceProcessor());
        computer = new MemoryDecorator(computer);
        computer = new GraphicsCardDecorator(computer);

        System.out.println("Description: " + computer.getDescription());
        System.out.println("Total Cost: $" + computer.getCost());
    }
}
