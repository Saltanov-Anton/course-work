public class Employee {
    private static int count = 0;
    private int id;
    private String name;
    private int department;
    private double salary;

    public Employee(String name, int department, int salary) {
        this.department = department;
        this.salary = salary;
        this.name = name;
        count++;
        this.id = count;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

