/**
 * The produce class sets of the basic produce properties and functions
 * to be used by the produce subclasses.
 */
public class Produce {

    //-------Properties-----------------------------------------------------

    /**
     * The name of the produce
     */
    public String name;

    /**
     * The health level of the produce
     */
    public int health;

    /**
     * The attack power of the produce, this is different for each type
     */
    public int attack_power = 4;

    //---Constructor-------------------------------------------------------

    /**
     * Constructor
     * @param name
     * @param health
     */
    Produce(String name, int health){
        this.name = name;
        this.health = health;
    }

    //---Getters and setters for common properties----------------------------

    /**
     * Return the health of the produce
     * @return health - int
     */
    public int getHealth(){
        return this.health;
    }

    /**
     * Changes the health level of the produce
     * @param newHealth - What we want the new health level to be set to
     */
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    /**
     * Return the name of the produce
     * @return name String
     */
    public String getName(){
        return this.name;
    }

    //-------Active Gameplay Functions------------------------------------------------

    /**
     * Method to attack an opponent
     * @param opponent
     */
    public void attack(Produce opponent){
        opponent.health = opponent.health - attack_power;
        System.out.println(opponent.getName() + " has lost " + attack_power + "!");
    }

    /**
     * Method to heal the current player
     * @param player
     */
    public void heal(Produce player) {
        player.health = player.health + 5;
        System.out.println(player.getName() + " has gained 5 health!");
    }

    /**
     * Method to give up - sets players health to zero
     * @param player
     */
    public void give_up(Produce player) {
        player.health = 0;
        System.out.println(player.getName() + " has given up, and now has 0 health points!");
    }

    /**
     * Each child of produce has a special move this is creating the default if none is given
     * @param opponent
     * @param player
     */
    public void special_move(Produce opponent, Produce player) {
        opponent.health = opponent.health - 2;
        player.health = player.health + 3;
        System.out.println(opponent.getName() + " has taken 2 damage and " + player.getName() + " has healed 3 health points!");
    }

    //-----Other Methods--------------------------------------------------------

    /**
     * The details of the current produce, incuding name, and health
     * @return - null - String print return
     */
    public String toString(){
        System.out.println("This is " + this.name + ", they have " + this.health + " health points.");
        return null;
    }
}
