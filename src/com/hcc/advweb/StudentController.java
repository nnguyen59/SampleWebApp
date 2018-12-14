package com.hcc.advweb;

import java.util.ArrayList;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	
	@CrossOrigin(origins={"http://localhost:8081"},allowCredentials="true",exposedHeaders="Access-Control-Allow-Origin",allowedHeaders="*",maxAge=3600)
	@RequestMapping(value="/studentslist", method= RequestMethod.GET)
	public ModelAndView getStudentsList(ModelAndView model) {
		ArrayList<Student> studentsList = studentService.getStudentsList();
		model.addObject("studentsList",studentsList);
		model.setViewName("studentslist");
		return model;
	}

	
	@RequestMapping(value="/newspringstudent",method=RequestMethod.GET)
	public ModelAndView newSpringStudent(ModelAndView modelView) {
		Student student = new Student();
		modelView.addObject("student",student);
		modelView.setViewName("addnewstudent");
		return modelView;
	}
	
	
	@RequestMapping(value = "/deleteproduct", method = RequestMethod.GET)
	public ModelAndView deleteProduct(@RequestParam(name = "id") String studentId,ModelAndView model) {
	    studentService.deleteStudent(Integer.parseInt(studentId));
	    return new ModelAndView(new RedirectView("studentslist.jsp"));
	  
	}
	

	
	@RequestMapping(value="/addspringstudent", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addSpringStudent(@ModelAttribute Student student,@RequestParam(name = "id") String studentId) {
		if (Integer.parseInt(studentId) == 0) {
			studentService.addStudent(student);
		} else {
			studentService.updateStudent(student);
		}
		ArrayList<Student> studentsList = studentService.getStudentsList();

		return new ModelAndView("studentslist","studentsList",studentsList);
	}
	


	
	
}
