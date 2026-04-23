package view;	
	import model.Student;
		public class StudentView {
			public void printStudentDetails(Student student) {
		        	System.out.println("Student Details:");
		        	System.out.println("ID: " + student.getId());
		        	System.out.println("Name: " + student.getName());
		    }
		}
	

