package ro.ctrln.encapsulation;

import ro.ctrln.inheritance.FalconHeavy;

/*
1. metodele publice dintr-o superclasa(clasa parinte) trebuiesc declarate tot publice in subclase
2. metodele protected intr-o superclasa pot fi declarate fie public fie protected
3. proprietatile declarate public sau protected in superclasa sunt mostenite in clasele copil
4. metodele si proprietatile private nu sunt mostenite deloc
5. clasele declarate finale nu pot fi mostenite
6. clasele pot fi declarate private atunci cand sunt clase interioare
 */
public class EncapsulationTrials {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("Falcon Heavy Encapsulation");
        falconHeavy.escapeProcedure(3);
    }
}
