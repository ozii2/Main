public class Employee{
    private String name;
    private double salary;
    private int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name){
        this.hireYear=hireYear;
        this.workHours = workHours;
        this.salary=salary;
        this.name=name;
    }

    public double tax(){
        if(this.salary >= 1000){
            return salary * 0.03;
        }

        return 0.0;
    }

    public double bonus(){
        int extraHours = this.workHours - 40;
        if(extraHours > 0){
            return 30 * extraHours;
        }
        return 0;
    }

    public double increase(){
        int year = 2020 - this.hireYear;
        if(year < 10){
            return salary * 1.05;
        }else if(year >= 10 && year < 20){
            return salary * 1.10;
        }else{
            return salary * 1.15;
        }

    }

    public void ToString(Employee emp){
        Employee emp1 = new Employee(1985,45,2000,"Kemal");
        System.out.println("Tax:" + emp1.tax());
        System.out.println("Bonus:" + emp1.bonus());
        System.out.println("Total salary with the raise of salary:" + emp1.increase());
        double total = emp1.increase() + emp1.bonus() - emp1.tax();
        System.out.println("Total:" + total);
    }

}