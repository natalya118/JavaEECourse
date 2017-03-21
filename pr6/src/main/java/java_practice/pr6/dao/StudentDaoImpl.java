package java_practice.pr6.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java_practice.pr6.data.Student;
import java_practice.pr6.data.Teacher;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{
	@PersistenceContext
	private EntityManager em;

	@Cacheable("student")
	public Student getStudentById(int id) {
		return em.find(Student.class, id);
		
	}
	
	public List<Student> getNotFreshmans(){
		Query query = em.
				createQuery( "Select s " +
					"from Student s " +
					"where e.course " +
					"Between 2 and 4" );
			return (List<Student>)query.getResultList( );

	}
	
	public List<Student> findAll(){

		 Query query = em.createNamedQuery("findAll");
		 return (List<Student>)query.getResultList();
	}

}
