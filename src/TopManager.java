public class TopManager implements Employee {
    private static int FIX_SALARY = 1500000;
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        return FIX_SALARY + company.getIncome() > 10000000 ? (int) (FIX_SALARY * 1.5) : 0;
    }
}
