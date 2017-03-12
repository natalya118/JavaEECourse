package java_practice.pr6.data;

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

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String pib;
	private int course;
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "course_work_id", nullable = false)
	private CourseWork courseWork;
//	@Lob
//	private byte[] photo;
	
	@ManyToMany(mappedBy = "visitsLectures")
	private List<Lecture> lectures;

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

	
}