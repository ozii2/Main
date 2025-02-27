class Person{
    private String name;
    private int age;
    private String gender;


    public String get_name(){
        return name;
    }

    public void set_name(String name){
        this.name = name;
    }
    public int get_age(){
        return age;
    }

    public void set_age(int age){
        if(age >0){
            this.age=age;
        }else{
            System.out.println("negatif");
        }
    }

    public String get_gender(){
        return gender;
    }

    public void set_gender(String gender){
        this.gender = gender;
    }


}

public class Encap{
    public static void main(String[] args) {
        Person person=new Person();

        person.set_name("oguz");
        person.set_age(21);
        person.set_gender("Male");

        System.out.println("name:"+ person.get_name());
        System.out.println("age:" + person.get_age());
        System.out.println("gender:" + person.get_gender());



    }
}