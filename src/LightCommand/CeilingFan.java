package LightCommand;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String name;
    int speed;



    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void on() {
        System.out.println(name + " 선풍기가 켜졌습니다");
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
