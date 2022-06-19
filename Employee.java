import java.util.*;
public class Employee extends CredentialService{
	
Employee()
{
	System.out.println("Please enter the department from the following");
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Human Resource");
	System.out.println("4.Legal");
}

Employee(String firstName,String lastName)
{ this.firstName=firstName;
   this.lastName=lastName;
System.out.println("first name is"+firstName);
System.out.println("lastname is"+lastName);
}
Employee(String department)
{ 
	this.department=department;
}

}
