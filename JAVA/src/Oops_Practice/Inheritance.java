package Oops_Practice;

class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
 
    void reportToManager() {
        System.out.println("Employee is reporting to the manager...");
    }
}
 
// Single Inheritance
class Manager extends Employee {
    void leadTeam() {
        System.out.println("Manager is leading the team...");
    }
}
 
// Multilevel Inheritance
class SeniorManager extends Manager {
    void overseeProjects() {
        System.out.println("Senior Manager is overseeing projects...");
    }
}
 
// Hierarchical Inheritance
class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing code...");
    }
}
 
public class Inheritance {
	
	public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Manager manager = new Manager();
        manager.work(); 
        manager.reportToManager(); 
        manager.leadTeam(); 
        System.out.println("\nMultilevel Inheritance:");
        SeniorManager seniorManager = new SeniorManager();
        seniorManager.work();  
        seniorManager.reportToManager(); 
        seniorManager.leadTeam();
        seniorManager.overseeProjects(); 
        System.out.println("\nHierarchical Inheritance:");
        Developer developer = new Developer();
        developer.work();  
        developer.reportToManager();  
        developer.writeCode(); 
    }
}





