package Inheritance;

public class Employee {
    private Person p;
    private double s;

    public Employee(Person newP, double s){
        this.s = s;
        this.p = newP;
    }


    public String speak(){
        String ans = p.getFirstname() + " " + p.getLastname() + " " + this.s;
        return ans;
    }
    
}
