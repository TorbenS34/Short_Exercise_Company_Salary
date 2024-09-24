public class Main {
    public static void main(String[] args) {
        Worker[] Workerlist = new Worker[100];

        for (int i = 0; i < 10; i++) {
            Workerlist[i] = new Worker("Worker" + i, i*i, i);
        }

        for (int i = 0; i < Workerlist.length; i++) {
            if (Workerlist[i] == null) {
                break;
            }
            System.out.print("Name: " + Workerlist[i].Workername);
            System.out.print("  Salary: " + Workerlist[i].WorkerSalary);
            System.out.println("  Complement: " + Workerlist[i].WorkerComplement);
        }

        CalculateSalary(Workerlist);
    }

    public static void CalculateSalary(Worker[] Workerlist) {
        double TotalSalary = 0;
        double SalaryInclTax = 0;
        double TaxFactor = 1.5;
        for (int i = 0; i < Workerlist.length; i++) {
            if (Workerlist[i] == null) {
                break;
            }
            TotalSalary = TotalSalary + Workerlist[i].WorkerSalary;
            SalaryInclTax = TotalSalary * TaxFactor;
        }

        System.out.println("Total Salary: " + TotalSalary);
        System.out.println("Total Salary icluding Tax: " + SalaryInclTax);
    }
}