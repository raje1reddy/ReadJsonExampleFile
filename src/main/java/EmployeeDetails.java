
public class EmployeeDetails
{
    private Address address;

    private String[] direct_reports;

    private String emp_name;

    private String emp_designation;

    private String department;

    private String salary;

    private String emp_id;

    public Address getAddress ()
    {
        return address;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    public String[] getDirect_reports ()
    {
        return direct_reports;
    }

    public void setDirect_reports (String[] direct_reports)
    {
        this.direct_reports = direct_reports;
    }

    public String getEmp_name ()
    {
        return emp_name;
    }

    public void setEmp_name (String emp_name)
    {
        this.emp_name = emp_name;
    }

    public String getEmp_designation ()
    {
        return emp_designation;
    }

    public void setEmp_designation (String emp_designation)
    {
        this.emp_designation = emp_designation;
    }

    public String getDepartment ()
    {
        return department;
    }

    public void setDepartment (String department)
    {
        this.department = department;
    }

    public String getSalary ()
    {
        return salary;
    }

    public void setSalary (String salary)
    {
        this.salary = salary;
    }

    public String getEmp_id ()
    {
        return emp_id;
    }

    public void setEmp_id (String emp_id)
    {
        this.emp_id = emp_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [address = "+address+", direct_reports = "+direct_reports+", emp_name = "+emp_name+", emp_designation = "+emp_designation+", department = "+department+", salary = "+salary+", emp_id = "+emp_id+"]";
    }
}
		