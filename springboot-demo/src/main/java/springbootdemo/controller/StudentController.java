package springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import springbootdemo.model.Student;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Weichen Wang
 * @date 2021/6/10 - 3:39 PM
 * @description:
 */

@Controller
@SessionAttributes("course")
public class StudentController {
    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
//    public String getStudent(@ModelAttribute("student") Student s, HttpServletRequest h) {
    public String getStudent(Model model, HttpServletRequest h) {

        Student s = new Student();
        model.addAttribute("student", s);

        System.out.println("HTTP Request = " + h.getMethod());
        return "addStudent";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String postStudent(@ModelAttribute("student") Student s, HttpServletRequest h) {
        System.out.println("Student name = " + s.getStudentName());
        System.out.println("HTTP Request = " + h.getMethod());
        return "finished";
    }

    @RequestMapping(value = "/finished", method = RequestMethod.GET)
    public String finished(@ModelAttribute("student") Student s, HttpServletRequest h) {
        System.out.println("HTTP Request finished  = " + h.getMethod());
        return "finished";
    }


//    @RequestMapping(value = "/endPage", method = RequestMethod.GET)
//    public String endPage(HttpServletRequest h) {
//        return "endPage";
//    }

}
