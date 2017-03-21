package java_practice.pr6.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterMapper;

@Entity
@Table(name="students")
public class Student {
	public static final String SQL_SELECT_STUDENT_BY_ID="";
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String pib;
	private int course;
//	@OneToOne (fetch = FetchType.LAZY)
//	@JoinColumn(name = "course_work_id", nullable = false)
//	private CourseWork courseWork;
//	@Lob
//	private byte[] photo;
	
	
//	@ManyToMany(mappedBy = "visitsLectures")
//	private List<Lecture> lectures;

	public Student(){}

    public Student(String pib, int course) {
        this.pib = pib;
        this.course = course;
    }


    

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String toString() {
		return "Student [studentId=" + studentId + ", pib=" + pib + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((pib == null) ? 0 : pib.hashCode());
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (pib == null) {
			if (other.pib != null)
				return false;
		} else if (!pib.equals(other.pib))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}

	
}