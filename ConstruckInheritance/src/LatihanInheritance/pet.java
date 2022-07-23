package LatihanInheritance;
public class pet {
    private String name;
    
    public void setName(String petname){
    this.name=petname;
    }

    public String getName() {
        return name;
    }
    
    public String speak(){
        return ("I'm  your cyut pet");
    }
}

class cat extends pet{
    public String speak(){
    return ("I speak only when I want to");
    }
}

class dog extends pet{
    public String fetch( ){
        return "Yes, master. Fetch I will.";
    }
}

class latihan{
    public static void main(String [] args){
        pet pet1 = new pet();
        System.out.println(pet1.speak());
        cat cat1 = new cat();
        cat1.setName("kitty");
        System.out.println("My name is "+cat1.getName());
        System.out.println(cat1.speak());
        dog dog1 = new dog();
        dog1.setName("Bulldog");
        System.out.println("My name is "+dog1.getName());
        System.out.println(dog1.fetch());
    }
}
