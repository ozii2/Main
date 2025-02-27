class Animal{
    String name="Animal";
    public void eat(){
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal{
    String name = "onur";
    public void bark(){
        System.out.println(name+" child is barking");
    }
    public void eat(){
        super.eat();
        System.out.println("eatingggg");
        System.out.println("parents: "+ super.name);
    }
}

public class inheritance{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name = "onur";
        dog.eat();
        dog.bark();
    }
}