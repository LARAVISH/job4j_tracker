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
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        OutPut out = new ConsoleOutPut();
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out), new ShowAction(out), new ReplaceAction(out),
                new DeleteAction(out), new FindItemBeIdAction(out),
                new FindItemsByNameAction(out), new ExitAction(out)
        };
        new StartUI(out).init(input, tracker, actions);
    }
}