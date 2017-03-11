package Practice_5.pr5.data.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Practice_5.pr5.data.Teacher;
import Practice_5.pr5.data.dao.TeachersDao;
@Repository
public class HibernateTeacherDao implements TeachersDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addTeacher(Teacher teacher) {
		currentSession().save(teacher);
	}

	public Teacher getTeacherById(int id) {
		return (Teacher) currentSession().get(Teacher.class, id);
	}

	public void saveTacher(Teacher teacher) {
		currentSession().update(teacher);
	}
}
