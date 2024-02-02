public class Employee 
{
    private String name;
    private double salary;
    private String hireDate;

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public String getHireDate() 
    {
        return hireDate;
    }

    public void setHireDate(String hireDate) 
    {
        this.hireDate = hireDate;
    }

    public Employee(String name, double salary, String hireDate) 
    {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    
    public static void main(String[] args) 
    {
        Employee employee = new Employee("Pravin", 50000.0, "2023-11-01");
        
        
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee Hire Date: " + employee.getHireDate());

        employee.setSalary(55000.0);
        System.out.println("Updated Employee Salary: " + employee.getSalary());
    }
}

