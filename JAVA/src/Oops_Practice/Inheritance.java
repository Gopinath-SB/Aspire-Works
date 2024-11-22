package Oops_Practice;

//Base class for Employee details
class Employee {
 String name;
 int empId;
 String department;

 public Employee(String name, int empId, String department) {
     this.name = name;
     this.empId = empId;
     this.department = department;
 }

 public void displayEmployeeDetails() {
     System.out.println("Employee Name: " + name + ", Employee ID: " + empId + ", Department: " + department);
 }
}

//Single Inheritance: Manager class inherits Employee
class Manager extends Employee {
 int teamSize;

 public Manager(String name, int empId, String department, int teamSize) {
     super(name, empId, department);
     this.teamSize = teamSize;
 }

 public void displayManagerDetails() {
     System.out.println("Manager of " + teamSize + " employees.");
 }
}

//Multilevel Inheritance: SeniorManager inherits Manager, and Manager inherits Employee
class SeniorManager extends Manager {
 int yearsOfExperience;

 public SeniorManager(String name, int empId, String department, int teamSize, int yearsOfExperience) {
     super(name, empId, department, teamSize);
     this.yearsOfExperience = yearsOfExperience;
 }

 public void displaySeniorManagerDetails() {
     System.out.println("Senior Manager with " + yearsOfExperience + " years of experience.");
 }
}

//Hierarchical Inheritance: Developer and Manager inherit from Employee
class Developer extends Employee {
 String programmingLanguage;

 public Developer(String name, int empId, String department, String programmingLanguage) {
     super(name, empId, department);
     this.programmingLanguage = programmingLanguage;
 }

 public void displayDeveloperDetails() {
     System.out.println("Developer skilled in " + programmingLanguage + ".");
 }
}

//Hybrid Inheritance (with only classes): AssistantManager inherits Employee, Manager inherits Employee, and both work independently.
class AssistantManager extends Employee {
 String responsibility;

 public AssistantManager(String name, int empId, String department, String responsibility) {
     super(name, empId, department);
     this.responsibility = responsibility;
 }

 public void displayAssistantManagerDetails() {
     System.out.println("Assistant Manager handling " + responsibility + ".");
 }
}

public class Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


     // Single Inheritance example
     System.out.println("Single Inheritance Example:");
     Manager manager = new Manager("Alice", 101, "HR", 5);
     manager.displayEmployeeDetails();
     manager.displayManagerDetails();

     // Multilevel Inheritance example
     System.out.println("\nMultilevel Inheritance Example:");
     SeniorManager seniorManager = new SeniorManager("Charlie", 103, "Sales", 8, 12);
     seniorManager.displayEmployeeDetails();
     seniorManager.displayManagerDetails();
     seniorManager.displaySeniorManagerDetails();

     // Hierarchical Inheritance example
     System.out.println("\nHierarchical Inheritance Example:");
     Developer developer = new Developer("David", 104, "IT", "Java");
     developer.displayEmployeeDetails();
     developer.displayDeveloperDetails();
     
     // Hybrid Inheritance example
     System.out.println("\nHybrid Inheritance Example:");
     AssistantManager assistantManager = new AssistantManager("Eve", 105, "Finance", "Budgeting");
     assistantManager.displayEmployeeDetails();
     assistantManager.displayAssistantManagerDetails();
 }
}






