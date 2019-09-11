import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            // JSON file to Java object
            EmployeeDetails staff = mapper.readValue(new File("employees.json"), EmployeeDetails.class);
                System.out.println(staff.getAddress().getCity());
                System.out.println(staff.getAddress().getStreet());
                System.out.println(staff.getDepartment());
                System.out.println(staff.getAddress().toString());
                System.out.println(staff.getDirect_reports());
                System.out.println(staff.getEmp_name());
                System.out.println(staff.getEmp_id());
                System.out.println(staff.getSalary());
                System.out.println(staff.getEmp_designation());
                System.out.println(staff.toString());

           /* for(EmployeeDetails employeeDetails: staff) {
                System.out.println(employeeLists.getAddress().getCity());
                System.out.println(employeeLists.getAddress().getStreet());
                System.out.println(employeeLists.getAddress().getClass());

               // Address emp = employeeLists.getAddress();
               // System.out.println(emp.getFirstName());
               // System.out.println(emp.getLastName());
               // System.out.println(emp.getWebsite());


            }


*/

                //employeeList.getEmployee().getLastName();
                //employeeList.getEmployee().getWebsite();

                    // JSON string to Java object
           // String jsonInString = "{\"name\":\"mkyong\",\"age\":37,\"skills\":[\"java\",\"python\"]}";
           // EmployeeList staff2 = mapper.readValue(jsonInString, EmployeeList.class);

            // compact print
            //System.out.println(staff2);

            // pretty print
           // String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);

            //System.out.println(prettyStaff1);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}