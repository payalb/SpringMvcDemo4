package om.java.controller;

import java.time.LocalDate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import om.java.dao.StudentRepository;
import om.java.dto.Student;

@Controller
public class StudentController {

	@Autowired
	StudentRepository rep;
	@Autowired
	LocalDateEditor editor;

	@PostMapping("/addStudent.do")
	public String addStudent( @ModelAttribute Student st,BindingResult result,  Model model) {
		if(result.hasErrors()) {
			model.addAttribute("errorMsg", result.getAllErrors().stream().map(x-> x.getDefaultMessage()).collect(Collectors.toList()));
			return "addStudent";
		}else {
			rep.save(st);
			return "success";
		}
	}

	@GetMapping("/getStudent.do")
	public String getStudents(Model model) {
		model.addAttribute("students", rep.getStudents());
		return "displayStudent";
	}

	@InitBinder
	public void init(WebDataBinder binder) {
		// binder.setDisallowedFields("dob");
		binder.registerCustomEditor(LocalDate.class, "dob", editor);
	}
}
