package cy.stankevich.main;

import cy.stankevich.entity.Bat;
import cy.stankevich.util.Actions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, I am Harry - the bat. You can call me Batman! Boo");
        Bat bat = new Bat();
        Actions actions = new Actions();
        try { // Sleeps for 1000 milliseconds
            actions.startActivity(bat);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}