package Practice_5.pr5.data;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "TEACHERS")
public class Teacher {
	@Id
	@GeneratedValue
	private int teacherId;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "birth_date")
	private Date birthDate;

	@Column(name = "cell_phone")
	private String cellphone;

	// Getters and Setters
}
