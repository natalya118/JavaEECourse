package Practice_5.pr5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Practice_5.pr5.data.Student;
import Practice_5.pr5.worker.WorkWithStudents;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	WorkWithStudents worker = 
    	(WorkWithStudents) context.getBean("worker");
    	//new WorkWithStudents();
    	Student testStudent = new Student("Vlad Valt", 5);
    	worker.saveStudentToDb(testStudent);

    }
}
