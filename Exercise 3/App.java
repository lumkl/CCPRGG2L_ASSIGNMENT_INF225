public class App {
    
    public static void main(String[] args) {

        Weapon rifle = new Weapon();
        
        rifle.name = "Crown Splitter";
        rifle.damage = 900;
        rifle.rarity = "Legendary";
        rifle.sayMyName();
        rifle.AddDamage(30);

        System.out.print(rifle.showNameandRarity());

        Weapon bow = new Weapon();
        
        bow.name = "Lightning";
        bow.damage = 700;
        bow.rarity = "Rare";
        bow.sayMyName();
        
        Weapon rapier = new Weapon();
        
        rapier.name =  "Whistling Razor";
        rapier.damage = 500;
        rapier.rarity = "Common";
        rapier.sayMyName();

        Character gunner = new Character();
        
        gunner.name = "Kiro";
        gunner.attack();
    }
}
