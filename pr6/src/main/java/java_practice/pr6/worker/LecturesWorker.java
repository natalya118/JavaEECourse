package java_practice.pr6.worker;

import org.springframework.beans.factory.annotation.Autowired;

import java_practice.pr6.dao.LecturesDao;
import java_practice.pr6.data.Lecture;

public class LecturesWorker {
	@Autowired
	LecturesDao lecturesDao;

	public Lecture addLecture(Lecture lecture) {
		lecture = lecturesDao.addLecture(lecture);
		System.out.println(lecture);
		return lecture;
	}
}
