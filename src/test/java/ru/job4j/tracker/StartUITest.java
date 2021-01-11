package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class StartUITest {
    @Test
    public void testCreateItem() {

        Input input = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        OutPut out = new StubOutPut();
        UserAction[] actions = {new CreateAction(out), new ExitAction(out)};
        new StartUI(out).init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        OutPut out = new StubOutPut();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", Integer.toString(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        OutPut out = new StubOutPut();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", Integer.toString(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @SuppressWarnings({"checkstyle:OperatorWrap", "checkstyle:LineLength"})
    @Test
    public void whenFindAll() {
        OutPut out = new StubOutPut();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("All items show"));
        String id = String.valueOf(item.getId());
        Input in = new StubInput(new String[]{"0", id, "1"});
        UserAction[] actions = {new ShowAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. === Show all Items ===="
                + System.lineSeparator() + "1. === Exit ===" + System.lineSeparator()
                + tracker.findById(item.getId()) + System.lineSeparator()
                + "Menu." + System.lineSeparator() + "0. === Show all Items ===="
                + System.lineSeparator() + "1. === Exit ===" + System.lineSeparator()));
    }

    @Test
    public void whenDFindByIDItem() {
        OutPut out = new StubOutPut();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("item added"));
        String id = String.valueOf(item.getId());
        Input in = new StubInput(new String[]{"0", id, "1"});
        UserAction[] action = {new FindItemBeIdAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, action);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. === Find item by Id ==="
                + System.lineSeparator() + "1. === Exit ===" + System.lineSeparator()
                + tracker.findById(item.getId()) + System.lineSeparator() + "Menu."
                + System.lineSeparator() + "0. === Find item by Id ===" + System.lineSeparator()
                + "1. === Exit ===" + System.lineSeparator()));
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenFindByName() {
        OutPut out = new StubOutPut();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("item added"));
        String name = item.getName();
        Input input = new StubInput(new String[]{"0", name, "1"});
        UserAction[] action = {new FindItemsByNameAction(out), new ExitAction(out)};
        new StartUI(out).init(input, tracker, action);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. === Find items by name ==="
                + System.lineSeparator() + "1. === Exit ===" + System.lineSeparator()
                + tracker.findById(item.getId()) + System.lineSeparator()
                + "Menu." + System.lineSeparator() + "0. === Find items by name ==="
                + System.lineSeparator() + "1. === Exit ===" + System.lineSeparator()));
    }

    @Test
    public void whenInvalidExit() {
        OutPut out = new StubOutPut();
        Input in = new StubInput(
                new String[]{"10", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. " + actions[0].name() + System.lineSeparator()
                        + "Wrong input, you can select: 0 .. 0" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. " + actions[0].name() + System.lineSeparator()
        ));
    }
}