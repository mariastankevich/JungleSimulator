package cy.stankevich.entity;
// from => 0 to <=100 HEALTH points - going up when eating something and going down when injured
// from => 0 to <=100 POWER points - going down via activities, going up via rest
// saturation
public class Bat {
    public int health = 100;
    private int power = 100;
    private final double saturation = 2.5; // can't be changed

    public void setHealth(int health) { // pass data to health
        this.health = health;
    }
    public int getHealth() { //extract data to health
    return this.health;
    }
    public void setPower(int power) { // pass data to power
        this.power = power;
    }
    public int getPower() { //extract data to power
        return this.power;
    }
    public double getSaturation() { // get saturation number
        return this.saturation;
    }
}
