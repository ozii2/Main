class Animal{
    public void sound(){
        System.out.println("animals make sounds");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("bark");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("mewo");
    }

}


public class override{
    public static void main(String[] args) {
        Animal my_animal = new Animal();
        my_animal.sound();
        
        Animal dog = new Dog();
        dog.sound();

        Animal cat = new Cat();
        cat.sound();



    }
}