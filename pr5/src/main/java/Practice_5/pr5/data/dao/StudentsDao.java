package Practice_5.pr5.data.dao;

import Practice_5.pr5.data.Student;

public interface StudentsDao {
	void addStudent(Student student);
	Student getStudentById(int id);
}
