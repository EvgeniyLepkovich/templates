package com.lepkovich.command;

import com.lepkovich.command.model.impl.Light;
import com.lepkovich.command.model.impl.LightOffCommand;
import com.lepkovich.command.model.impl.LightOnCommand;
import com.lepkovich.command.model.impl.RemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remote.setCommand(2, lightOn, lightOff);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.onButtonWasPushed(1);
    }
}
