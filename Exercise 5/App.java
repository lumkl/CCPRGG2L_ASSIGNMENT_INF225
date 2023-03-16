public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person();

        Me.setName( "Keith");
        
        //Me.name;

        String myName = Me.getName();

        System.out.println("My name is " + myName);
        
        Me.setCCnumber(22222);

        int myCCnumber = Me.getCCnumber();

        System.out.println("My CC number is " + myCCnumber);


        Son me = new Son();


        System.out.println("My Familyname is: " + me.surname);

        me.showLove();
    }
}
