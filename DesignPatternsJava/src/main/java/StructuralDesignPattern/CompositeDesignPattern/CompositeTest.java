package StructuralDesignPattern.CompositeDesignPattern;

public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf(5000, "hard drive");
        Component mouse = new Leaf(1000, "mouse");
        Component cpu = new Leaf(6000, "cpu");
        Component keyboard = new Leaf(3000, "keyboard");
        Component monitor = new Leaf(8000, "monitor");

        Composite ph = new Composite("Peri");
        Composite cb = new Composite("Cabinet");
        Composite mb = new Composite("motherboard");
        Composite computer = new Composite("Computer");

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cb.addComponent(hd);
        mb.addComponent(cpu);
        ph.addComponent(keyboard);
        computer.addComponent(ph);
        computer.addComponent(cb);
        computer.addComponent(mb);

        ph.showPrice();
        computer.showPrice();

    }
}
