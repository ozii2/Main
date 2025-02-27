//compile time poly
class Calculator{
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public double add(double a,double b){
        return a+b;
    }

    public void add(String text,int a){
        System.out.println(text +" "+ a);
    }    


}
//runtime poly-override


public class poly{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,2));
        System.out.println(calc.add(5.2,3.1));
        calc.add("oguz", 123);

    }
}