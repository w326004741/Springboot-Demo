package springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import springbootdemo.model.Course;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Weichen Wang
 * @date 2021/6/10 - 3:29 PM
 * @description:
 */

@Controller
@SessionAttributes("course")
public class CourseController {
    @RequestMapping(value = "/addCourse", method = RequestMethod.GET)
    public String getCourse(Model model, HttpServletRequest h) {
        Course c = new Course();
        model.addAttribute("course", c);
        return "addCourse";
    }

    @RequestMapping(value = "/addCourse", method = RequestMethod.POST)
    public String postCourse(@ModelAttribute("course") Course c, HttpServletRequest h) {
        System.out.println("HTTP Request = " + h.getMethod());
        System.out.println("Course Name = " + c.getCourseName());
        // 填完Course表单后，重新定向导航到addStudent.jsp页面 成功！
        return "redirect:addStudent";
//        return "displayCourse";
    }

//    @Autowired
//    private CourseService cs;

//    @RequestMapping(value = "/addCourse", method = RequestMethod.GET)
//    public String getCourse(@ModelAttribute("course1") Course c, HttpServletRequest h) {
//        System.out.println("HTTP Request getCourse = " + h.getMethod());
//        return "addCourse";
//    }
//
//    @RequestMapping(value = "/addCourse", method = RequestMethod.POST)
//    public String postCourse(@ModelAttribute("course1") Course c, HttpServletRequest h) {
//        System.out.println("HTTP Request postCourse = " + h.getMethod());
//        cs.save(c);
//        return "displayCourse";
//    }


}
