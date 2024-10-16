package cy.stankevich.util;

import cy.stankevich.entity.Bat;
//до 100%
//0-40//40%// 1.resting upside down in a cave during a day ==> power = + 50
//30-40//10%// 2.flying to another forest ==> power = - 10
//40-50//10%// 3. flying away from a predator ==> power = - 20
//50-70//10// 4. fighting ==> power = -30
//70-75//5%// 5. injured with a predator ==> health = -50
//6. feeding (eating or drinking) ==> power = -5
// 75-80//5%// 6. mango ==> health = satudation * 6
// 80-85//5%// 7. water ==>  health = satudation * 4
// 85-90//5%// 8.melon ==>  health = = satudation * 7
// 90-95//5%// 9.seeds ==>  health = = satudation * 2
// 90-100// 10. starving ==> health = satudation * -10, power= -10


public class Actions {
    public void startActivity(Bat bat) {
        while (checkHealth(bat)) {
            int eventNumber = (int) (Math.random() * 100);
            if(eventNumber >= 0 && eventNumber < 40) {
                rest(bat);
            } else if (eventNumber >= 40 && eventNumber < 50) {
                flyingForest(bat);
            } else if (eventNumber >= 50 && eventNumber < 60) {
                flyingAway(bat);
            }  else if (eventNumber >= 70 && eventNumber < 80) {
                fighting(bat);
            } else if (eventNumber >= 80 && eventNumber < 85) {
                injured(bat);
            } else if (eventNumber >= 85 && eventNumber < 90) {
                eatMango(bat);
            } else if (eventNumber >= 80 && eventNumber < 85) {
                drinkWater(bat);
            } else if (eventNumber >= 85 && eventNumber < 90) {
                eatMelon(bat);
            } else if (eventNumber >= 90 && eventNumber < 95) {
                eatSeeds(bat);
            } else if (eventNumber >= 95 && eventNumber <= 100) {
                starve(bat);
            }
        }
        System.out.println("=Sad music= Poor Harry the bat is dad (= ");
    }
    private void rest(Bat bat) {
        int power = bat.getPower();
        power = power + 50;
        if(power > 100){
            power = 100;
        }
        if(power < 0) {
            power = 0;
        }
        bat.setPower(power);
        checkPower(bat);
        System.out.println("I rested in the dark cave. Feeling much better!\n\tPower is + 50 points. Total is " + bat.getPower());
    }
    private void flyingForest(Bat bat) {
        int power = bat.getPower();
        power = power - 10;
        if(power > 100){
            power = 100;
        }
        if(power < 0){
            power = 0;
        }
        bat.setPower(power);
        checkPower(bat);
        System.out.println("I was flying to another forest. Get tired!\n\tPower is - 10 points.Total is " + bat.getPower());
    }
    private void flyingAway(Bat bat) {
        int power = bat.getPower();
        power = power - 10;
        if(power > 100){
            power = 100;
        }
        if(power < 0){
            power = 0;
        }
        bat.setPower(power);
        checkPower(bat);
        System.out.println("I was attackted, but I ran away.\n\tPower is - 10 points.Total is " + bat.getPower());
    }
    private void fighting(Bat bat) {
        int power = bat.getPower();
        power = power - 20;
        if(power > 100){
            power = 100;
        }
        if(power < 0){
            power = 0;
        }
        bat.setPower(power);
        checkPower(bat);
        System.out.println("I was attackted, I was fighting bravly.\n\tPower is - 20 points and the total is " + bat.getPower());
    }
    private void injured(Bat bat) {
        int health = bat.getHealth();
        health = health - 50;
        if(health > 100){
            health = 100;
        }
        if(health < 0){
            health = 0;
        }
        bat.setHealth(health);
        System.out.println("I was attackted, I was injured.\n\tHealth is - 50 points and the total is " + bat.getHealth());
    }
    private void eatMango(Bat bat) {
        int power = bat.getPower();
        int health = bat.getHealth();
        power = power - 5;
        if(power > 100){
            power = 100;
        }
        if(power < 0){
            power = 0;
        }
        health = health + (int) (bat.getSaturation() * 6); // double transfer to int
        if(health > 100){
            health = 100;
        }
        if(health < 0){
            health = 0;
        }
        bat.setPower(power);
        bat.setHealth(health);
        checkPower(bat);
        System.out.println("I ate MANGO. Yummy!\n\tTotal health is " + bat.getHealth() + " points.\n\tPower became - 5 points and the total is " + bat.getPower());
    }
    private void drinkWater(Bat bat) {
        int power = bat.getPower();
        int health = bat.getHealth();
        power = power - 5;
        if(power > 100){
            power = 100;
        }
        if(power < 0){
            power = 0;
        }
        health = health + (int) (bat.getSaturation()) * 4; // double transfer to int
        if(health > 100){
            health = 100;
        }
        if(health < 0){
            health = 0;
        }
        bat.setPower(power);
        bat.setHealth(health);
        checkPower(bat);
        System.out.println("I drank some water!\n\tTotal health is " + bat.getHealth() + " points.\n\tPower became - 5 points and the total is " + bat.getPower());
    }
    private void eatMelon(Bat bat) {
        int power = bat.getPower();
        int health = bat.getHealth();
        power = power - 5;
        if(power > 100){
            power = 100;
        }
        if(power < 0){
            power = 0;
        }
        health = health + (int) (bat.getSaturation()) * 7; // double transfer to int
        if(health > 100){
            health = 100;
        }
        if(health < 0){
            health = 0;
        }
        bat.setPower(power);
        bat.setHealth(health);
        checkPower(bat);
        System.out.println("I ate big MELON!\n\tTotal health is " + bat.getHealth() + " points.\n\tPower became - 5 points and the total is " + bat.getPower());
    }
    private void eatSeeds(Bat bat) {
        int power = bat.getPower();
        int health = bat.getHealth();
        power = power - 5;
        if (power > 100) {
            power = 100;
        }
        if (power < 0) {
            power = 0;
        }
        health = health + (int) (bat.getSaturation()) * 2; // double transfer to int
        if (health > 100) {
            health = 100;
        }
        if (health < 0) {
            health = 0;
        }
        bat.setPower(power);
        bat.setHealth(health);
        checkPower(bat);
        System.out.println("I ate some SEEDS!\n\tTotal health is " + bat.getHealth() + " points.\n\tPower became - 5 points and the total is " + bat.getPower());
    }
    private void starve(Bat bat) {
        int power = bat.getPower();
        int health = bat.getHealth();
        power = power - 10;
        if(power > 100){
            power = 100;
        }
        if(power < 0){
            power = 0;
        }
        health = health + (int) (bat.getSaturation()) * -10; // double transfer to int
        if(health > 100){
            health = 100;
        }
        if(health < 0){
            health = 0;
        }
        bat.setPower(power);
        bat.setHealth(health);
        checkPower(bat);
        System.out.println("I am hungry!\n\tTotal health is " + bat.getHealth() + " points.\n\tPower became - 10 points and the total is " + bat.getPower());
    }
    private boolean checkHealth(Bat bat) { // TRUE = is alive to continue
        if (bat.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }
    private void checkPower(Bat bat) {
        if(bat.getPower() <= 0) {
            int health = bat.getHealth();
            health = health - 5;
            if(health < 0){
                health = 0;
            }
            bat.setHealth(health);
        }
    }
}
