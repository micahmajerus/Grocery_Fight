public class Produce {

    public String name;
    public int health;

    Produce(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    // -----------Option Functions------------------------------------------------

    public void attack(Produce opponent){
        opponent.health = opponent.health - 5;
        System.out.println(opponent.getName() + " has lost 5 health!");
    }

    public void heal(Produce player) {
        player.health = player.health + 5;
        System.out.println(player.getName() + " has gained 5 health!");
    }

    public void give_up(Produce player) {
        player.health = 0;
        System.out.println(player.getName() + " has given up, and now has 0 health points!");
    }

    public void special_move(Produce opponent, Produce player) {
        opponent.health = opponent.health - 2;
        player.health = player.health + 3;
        System.out.println(opponent.getName() + " has taken 2 damage and " + player.getName() + " has healed 3 health points!");
    }


    // ------------------------------------------------------------------------------

    public void details(){
        System.out.println("This is " + this.name + ", they have " + this.health + " health points.");
    }
}
