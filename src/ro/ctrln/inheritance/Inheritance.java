package ro.ctrln.inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.setBattleshipName("Terran Battleship");
        battleship.setBattleshipCapacity(20000);
        System.out.println("Battleship is : " + battleship);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipName("Imperial Star Destroyer");
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setNumberOfDecks(30);
        System.out.println("ImperialStarDestroyer is: " + imperialStarDestroyer);

        //Starship starship = new Starship(); // Starship is abstract, cannot be instantiated

        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("base");
        System.out.println("Velocity for XWingStarfighter is "+ xWingStarfighter.computeWarpSpeed(3,1000));
        xWingStarfighter.warp();
        System.out.println("XWingStarfighter is: " + xWingStarfighter);

        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("base");
        System.out.println("Velocity for TieFighter is " + tieFighter.computeWarpSpeed(3,1000));
        tieFighter.warp();
        System.out.println("TieFighter is: " + tieFighter);

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy");
        falconHeavy.setBattleshipCapacity(20);
        falconHeavy.setDestination("Moon");
        System.out.println("FalconHeavy is :" + falconHeavy);

        falconHeavy.setStarshipDestination("Mars");
        System.out.println("FalconHeavy is: " + falconHeavy);

        falconHeavy.launchCountdown();



    }
}
