package kickbehavior;

import heroes.Character;

public class GodBehavior implements Behavior {
    public void kick(Character mainCharacter, Character enemy) {
        enemy.setHp(0);
    }
}
