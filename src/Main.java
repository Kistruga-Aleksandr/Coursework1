import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Employee[] workers = new Employee[10];

    public static void outputAllEmployee() {
        for (Employee employee : workers) {
            System.out.println(employee);
        }
    }

    public static int searchSumSalary() {
        int sum = 0;
        for (Employee employee : workers) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма всех зарплат за месяц: " + sum);
        return sum;
    }

    public static void increaseSalaryEmployee(int percent) {
        for (Employee employee : workers) {
            employee.setSalary((employee.getSalary() * percent / 100 + employee.getSalary()));
            System.out.println(employee.getSalary());
        }

    }

    public static void searchMinSalary() {
        Employee st = workers[0];
        for (Employee employee : workers) {
            if (st.getSalary() > employee.getSalary()) {
                st = employee;
            }
        }
        System.out.println("Сотрудник с минимальная зарплата: " + st.getSalary() + " " + st.getFullName() + " " + st.getId());

    }

    public static void searchMaxSalary() {
        Employee st = workers[0];
        for (Employee employee : workers) {
            if (st.getSalary() < employee.getSalary()) {
                st = employee;
            }
        }
        System.out.println("Сотрудник с максимальной  зарплата: " + st.getSalary() + " " + st.getFullName() + " " + st.getId());

    }

    public static void searchAverageSalary() {
        int average = searchSumSalary() / workers.length;
        System.out.println("Средняя зарплата за месяц: " + average);
    }

    public static void receiveSNPEmployee() {
        System.out.println("Ф.И.О всех сотрудников: ");
        for (Employee employee : workers) {
            System.out.println(employee.getFullName());
        }
    }

    public static void searchMinSalaryByDepartment(int departmentNumber) {
        Employee[] employeesByDepartment = getEmployeesByDepartment(departmentNumber);
        Employee st = employeesByDepartment[0];
        for (Employee employee : workers) {
            if (st.getSalary() > employee.getSalary()) {
                st = employee;
            }
        }
        System.out.println("Сотрудник с минимальная зарплата: " + st.getSalary() + " " + st.getFullName() + " " + st.getId());

    }

    public static void searchMaxSalaryByDepartment(int departmentNumber) {
        Employee[] employeesByDepartment = getEmployeesByDepartment(departmentNumber);
        Employee st = employeesByDepartment[0];
        for (Employee employee : employeesByDepartment) {
            if (st.getSalary() < employee.getSalary()) {
                st = employee;
            }
        }
        System.out.println("Сотрудник с максимальной  зарплата: " + st.getSalary() + " " + st.getFullName() + " " + st.getId());

    }

    public static int searchSumSalaryByDepartment(int departmentNumber) {
        int sum = 0;
        for (Employee employee : workers) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма всех зарплат за месяц: " + sum);
        return sum;
    }

    public static void searchAverageSalaryByDepartment(int departmentNumber) {
        for (Employee employee : workers) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                int average = searchSumSalaryByDepartment(5) / getEmployeesByDepartment(5).length;
                ;
                System.out.println("Средняя зарплата за месяц: " + average);
            }
        }
    }

    public static void increaseSalaryEmployeeByDepartment(int percent, int departmentNumber) {
        for (Employee employee : workers) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                employee.setSalary((employee.getSalary() * percent / 100 + employee.getSalary()));
                System.out.println(employee.getSalary());
            }
        }

    }

    public static void receiveSNPEmployeeByDepartment(int departmentNumber) {
        System.out.println("Данные сотрудников отдела: ");
        for (Employee employee : workers) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee.getFullName() + ", Зарплата: " + employee.getSalary() + ", Индификационный номер: " + employee.getId());
            }
        }
    }

    public static Employee[] getEmployeesByDepartment(int departmentNumber) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : workers) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                result.add(employee);
            }
        }
        return result.toArray(new Employee[0]);
    }

    public static void searchForEmployeesWithSalaryLessThanTheNumber(int number) {
        for (Employee employee : workers){
            if(employee.getSalary() < number){
                System.out.println("Индификационный номер: " + employee.getId() + ", Ф.И.О: " + employee.getFullName() + ", Зарплата: " + employee.getSalary() );
            }
        }
    }

    public static void searchForEmployeesWithSalaryGreaterThanTheNumber(int number){
        for (Employee employee : workers){
            if(employee.getSalary() > number){
                System.out.println("Индификационный номер: " + employee.getId() + ", Ф.И.О: " + employee.getFullName() + ", Зарплата: " + employee.getSalary() );
            }
        }
    }


    public static void main(String[] args) {
        workers[0] = new Employee("Иванов", "Иван", "Иванович", 100_000, 1);
        workers[1] = new Employee("Петров", "Роман", "Иванович", 150_000, 5);
        workers[2] = new Employee("Сидоров", "Юрий", "Романович", 80_000, 3);
        workers[3] = new Employee("Куликов", "Михайл", "Юрьевич", 70_000, 4);
        workers[4] = new Employee("Ильин", "Александр", "Валерьевич", 180_000, 5);
        workers[5] = new Employee("Рогонов", "Александр", "Николаевич", 95_000, 2);
        workers[6] = new Employee("Белов", "Евгений", "Александрович", 110_000, 2);
        workers[7] = new Employee("Сосновцев", "Виктор", "Евгеньевич", 180_000, 3);
        workers[8] = new Employee("Смирнов", "Андрей", "Викорович", 200_000, 4);
        workers[9] = new Employee("Андреев", "Роман", "Андреевич", 250_000, 1);

        outputAllEmployee();
        searchSumSalary();
        searchMinSalary();
        searchMaxSalary();
        searchAverageSalary();
        receiveSNPEmployee();
        increaseSalaryEmployee(50);
        searchSumSalaryByDepartment(3);
        searchMinSalaryByDepartment(1);
        searchMaxSalaryByDepartment(2);
        searchAverageSalaryByDepartment(5);
        increaseSalaryEmployeeByDepartment(10,4);
        receiveSNPEmployeeByDepartment(2);
        searchForEmployeesWithSalaryLessThanTheNumber(150_000);
        searchForEmployeesWithSalaryGreaterThanTheNumber(1);
    }
}
