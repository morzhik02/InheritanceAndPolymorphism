public class Operator implements Employee {
    private static final int FIX_SALARY = 30000;

    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }
}
