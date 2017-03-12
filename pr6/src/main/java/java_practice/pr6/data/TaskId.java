package java_practice.pr6.data;

import javax.persistence.Embeddable;

@Embeddable
public class TaskId {
private int number;
private String subject;
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
public TaskId(int number, String subject) {
	super();
	this.number = number;
	this.subject = subject;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + number;
	result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
	TaskId other = (TaskId) obj;
	if (number != other.number)
		return false;
	if (subject == null) {
		if (other.subject != null)
			return false;
	} else if (!subject.equals(other.subject))
		return false;
	return true;
}

}
