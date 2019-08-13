package om.java.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import om.java.dto.Student;

//data access object
@Repository
public class StudentRepository {

	Map<Integer, Student> db = new HashMap<>();

	public void save(Student st) {
		db.put(st.getId(), st);

	}

	public Collection<Student> getStudents() {
		return db.values();

	}

}
