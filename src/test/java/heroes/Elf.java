package heroes;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.getHp() < this.getHp()) {
            c.setHp(0);
        } else {
            c.setHp(c.getHp()-1);
        }
    }
}
