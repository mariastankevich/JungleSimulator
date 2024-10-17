package cy.stankevich.util;

import cy.stankevich.entity.Bat;

//0-30//30%// 1.resting upside down in a cave during a day ==> power = + 20
//30-40//10%// 2.flying to another forest ==> power = - 10
//40-50//10%// 3. flying away from a predator ==> power = - 20
//50-60//10%// 4. fighting ==> power = -30
//60-65//5%// 5. injured with a predator ==> health = -50
//6. feeding (eating or drinking) ==> power = -5
// 65-70//5%// 6. mango ==> health = satudation * 6
// 70-75//5%// 7. water ==>  health = satudation * 4
// 75-80//5%// 8.melon ==>  health = = satudation * 7
// 80-85//5%// 9.seeds ==>  health = = satudation * 2
// 85-100//15% 10.starving ==> health = satudation * -10, power = -10

public class Actions {
    public void startActivity(Bat bat) throws InterruptedException {
        while (isAlive(bat)) {
            int eventNumber = (int) (Math.random() * 100);
            if(eventNumber >= 0 && eventNumber < 30) {
                rest(bat);
            } else if (eventNumber >= 30 && eventNumber < 40) {
                flyingForest(bat);
            } else if (eventNumber >= 40 && eventNumber < 50) {
                flyingAway(bat);
            }  else if (eventNumber >= 50 && eventNumber < 60) {
                fighting(bat);
            } else if (eventNumber >= 60 && eventNumber < 65) {
                injured(bat);
            } else if (eventNumber >= 65 && eventNumber < 70) {
                eatMango(bat);
            } else if (eventNumber >= 70 && eventNumber < 75) {
                drinkWater(bat);
            } else if (eventNumber >= 75 && eventNumber < 80) {
                eatMelon(bat);
            } else if (eventNumber >= 80 && eventNumber < 85) {
                eatSeeds(bat);
            } else if (eventNumber >= 85 && eventNumber <= 100) {
                starve(bat);
            }
            Thread.sleep(1000); // Sleeps for 1000 milliseconds
        }
        System.out.println("=Sad music= Poor Harry the bat is dad (= ");
    }
    private void rest(Bat bat) {
        int power = bat.getPower();
        power = power + 20;
        if(power > 100){
            power = 100;
        }
        if(power < 0) {
            power = 0;
        }
        bat.setPower(power);
        checkPower(bat);
        System.out.println("I rested in the dark cave. Feeling much better!\n\tHealth 0 points, Total is " + bat.getHealth() + " points.\n\tPower +20 points, Total is " + bat.getPower() + " points.");
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
        System.out.println("I was flying to another forest. Get tired!\n\tHealth 0 points, Total is " + bat.getHealth() + " points.\n\tPower -10 points, Total is " + bat.getPower() + " points.");
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
        System.out.println("I was attackted, but I ran away.\n\tHealth 0 points, Total is " + bat.getHealth() + " points.\n\tPower -10 points, and Total is " + bat.getPower() + " points.");
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
        System.out.println("I was attackted, I was fighting bravly.\n\tHealth 0 points, Total is " + bat.getHealth() + " points.\n\tPower -20 points, Total is " + bat.getPower() + " points.");
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
        System.out.println("I was attackted, I was injured.\n\tHealth -50 points, Total is " + bat.getHealth() + " points.\n\tPower -20 points, Total is " + bat.getPower() + " points.");
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
        System.out.println("I ate MANGO. Yummy!\n\tHealth +15 points, Total is " + bat.getHealth() + " points.\n\tPower -5 points, Total is " + bat.getPower() + " points.");
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
        System.out.println("I drank some water!\n\tHealth +10 points, Total is " + bat.getHealth() + " points.\n\tPower -5 points, Total is " + bat.getPower() + " points.");
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
        System.out.println("I ate big MELON!\n\tHealth +35 points, Total is " + bat.getHealth() + " points.\n\tPower -5 points, Total is " + bat.getPower() + " points.");
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
        System.out.println("I ate some SEEDS!\n\t Health +5 points, Total is " + bat.getHealth() + " points.\n\tPower -5 points, Total is " + bat.getPower() + " points.");
    }
    public void starve(Bat bat) {
        int power = bat.getPower();
        int health = bat.getHealth();
        power = power - 10;
        if(power > 100){
            power = 100;
        }
        if(power < 0){
            power = 0;
        }
        health = health - ((int) (bat.getSaturation()) * 10); // double transfer to int
        if (health > 100) {
            health = 100;
        }
        if (health < 0) {
            health = 0;
        }
        bat.setHealth(health);
        // checkPoints(bat);
        bat.setPower(power);
        checkPower(bat);
        System.out.println("I am hungry!\n\tHealth is -25 points,Total " + bat.getHealth() + " points.\n\tPower -10 points, Total is " + bat.getPower() + " points.");
    }
    private boolean isAlive(Bat bat) { // TRUE = is alive to continue
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
    private static void checkPointsRange(Bat bat) { // method to evaluate 0<>100
        if (bat.health > 100);
        bat.health = 100;
        if (bat.health < 0);
        bat.health = 0;
    }
}
