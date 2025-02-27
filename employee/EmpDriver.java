public class EmpDriver{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1985,45,2000,"Kemal");
        /*
        System.out.println("Tax:" + emp1.tax());
        System.out.println("Bonus:" + emp1.bonus());
        System.out.println("Total salary with the raise of salary:" + emp1.increase());
        double total = emp1.increase() + emp1.bonus() - emp1.tax();
        System.out.println("Total:" + total); 
        */
        emp1.ToString(emp1);
    }
}