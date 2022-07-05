package LightCommand;

public class Light {
    String name;
    public Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println("켜짐");
    }

    public void off() {
        System.out.println("꺼짐");
    }
}
