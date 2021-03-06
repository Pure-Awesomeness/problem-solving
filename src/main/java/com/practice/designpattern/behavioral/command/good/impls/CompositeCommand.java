package com.practice.designpattern.behavioral.command.good.impls;

import com.practice.designpattern.behavioral.command.good.framework.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.stream().forEach(Command::execute);
    }
}
