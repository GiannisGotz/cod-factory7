package gr.aueb.cf.ch12mine;

import gr.aueb.cf.ch12mine.model.*;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Giannis", "Gotzaridis");
        UserCredentials userCredentials = new UserCredentials(1, "igkotzar", "monoagapi1@");

        System.out.println("{ "+ user.getId() + " , " + user.getFirstname() + " , " +user.getLastname()+ " }");
        System.out.println("{ "+ userCredentials.getId() + " , " + userCredentials.getUsername() + " , " + userCredentials.getPassword()+ " }");

    }
}
