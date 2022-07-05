package LightCommand;

public class Stereo {
    String name;
    public Stereo(String str) {
        name = str;
    }


    public void on() {
        System.out.println(name +" 오디오가 켜졌습니다");
    }

    public void setCD() {
        System.out.println(name +" 오디오에서 CD가 재생됩니다");
    }

    public void setVolume(int i) {
        System.out.println(name + " 오디오의 볼륨이 " + i + "로 설정되었습니다.");
    }
}
