package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;

public class StarPortUsage {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy waiting to fly!");
        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("Mars");
        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("Pluto");

        StarPort starPort = new StarPort();
        starPort.setStarship(falconHeavy);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(xWingStarfighter);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(tieFighter);
        starPort.flyToSpace();
        System.out.println(starPort);

        //falconHeavy.setDestination("Mercury");
        starPort.setStarship(falconHeavy);
        //falconHeavy.setDestination("Mercury");
        starPort.flyToSpace();
        falconHeavy.setDestination("Mercury"); // obiectele se transmit mereu prin referinta -> locatia in memoria calculatorului
        System.out.println(starPort);

        Starship starshipOne = new FalconHeavy();
        Starship starshipTwo = new XWingStarfighter();
        Starship starshipThree = new TieFighter();

        //Starship starshipFour = new Battleship();

        Battleship battleshipOne = new FalconHeavy();
        Battleship battleshipTwo = new ImperialStarDestroyer();

        //starPort.setStarship(battleshipOne); // eroare de compilare

        //FalconHeavy falconHeavyOne = new Battleship(); // nu potface cast de la un obiect de tipul copil la un obiect de tipul parinte

        starPort.setStarship(starshipOne);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(starshipTwo);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(starshipThree);
        starPort.flyToSpace();
        System.out.println(starPort);
    }
}
