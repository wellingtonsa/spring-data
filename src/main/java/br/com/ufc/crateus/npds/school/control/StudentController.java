package br.com.ufc.crateus.npds.school.control;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufc.crateus.npds.school.manager.StudentManager;
import br.com.ufc.crateus.npds.school.model.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentManager studentManager;

	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studentManager.save(student);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student viewStudent(@PathVariable int id) {
		return studentManager.obtainValueKey(id); 
	} 

	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeStudent(@PathVariable("id") int id) {
		studentManager.delete(id);
	} 

	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void editStudent(@RequestBody Student student, @PathVariable int id) {
		studentManager.update(student, id);
	} 

	@CrossOrigin
	@RequestMapping(params = "name", method = RequestMethod.GET)
		public List<Student> searchStudent(@RequestParam("name") String name) {
			return studentManager.search(name);
	} 

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Student> listStudents(){
		return studentManager.listAll();
	} 
} 


