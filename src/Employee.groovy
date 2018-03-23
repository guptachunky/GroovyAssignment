import groovy.transform.ToString

class Employee extends PersonJava {

    int empId;
    String companyName;
    double salary;

    @Override
    String toString() {
        return this.@name + " is a man aged " + this.@age + " who lives at " + this.@address + ". he works for " + this.@companyName + " with employee id " + this.@empId + " and draws " + this.@salary + " Lots of money"

    }
}
