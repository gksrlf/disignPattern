package LightCommand;

public class RemoteLoader {
        public static void main(String[] args) {
//        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
//
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//
//        CeilingFandMediumCommand ceilingFandMedium = new CeilingFandMediumCommand(ceilingFan);
//        CeilingFanHighCommand ceilingFanHigh =
//                new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff =
//                new CeilingFanOffCommand(ceilingFan);
//
//        remoteControl.setCommand(0,ceilingFandMedium,ceilingFanOff);
//        remoteControl.setCommand(1,ceilingFanHigh,ceilingFanOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//
//
//        Light livingRoomLight = new Light("Living Room");
//
//        LightOnCommand livingRoomLightOn =
//                new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff =
//                new LightOffCommand(livingRoomLight);
//
//        remoteControl.setCommand(0,livingRoomLightOn, livingRoomLightOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(0);
//    System.out.println(remoteControl);
//    remoteControl.undoButtonWasPushed();
//    }
                Light light = new Light("Living Room");
                Stereo stereo = new Stereo("Living Room");

                LightOnCommand lightOn = new LightOnCommand(light);
                StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
                LightOffCommand lightOff = new LightOffCommand(light);
                StereoOffCommand stereoOff = new StereoOffCommand(stereo);
                Command[] partyOn = { lightOn,stereoOn};
                Command[] partyOff = {lightOff,stereoOff};

                MacroCommand partyOnMacro = new MacroCommand(partyOn);
                MacroCommand partyOffMacro = new MacroCommand(partyOff);

                RemoteControl remoteControl = new RemoteControl();
                remoteControl.setCommand(0,partyOnMacro,partyOffMacro);
                System.out.println(remoteControl);
                System.out.println("--- 매크로 ON ---");
                remoteControl.onButtonWasPushed(0);
                System.out.println("--- 매크로 OFF ---");
                remoteControl.offButtonWasPushed(0);
        }
}
