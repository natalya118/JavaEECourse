package java_practice.pr6.data;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Lectures")
public class Lecture {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	private String name;
	private double credits;
	
	@ManyToMany
	@JoinTable(name = "timetable", 
	joinColumns = @JoinColumn(name = "lecture_fk"),
	inverseJoinColumns = @JoinColumn(name = "student_fk"))
	private List<Student> visitsLectures;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Lecture [id=" + id + ", name=" + name + ", credits=" + credits + "]";
	}
	
}
