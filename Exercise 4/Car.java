public class Car {
    String name;
    Myself owner;

    Car(String modelName, Myself ownerName){
        this.name = modelName;
        this.owner = ownerName;
    }
    
    void showOwner(){
        System.out.println("This car" + this.name + " owned by" + owner.name);
    }
}
