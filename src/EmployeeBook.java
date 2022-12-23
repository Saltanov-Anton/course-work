import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void showAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public void addEmployee(String name, int department, int salary) {
        Employee employee = new Employee(name, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println("Работник '" + name + '\'' + " добавлен в общий список");
                break;
            }
        }
    }

    public void deleteByID(int id) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                System.out.println("Работник с " + id + "-id" + " удален");
            }
        }
    }

    public void deleteByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getName().equals(name)) {
                employees[i] = null;
                System.out.println("Работник '" + name + '\'' + " удален");
            }
        }
    }

    public void sumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
    }

    public void findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        double minSalary = MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employeeWithMinSalary = employees[i];
            }
        }
        System.out.println("Минимальная зарплата у " + employeeWithMinSalary.getName()
                + "-" + employeeWithMinSalary.getSalary());
    }

    public void findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        double maxSalary = MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeWithMaxSalary = employees[i];
            }
        }
        System.out.println("Максимальня зарплата у " + employeeWithMaxSalary.getName()
                + "-" + employeeWithMaxSalary.getSalary());
    }

    public void sumMiddleSalary() {
        int countEmployeesInArray = 0;
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                countEmployeesInArray++;
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Средняя сумма затрат на зарплаты: "
                + (double) sum / countEmployeesInArray);
    }

    public void showNameAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }
        }
    }

    public void increaseSalaryAllEmployees(double valuePercent)  {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary()
                        + (employees[i].getSalary() * (valuePercent / 100)));
            }
        }
        System.out.println("Зарплата всех работников проиндексирована на " + valuePercent + "%");
    }

    public void findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        double maxSalary = MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department
                    && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeWithMaxSalary = employees[i];
            }
        }
        System.out.println("В отделе - " + department + " больше всех зарабатывает '"
                + employeeWithMaxSalary.getName() + '\'' + "-" + maxSalary);
    }

    public void findEmployeeWithMinSalaryInDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        double minSalary = MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department
                    && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("В отделе - " + department + " меньше всех зарабатывает '"
                + employeeWithMaxSalary.getName() + '\'' + "-" + minSalary);
    }

    public void sumMiddleSalaryInDepartment(int department) {
        int countEmployeesInDepartment = 0;
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                countEmployeesInDepartment++;
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Средняя сумма затрат на зарплаты в отделе-" + department
                + "-" + (double) sum / countEmployeesInDepartment);
    }

    public void increaseSalaryInDepartment(int department, double valuePercent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary()
                        + (employees[i].getSalary() * (valuePercent / 100)));
            }
        }
        System.out.println("Зарплата в отделе-" + department + " проиндексирована на "
                + valuePercent + "%");
    }

    public void showAllEmployeesInDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(employees[i].getId() + " "
                        + employees[i].getName() + " "
                        + employees[i].getSalary());
            }
        }
    }

    public void showEmployeesWithSalaryLessThanValue(int value) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < value) {
                System.out.println(employees[i].getId() + " "
                        + employees[i].getName() + " "
                        + employees[i].getSalary());
            }
        }
    }

    public void showEmployeesWithSalaryMoreThanValue(int value) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= value) {
                System.out.println(employees[i].getId() + " "
                        + employees[i].getName() + " "
                        + employees[i].getSalary());
            }
        }
    }

    public Employee findEmployeeByName(String name) {
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                employee = employees[i];
            }
        }
        return employee;
    }

    public void changeSalary (String name, double newSalary) {
        findEmployeeByName(name).setSalary(newSalary);
    }

    public void moveEmployeeToAnotherDepartment(String name, int department) {
        findEmployeeByName(name).setDepartment(department);
    }

    public void showDepartmentsWithEmployees() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Отдел - " + i + ":");
            for (int j = 0; j < employees.length; j++) {
                if (employees[j] != null && employees[j].getDepartment() == i) {
                    System.out.println(employees[j].getName());
                }
            }
        }
    }

}
