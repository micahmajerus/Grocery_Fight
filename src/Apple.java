public class Apple extends Produce{

    int attack_power = 6;

    /**
     * Constructor
     * @param name
     * @param health
     */
    Apple(String name, int health) {
        super(name, health);
    }

    /**
     * This ability gives the apple plus 15 health
     * @param opponent - Produce
     */
    @Override
    public void special_move(Produce opponent, Produce player){
        System.out.println("An appple a day keeps the doctor away! Plus 15 health!");
        player.setHealth(player.getHealth() + 15);
    }

    /**
     * This method is the attack method for Apples
     * @param opponent - The enemy produce
     */
    @Override
    public void attack(Produce opponent){
        opponent.health = opponent.health - attack_power;
        System.out.println(opponent.getName() + " has lost " + attack_power + "!");
    }
}
