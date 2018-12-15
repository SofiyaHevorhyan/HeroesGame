package kickbehavior;

import heroes.Character;

public class OrdinaryBehavior implements Behavior {

    public void kick(Character main, Character enemy) {
        enemy.setHp(enemy.getHp() - main.getPower());
    }
}
