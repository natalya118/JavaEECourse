package java_practice.pr6.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CourseWork {
	@Id @GeneratedValue

	private int id;
	private String topic;
	

}
