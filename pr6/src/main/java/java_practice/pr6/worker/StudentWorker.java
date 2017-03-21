package java_practice.pr6.worker;

import org.springframework.beans.factory.annotation.Autowired;

import java_practice.pr6.dao.StudentDao;
import java_practice.pr6.data.Student;

public class StudentWorker {
	@Autowired
	StudentDao studentDao;
	
	public Student getStudentFromDbById(int id){
		return studentDao.getStudentById(id);
	}
	
	
}
