package CreationalDesignPattern.FactoryDesignPattern;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("About to die");
    }
}
