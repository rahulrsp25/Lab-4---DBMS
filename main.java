public class Main {
	
	public static void main(String args[]) {
		
		HrDepartment k = new HrDepartment();
		
		TechDepartment k1 = new TechDepartment();
		
		AdminDepartment k2 = new AdminDepartment();
		
		
		System.out.println(k2.departmentName());
		System.out.println(k2.getTodaysWork());
		System.out.println(k2.getWorkDeadline());
		System.out.println(k2.isTodayAHoliday());
		
		System.out.println("   ");
		System.out.println("   ");
		
		System.out.println(k.departmentName());
		System.out.println(k.getTodaysWork());
		System.out.println(k.getWorkDeadline());
		System.out.println(k.isTodayAHoliday());
		
		System.out.println("   ");
		System.out.println("   ");
		
		
		System.out.println(k1.departmentName());
		System.out.println(k1.getTodaysWork());
		System.out.println(k1.getWorkDeadline());
		System.out.println(k1.getTechStackInformation());
		System.out.println(k1.isTodayAHoliday());
	}
	
	
}
