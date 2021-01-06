package CommandPattern;

import CommandPattern.GarageDoor.GarageDoor;
import CommandPattern.GarageDoor.GarageDoorCloseCommand;
import CommandPattern.GarageDoor.GarageDoorOpenCommand;
import CommandPattern.Light.Light;
import CommandPattern.Light.LightOffCommand;
import CommandPattern.Light.LightOnCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, garageDoorOpen};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, garageDoorClose};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("-- - Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("-- - Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);

        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        /*remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorOpen, garageDoorClose);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();*/
    }
}
