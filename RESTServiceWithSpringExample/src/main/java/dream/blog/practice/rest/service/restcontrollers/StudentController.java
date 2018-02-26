package dream.blog.practice.rest.service.restcontrollers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dream.blog.practice.rest.service.models.Student;

@RestController
@RequestMapping("student")
public class StudentController<T> {

	private static Map<Integer, Student> students = new HashMap<>();
	static {
		students.put(1, new Student(18, "Jack", 56.5));
		students.put(2, new Student(19, "Tom", 65.7));
		students.put(3, new Student(20, "Mary", 43.2));
	}
	
	@RequestMapping(value = "/list", 
			        produces = "application/json")
	public List<Student> getAllStudents(){
		Collection<Student> studentsCollection = students.values();
		return new ArrayList<>(studentsCollection);
	}
	
	@RequestMapping(value = "/{id}",
			        produces = "application/xml")
	public Student getStudentById(@PathVariable Integer id) {
		return students.get(id);
	}
}
