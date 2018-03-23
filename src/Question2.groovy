class Question2 {

    static void main(String[] args) {
        def employee = new Employee()
        employee.companyName = "To The New"
        employee.address = "g-37"
        employee.empId = 101
        employee.salary = 15000.0
        employee.gender = 'm'
        employee.age = 22
        employee.name = "chunks"

        println("Company Name         " + employee.companyName)
        println("Address              " + employee.address)
        println("Employee id          " + employee.empId)
        println("Salary               " + employee.salary)
        println("Age                  " + employee.age)
        println("Gender               " + employee.gender)
        println("Name                 " + employee.name)

        println("Company Name         " + employee.getCompanyName())
        println("Address              " + employee.getAddress())
        println("Employee id          " + employee.getEmpId())
        println("Salary               " + employee.getSalary())
        println("Age                  " + employee.getAge())
        println("Gender               " + employee.getGender())
        println("Name                 " + employee.getName())

        println("Company Name         " + employee.@companyName)
        println("Address              " + employee.@address)
        println("Employee id          " + employee.@empId)
        println("Salary               " + employee.@salary)
        println("Age                  " + employee.@age)
        println("Gender               " + employee.@gender)
        println("Name                 " + employee.@name)

    }
}
