public class Weapon {
    String name;
    int damage;
    String rarity;
   

    public void sayMyName() {
        System.out.println("The weapon you chose is " + name);
    }
    public void attack() {
        System.out.println("I am attacking");
    }
    public void AddDamage(int additionalDamage){
        int newDamage = this.damage + additionalDamage;
        System.out.println("Damage increase from " + " to " + newDamage);

        this.damage = newDamage;
    }

    public String showNameandRarity() {
        return this.name + " " + this.rarity;
    }
}
