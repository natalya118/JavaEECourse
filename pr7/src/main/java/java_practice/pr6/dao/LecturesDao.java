package java_practice.pr6.dao;

import java_practice.pr6.data.Lecture;

public interface LecturesDao {

	Lecture addLecture(Lecture lecture);

	Lecture getLecture(int id);

	void saveLecture(Lecture lecture);

}
