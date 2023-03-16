public class App {
    public static void main(String[] args, String personName, int personAge, int myAge) throws Exception {
        
       
        Person friend = new Person( "Grae", 19);

        Myself me = new Myself("Keith", 19);

        me.addFriend(friend);

        Pet cat = new Pet("Frost", friend);
        cat.showOwnerName();

        Car SUV = new Car("Fortuner", me);
        SUV.showOwner();
    }
}
