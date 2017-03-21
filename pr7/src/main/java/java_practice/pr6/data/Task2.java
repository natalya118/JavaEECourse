package java_practice.pr6.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TaskId.class)
public class Task2 {
	@Id private int number;
	@Id private String subject;
	
	private String description;
	
	private int maxMark;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMaxMark() {
		return maxMark;
	}

	public void setMaxMark(int maxMark) {
		this.maxMark = maxMark;
	}
	
	

}
