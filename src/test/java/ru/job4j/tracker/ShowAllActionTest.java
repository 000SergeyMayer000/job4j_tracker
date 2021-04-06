package ru.job4j.tracker;

import org.junit.Test;

import javax.swing.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ShowAllActionTest {

    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Output output = new StubOutput();
        Input input = new StubInput(new String[]{"0", "1"});
        UserAction[] actions = {
                new ShowAllAction(output),
                new ExitAction()
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() + "0. Show all items" + System.lineSeparator() + "1. Exit" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() + "0. Show all items" + System.lineSeparator() + "1. Exit" + System.lineSeparator()
        ));
    }
}
