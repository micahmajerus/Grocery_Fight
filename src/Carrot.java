public class Carrot extends Produce{

    int attack_power = 5;

    /**
     * Constructor
     * @param name
     * @param health
     */
    Carrot(String name, int health) {
        super(name, health);
    }

    /**
     * Ths ability gives the carrot the ability to gain insight on it;s
     * opponents by learning their name and health points
     * @param opponent - Produce
     */
    @Override
    public void special_move(Produce opponent, Produce player){
        System.out.println("The great carrot has given you great eye sight and see's that: ");
        opponent.toString();
    }

    @Override
    public void attack(Produce opponent){
        opponent.health = opponent.health - attack_power;
        System.out.println(opponent.getName() + " has lost " + attack_power + "!");
    }
}
