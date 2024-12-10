package CreationalDesignPattern.FactoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {
       OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
       OS obj = operatingSystemFactory.getInstance("Open");
       obj.spec();
    }
}
