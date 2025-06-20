package jtm.activity18;

import jakarta.servlet.http.HttpServletResponse;
import jtm.activity17.Teacher;
import jtm.activity17.TeacherManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(value = "/", produces = "text/html;charset=UTF-8")
public class JettyController {

    TeacherManager manager;

    /**
     * method which is invoked when root folder (i.e. http://localhost:8801/) of
     * web application is requested. This method doesn't take any parameters
     * passed in URL (address).
     *
     * @return string as HTML response to the request using UTF-8 encoding for
     * non-Latin characters.
     */
    @GetMapping("")
    @ResponseBody
    // This method should work without declared name parameter, request and
    // response objects,
    // but it shows, how passed request and returned response can be used inside
    // method
    public String homePage(@RequestParam(value = "name", required = false) String name,
                           HttpServletResponse response) {
        String sb = """
                <a href='/insertTeacher'>Insert teacher<a><br/>
                <a href='/findTeacher'>Find teacher<a><br/>
                <a href='/deleteTeacher'>Delete teacher<a><br/>
                """;
        // Following is also redundant because status is OK by default:
        response.setStatus(HttpServletResponse.SC_OK);
        return sb;
    }

    // TODO Implement insertTeacher() method
    public String insertTeacher() {
        return "";
    }

    // TODO Implement findTeacher() method
    public String findTeacher() {
        return "";
    }

    // TODO Implement deleteTeacher() method
    public String deleteTeacher() {
        return "";
    }
}
