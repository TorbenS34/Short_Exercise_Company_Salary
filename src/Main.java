public class Main {
    public static void main(String[] args) {
        Worker[] Workerlist = new Worker[100];

        for (int i = 0; i < 20; i++) {
            Workerlist[i] = new Worker();
            Workerlist[i].Workername = "Worker" + i;
            Workerlist[i].WorkerComplement = i;
            Workerlist[i].WorkerSalary = i;
        }


        int totalSalary = CalculateSalary(Workerlist);
        System.out.println("Total Salary: " + totalSalary);

    }

    public static int CalculateSalary(Worker[] Workerlist) {
        int totalSalary = 0;
        for (int i = 0; i < Workerlist.length; i++) {
            if (Workerlist[i] == null) {
                return totalSalary;
            }
            totalSalary = totalSalary + Workerlist[i].WorkerSalary;
        }
        return totalSalary;
    }


}