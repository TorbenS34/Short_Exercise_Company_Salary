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

        double totalSalary = CalculateSalary(Workerlist);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static double CalculateSalary(Worker[] Workerlist) {
        double totalSalary = 0;
        for (int i = 0; i < Workerlist.length; i++) {
            if (Workerlist[i] == null) {
                return totalSalary;
            }
            totalSalary = totalSalary + Workerlist[i].WorkerSalary;
        }
        return totalSalary;

    }
}