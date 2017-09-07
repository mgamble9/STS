package Project_Class;
import java.util.ArrayList;

public class ProjectTest {

	public static void main(String[] args) {
		
		Project proj = new Project("get smarter","read manual");
		System.out.println(proj.getName());
		System.out.println(proj.getDescription());
		System.out.println(proj.elevatorPitch());
		
		Project proj2 = new Project();
		System.out.println(proj2.getName());
		System.out.println(proj2.getDescription());
		System.out.println(proj2.elevatorPitch());

		ArrayList<Project> arrProjects = new ArrayList<>();
		arrProjects.add(proj);
		arrProjects.add(proj2);
		
		Portfolio port = new Portfolio(arrProjects);
		System.out.println(port.getProjects());
		for (Project x : arrProjects) {
			System.out.println(x.elevatorPitch());
		}
		
		
	}

}
