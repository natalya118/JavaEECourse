package java_practice.pr6;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java_practice.pr6.data.Lecture;
import java_practice.pr6.data.Student;
import java_practice.pr6.data.Teacher;
import java_practice.pr6.worker.LecturesWorker;
import java_practice.pr6.worker.StudentWorker;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Lecture lecture = new Lecture();
		lecture.setName("Introduction to Spring");
		lecture.setCredits(2.5);
		LecturesWorker worker = (LecturesWorker) context.getBean("worker");
		worker.addLecture(lecture);

		StudentWorker sworker = (StudentWorker) context.getBean("sworker");
			 Student student = sworker.getStudentFromDbById(1);
			 System.out.println(student);
			 student = sworker.getStudentFromDbById(1);
			 System.out.println(student);

			 
	}
}
