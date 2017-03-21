package java_practice.pr6.data;

import javax.persistence.GeneratedValue;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="teachers")
@NamedQueries({ 
@NamedQuery(name = "findAll", query="select t from Teacher t")})
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "course_work")
	private List<CourseWork> courseWorks;

}
