package jm.task.core.jdbc.service;

import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        UserServiceImpl userService = new UserServiceImpl();

        /*userService.createUsersTable();
        userService.saveUser("Алекс", "Додиков", 34);
        userService.saveUser("Саня", "Горбачев", 51);
        userService.saveUser("Ваня", "Пирожков", 85);
        userService.saveUser("Толя", "Петушков", 12);*/

       // userService.removeUserById(3);

      // userService.cleanUsersTable();

        //userService.getAllUsers();

        userService.dropUsersTable();
    }
}
