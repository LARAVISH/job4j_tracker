package ru.job4j.tracker;

public class StartUI {
    private final OutPut out;

    public StartUI(OutPut out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        OutPut out = new ConsoleOutPut();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out), new ShowAction(out), new ReplaceAction(out),
                new DeleteAction(out), new FindItemBeIdAction(out),
                new FindItemsByNameAction(out), new ExitAction()
        };
        new StartUI(out).init(input, tracker, actions);
    }
}