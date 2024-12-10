package CreationalDesignPattern.BuilderDesignPattern;

public class Phone {
    private String os;
    private String ram;
    private String processor;
    private String screenSize;
    private int battery;

    public Phone(String os, String ram, String processor, String screenSize, int battery) {
        super();
        this.os = os;
        this.battery = battery;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;

    }

    @Override
    public String toString() {
        return new StringBuilder().append("Phone[os=").append(os).append("battery=").append(battery).append("ram=")
                .append(ram).append("processor=").append(processor).append("screenSize=").append(screenSize).toString();
    }
}
