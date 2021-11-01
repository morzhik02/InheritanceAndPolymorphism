public class Manager implements Employee {
    private static final int FIX_SALARY = 50000;
    private int earningsForCompany;

    public Manager(int earningsForCompany) {
        this.earningsForCompany = (int) (Math.random()*25000) + 115000;
    }

    public Manager() {

    }

    @Override
    public int getMonthSalary() {
        return FIX_SALARY + (int) (earningsForCompany*0.05);
    }
}
