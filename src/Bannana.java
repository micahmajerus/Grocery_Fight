public class Bannana extends Produce {

    int attack_power = 5;
    String type;
    String slippery_strike;

    Bannana(String name, int health) {
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
        opponent.details();
    }

}
