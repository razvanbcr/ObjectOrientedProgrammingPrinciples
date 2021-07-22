package ro.ctrln.misc;

import ro.ctrln.inheritance.FalconHeavy;

public class OverloadingUsage {
    public static void main(String[] args) {
        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.escapeProcedure(10);
        System.out.println("---------------");
        falconHeavy.escapeProcedure(3,true);
        System.out.println("---------------");
        falconHeavy.escapeProcedure();
        System.out.println("---------------");
        falconHeavy.escapeProcedure(false,true,false,false);
        System.out.println("---------------");
        System.out.println(falconHeavy.escapeProcedure(false));
    }
}
