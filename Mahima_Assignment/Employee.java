package pack1;

class Employee {
    private String name;
    private double salary;

    public Employee() {
       
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee calculate() {
        double pf = salary * 0.12; // Assuming PF is 12% of the salary
        double allowances = salary * 0.15; // Assuming allowances are 15% of the salary

        Employee result = new Employee(name, salary);
        result.name = this.name;
        result.salary = this.salary;
        result.printDetails(pf, allowances);

        return result;
    }

    private void printDetails(double pf, double allowances) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("PF: " + pf);
        System.out.println("Allowances: " + allowances);
        System.out.println();
    }
}



