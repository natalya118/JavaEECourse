package java_practice.pr6.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Task {
	
	@EmbeddedId
	private TaskId id;
	@Column(name="desc",length=245)
	private String description;
	@Column(name="mark", nullable=false, updatable=false)
	private int maxMark;
	@Temporal(TemporalType.TIMESTAMP)
	private Date deadline;
	
	@Enumerated(EnumType.STRING)
	private TaskType taskType;
	@Temporal(TemporalType.DATE)
	@Transient
	private Date daysBeforeDeadline;
	public TaskId getId() {
		return id;
	}

	public void setId(TaskId id) {
		this.id = id;
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
