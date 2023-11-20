public class Banana extends Produce {

    int attack_power = 5;

    /**
     * Constructor
     * @param name
     * @param health
     */
    Banana(String name, int health) {
        super(name, health);
    }

    /**
     * Ths ability gives the carrot the ability to gain insight on it;s
     * opponents by learning their name and health points
     * @param opponent - Produce
     */
    @Override
    public void special_move(Produce opponent, Produce player){
        System.out.println("Banana Slip: You lose 5 health, your opponent loses 15 health!");
        player.setHealth(player.getHealth() - 5);
        opponent.setHealth(opponent.getHealth() - 15);
    }

    /**
     * The attack method for Banana
     * @param opponent - The enemy produce
     */
    @Override
    public void attack(Produce opponent){
        opponent.health = opponent.health - attack_power;
        System.out.println(opponent.getName() + " has lost " + attack_power + "!");
    }

}
