package br.com.ufc.crateus.npds.school.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufc.crateus.npds.school.repository.TeacherRepository;

@Service
public class TeacherManager {
	
	@Autowired
	TeacherRepository teacherRepository;

}
