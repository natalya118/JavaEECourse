import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args ){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TraineeDev trainee = (TraineeDev)context.getBean("student");
		trainee.createBugs();
		
		JuniorDev junior = (JuniorDev)context.getBean("junior");
		junior.createBugs();

		
		MiddleDev middle = (MiddleDev)context.getBean("middle2");
		middle.createBugs();
		
		SeniorDev senior = (SeniorDev)context.getBean("senior");
		senior.createBugs();
		}

}
