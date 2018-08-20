package com.lepkovich.command.model.impl;

import com.lepkovich.command.model.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Command is not implemented");
    }
}
