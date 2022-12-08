package View;

public class simulationView implements simulationViewInterface {
    
    public void viewProject(){
        System.out.println("Project is running...");
    }

    public void printSimulation(int dd, int no_incidents, int studentEminence, int student1Eminence, int teacherSalary, int nurseSalary, int cookSalary, int schoolReputation, String studentName, String student1Name, String teacherName, String nurseName, String cookName, String schoolName) {
        System.out.println();
        System.out.println("DAY " + dd + " STATS:");
        System.out.println(no_incidents + " incident(s) occured!");
        System.out.println(" Current eminence of student " + studentName+ ": " + studentEminence);
        System.out.println(" Current eminence of student " + student1Name + ": " + student1Eminence);
        System.out.println(" Curent salary of teacher " + teacherName + ": " + teacherSalary + "$");
        System.out.println(" Curent salary of nurse " + nurseName+ ": " + nurseSalary+ "$");
        System.out.println(" Curent salary of cook " + cookName + ": " + cookSalary + "$");
        System.out.println(" Current reputation of " + schoolName + " : " + schoolReputation);

        dd += 1;
    }
    
}
