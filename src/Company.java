import java.util.*;

public class Company implements Comparator<Employee>{
    private List<Employee> employees = new ArrayList<>();
    private int income = 15000000;

    public void hire(Employee employee){
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employees){
        for (Employee employee : employees ) {
            hire(employee);
        }
    }

    public void fire(Employee employee){
        employees.remove(employee);
    }

    public int getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count){
        this.employees.sort(this);
        Collections.reverse(employees);
        return employees.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        this.employees.sort(this);
        return employees.subList(0, count);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public int countEmployees() {
        return employees.size();
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getMonthSalary(), o2.getMonthSalary());
    }
}