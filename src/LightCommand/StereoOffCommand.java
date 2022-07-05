package LightCommand;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        System.out.println(stereo.name+" 오디오가 꺼졌습니다");
    }

    @Override
    public void undo() {

    }
}
