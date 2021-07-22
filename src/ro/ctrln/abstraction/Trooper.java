package ro.ctrln.abstraction;

public abstract class Trooper {

    private int numberOfCapabilities;

    public int getNumberOfCapabilities() {
        return this.numberOfCapabilities;
    }

    public void setNumberOfCapabilities(int numberOfCapabilities) {
        this.numberOfCapabilities = numberOfCapabilities;
    }

    public void fight(String enemy) {
        System.out.println("Fighting the enemy " + enemy);
    }

    public abstract String warCry();
}
