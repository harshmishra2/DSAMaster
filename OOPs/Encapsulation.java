class Employee{

    //containing private data that can only be set using the set methods
    private int empId;
    private String eName;

    Employee(){
        System.out.println("Inside constructor of Employee class.");
    }

    public void set_empId(int empID){
        this.empId= empID;
    }
    public void set_eName(String eName){
        this.eName = eName;
    }

    public int get_empId(){
        return empId;
    }
    public String get_eName(){
        return eName;
    }
}


public class Encapsulation{

    public static void main(String [] args){

        Employee emp = new Employee();

        emp.set_empId(69);
        emp.set_eName("Heisenberg");

        System.out.println("The name of the employee is "+ emp.get_eName());
        // System.out.println("The Id on the employee was " + 69);22
        System.out.println("The Id on the employee was " + emp.get_empId());
        
    }
}
