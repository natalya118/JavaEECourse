package Practice_5.pr5.data.dao;

import Practice_5.pr5.data.Teacher;

public interface TeachersDao {
	void addTeacher(Teacher teacher);

	Teacher getTeacherById(int id);

	void saveTacher(Teacher teacher);
}
