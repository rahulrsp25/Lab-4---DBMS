import java.util.*;
	public class Driver extends Employee{
		public static void main(String args[])
		{
Scanner sc=new Scanner(System.in);

System.out.println("enter firstname");
String firstName=sc.nextLine();
System.out.println("Enter your lastname");
String lastName=sc.nextLine();

Employee obj=new Employee(firstName,lastName);
Employee obj5=new Employee();
System.out.println("enter department");
String department;
department=sc.nextLine();

Employee obj2=new Employee(department);
CredentialService cred=new CredentialService();
cred.generatePassword();
cred.generateEmailAddress(firstName,lastName,department,companyName);
cred.showCredentials(firstName,lastName);


	}

}
