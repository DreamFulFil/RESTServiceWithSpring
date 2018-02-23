package dream.blog.practice.rest.service.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dream.blog.practice.rest.service.models.Student;

@RestController
@RequestMapping("student")
public class StudentController {

	@RequestMapping("/list")
	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(18, "Jack", 56.5));
		students.add(new Student(19, "Tom", 65.7));
		students.add(new Student(20, "Mary", 43.2));
		return students;
	}
	
}
