package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User res = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                res = user;
                break;
            }
        }
        if (res == null) {
            throw new UserNotFoundException("user not found");
        }
        return res;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("Not a valid user");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
       User[] users = {new User("Petr Arsentev", true)};
        User user = findUser(users, "Petr Arsentev");
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }

        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
