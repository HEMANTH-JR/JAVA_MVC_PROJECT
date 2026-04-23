import model.Student;
import view.StudentView;
import controller.StudentController;

public class TestMVC {

    public static void main(String[] args) {

        // Create model
        Student student = new Student(1, "Hemanth");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display data
        controller.updateView();

        // Update data
        controller.setStudentName("Rahul");

        System.out.println("\nAfter Update:");
        controller.updateView();
    }
}