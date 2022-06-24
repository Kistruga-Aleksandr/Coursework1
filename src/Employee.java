public class Employee {
    private  String lastName;
    private  String firstName;
    private  String patronymic;
    private int departmentNumber;
    private int salary;
    private int id;
    private static int counter = 1;
    public Employee(String lastName, String firstName, String patronymic,int salary,int departmentNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = getCounter();
    }

    public static int getCounter() {
        return counter++;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName(){
        return this.lastName + " " + this.firstName + " " + this.patronymic;

    }

    @Override
    public String toString() {
        return ("Ф.И.О: " + getFullName() + " Зарплата: " + this.salary + " Департамент: " + this.departmentNumber  + " Индификационный номер: " + this.id);
    }
}
