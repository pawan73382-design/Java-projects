public class Encapsulation {
    public static void main(String[] args) {
        User obj = new User();
        obj.breed = "German Shepherd";
        obj.setName("shero");
        System.out.println(obj.getName());
        obj.petSound();

    }
    
}
class User{
    String name;
    String breed;
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }
    void petSound(){
        System.out.println("Dog barks");
    }
}
