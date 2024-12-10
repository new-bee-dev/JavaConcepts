package CreationalDesignPattern.BuilderDesignPattern;

public class Shop {
    public static void main(String[] args) {
        Phone obj = new PhoneBuilder().setOs("Android").setRam("2 GB").getPhone();
        System.out.println(obj.toString());
    }
}
