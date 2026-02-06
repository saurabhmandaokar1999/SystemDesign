public class SingletonEmployee{
    private long id;
    private String name;
    private int age;
    private double salary;

    private static SingletonEmployee employee;

    private SingletonEmployee(long id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static synchronized SingletonEmployee getEmployeeObject(long id, String name, int age, double salary){
        if(employee == null){
            employee = new SingletonEmployee(id, name, age,salary);
        }
        return employee;
    }
}

class test{
    public static void main(String[] args) {
        //not visible ctor
        //SingletonEmployee e = new SingletonEmployee(1,"saurabh",10,1000);
        SingletonEmployee e1 = SingletonEmployee.getEmployeeObject(10, "name", 30, 200000.00);
        //design flaw we don't create singleton where we mightr have multiple object so never use for some dto or entity
        SingletonEmployee e2 = SingletonEmployee.getEmployeeObject(13, "saurabh", 45, 300000.00);
        System.out.println(e1 == e2);
    }
}