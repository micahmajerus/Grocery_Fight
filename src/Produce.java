public class Produce {

    public String name;
    public int health;

    Produce(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void attack(Produce opponent){
        opponent.health = opponent.health - 5;
        System.out.println(opponent + "has lost 5 health!");
    }

    private void takeDamage(int damage){

    }

    public void details(){
        System.out.println("This is " + this.name + " they have " + this.health + " health points.");
    }
}
