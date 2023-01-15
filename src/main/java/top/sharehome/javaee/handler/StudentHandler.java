package top.sharehome.javaee.handler;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.sharehome.javaee.bean.Student;
import top.sharehome.javaee.service.api.StudentService;

import javax.servlet.http.HttpSession;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 11:49
 */
@Controller
public class StudentHandler {
    @Autowired
    private StudentService studentService;

    @GetMapping("/to/add/student/page")
    public String toAddStudentPage() {
        return "addStudent/addStudent";
    }

    @PostMapping("/add/student")
    public String addStudent(Student student, @RequestParam("studentProvince") String studentProvince,
                             @RequestParam("studentCity") String studentCity, Model model) {
        if (!studentService.checkDuplicate(student)) {
            model.addAttribute("addError", "该学号已经存在！");
            return "addStudent/addStudent";
        } else {
            String studentAddress = studentProvince + studentCity;
            student.setStudentAddress(studentAddress);
            studentService.insertStudent(student);
            PageInfo<Student> studentList = studentService.queryStudentByAll(1);
            model.addAttribute("pageInfo", studentList);
            model.addAttribute("goCheckAdd", "查看刚才添加的信息==>");
            return "queryStudent/queryStudentPage";
        }
    }

    @GetMapping("/to/query/student/page/{pageNo}")
    public String toQueryStudentPage(@PathVariable("pageNo") Integer pageNo, Model model) {
        PageInfo<Student> studentList = studentService.queryStudentByAll(pageNo);
        model.addAttribute("pageInfo", studentList);
        return "queryStudent/queryStudentPage";
    }

    @GetMapping("/delete/student/all/{studentId}/{pageNo}")
    public String deleteStudentAll(@PathVariable("studentId") String studentId, @PathVariable("pageNo") Integer pageNo, Model model) {
        studentService.deleteStudentAll(studentId);
        PageInfo<Student> studentList = studentService.queryStudentByAll(pageNo);
        model.addAttribute("pageInfo", studentList);
        return "queryStudent/queryStudentPage";
    }

    @GetMapping("/to/update/student/all/page/{studentId}/{pageNo}")
    public String toUpdateStudentAllPage(@PathVariable("studentId") String studentId, @PathVariable("pageNo") Integer pageNo, Model model, HttpSession session) {
        model.addAttribute("studentId", studentId);
        session.setAttribute("pageNoAll", pageNo);
        return "updateStudent/updateStudentAllPage";
    }

    @PostMapping("/update/student/all")
    public String updateStudentAll(Student student, @RequestParam("studentProvince") String studentProvince,
                                   @RequestParam("studentCity") String studentCity, Model model, HttpSession session) {
        String studentAddress = studentProvince + studentCity;
        student.setStudentAddress(studentAddress);
        studentService.updateStudentAll(student);
        Integer pageNoAll = (Integer) session.getAttribute("pageNoAll");
        if (pageNoAll != null) {
            PageInfo<Student> studentList = studentService.queryStudentByAll(pageNoAll);
            model.addAttribute("pageInfo", studentList);
            return "queryStudent/queryStudentPage";
        }else {
            return "queryStudent/updateSuccess";
        }
    }

    @GetMapping("/to/query/by/{dispatcherPath}/{pageNoCondition}")
    public String toQueryByCondition(@PathVariable("pageNoCondition") Integer pageNoCondition, @PathVariable("dispatcherPath") String dispatcherPath, Model model, HttpSession session) {
        if ("id".equals(dispatcherPath)) {
            PageInfo<Student> studentList = studentService.queryStudentByAll(pageNoCondition);
            model.addAttribute("pageInfo", studentList);
            return "queryStudent/queryStudentByIdPage";
        } else if ("name".equals(dispatcherPath)) {
            PageInfo<Student> studentList = studentService.queryStudentByAll(pageNoCondition);
            model.addAttribute("pageInfo", studentList);
            return "queryStudent/queryStudentByNamePage";
        } else if ("college".equals(dispatcherPath)) {
            PageInfo<Student> studentList = studentService.queryStudentByAll(pageNoCondition);
            model.addAttribute("pageInfo", studentList);
            return "queryStudent/queryStudentByCollegePage";
        } else if ("major".equals(dispatcherPath)) {
            PageInfo<Student> studentList = studentService.queryStudentByAll(pageNoCondition);
            model.addAttribute("pageInfo", studentList);
            return "queryStudent/queryStudentByMajorPage";
        }
        PageInfo<Student> studentList = studentService.queryStudentByAll(pageNoCondition);
        model.addAttribute("pageInfo", studentList);
        return "queryStudent/queryStudentPage";
    }

    @RequestMapping("/query/by/id/{pageNoId}")
    public String fuzzyQueryById(@PathVariable("pageNoId") Integer pageNoId, @RequestParam(value = "studentId", required = false) String studentId, Model model, HttpSession session) {
        String studentIdInSession = (String) session.getAttribute("studentIdFuzzy");
        if (studentId == null) {
            studentId = "";
        }
        studentId = "%" + studentId + "%";
        if ("%%".equals(studentId)) {
            PageInfo<Student> studentList = studentService.fuzzyQueryById(studentIdInSession, pageNoId);
            model.addAttribute("pageInfo", studentList);
        } else {
            session.setAttribute("studentIdFuzzy", studentId);
            PageInfo<Student> studentList = studentService.fuzzyQueryById(studentId, pageNoId);
            model.addAttribute("pageInfo", studentList);
        }
        return "queryStudent/queryStudentByIdPage";
    }

    @GetMapping("/delete/student/id/{studentId}")
    public String deleteStudentId(@PathVariable("studentId") String studentId) {
        studentService.deleteStudentAll(studentId);
        return "queryStudent/deleteSuccess";
    }

    @GetMapping("/to/update/student/id/page/{studentId}")
    public String toUpdateStudentIdPage(@PathVariable("studentId") String studentId, Model model, HttpSession session) {
        model.addAttribute("studentId", studentId);
        session.removeAttribute("pageNoAll");
        return "updateStudent/updateStudentAllPage";
    }

    @RequestMapping("/query/by/name/{pageNoName}")
    public String fuzzyQueryByName(@PathVariable("pageNoName") Integer pageNoName, @RequestParam(value = "studentName", required = false) String studentName, Model model, HttpSession session) {
        String studentNameInSession = (String) session.getAttribute("studentNameFuzzy");
        if (studentName == null) {
            studentName = "";
        }
        studentName = "%" + studentName + "%";
        if ("%%".equals(studentName)) {
            PageInfo<Student> studentList = studentService.fuzzyQueryByName(studentNameInSession, pageNoName);
            model.addAttribute("pageInfo", studentList);
        } else {
            session.setAttribute("studentNameFuzzy", studentName);
            PageInfo<Student> studentList = studentService.fuzzyQueryByName(studentName, pageNoName);
            model.addAttribute("pageInfo", studentList);
        }
        return "queryStudent/queryStudentByNamePage";
    }

    @RequestMapping("/query/by/major/{pageNoMajor}")
    public String fuzzyQueryByMajor(@PathVariable("pageNoMajor") Integer pageNoMajor, @RequestParam(value = "studentMajor", required = false) String studentMajor, Model model, HttpSession session) {
        String studentMajorInSession = (String) session.getAttribute("studentMajorFuzzy");
        if (studentMajor == null) {
            studentMajor = "";
        }
        studentMajor = "%" + studentMajor + "%";
        if ("%%".equals(studentMajor)) {
            PageInfo<Student> studentList = studentService.fuzzyQueryByMajor(studentMajorInSession, pageNoMajor);
            model.addAttribute("pageInfo", studentList);
        } else {
            session.setAttribute("studentMajorFuzzy", studentMajor);
            PageInfo<Student> studentList = studentService.fuzzyQueryByMajor(studentMajor, pageNoMajor);
            model.addAttribute("pageInfo", studentList);
        }
        return "queryStudent/queryStudentByMajorPage";
    }

    @RequestMapping("/query/by/college/{pageNoCollege}")
    public String fuzzyQueryByCollege(@PathVariable("pageNoCollege") Integer pageNoCollege, @RequestParam(value = "studentCollege", required = false) String studentCollege, Model model, HttpSession session) {
        String studentCollegeInSession = (String) session.getAttribute("studentCollegeFuzzy");
        if (studentCollege == null) {
            studentCollege = "";
        }
        studentCollege = "%" + studentCollege + "%";
        if ("%%".equals(studentCollege)) {
            PageInfo<Student> studentList = studentService.fuzzyQueryByCollege(studentCollegeInSession, pageNoCollege);
            model.addAttribute("pageInfo", studentList);
        } else {
            session.setAttribute("studentCollegeFuzzy", studentCollege);
            PageInfo<Student> studentList = studentService.fuzzyQueryByCollege(studentCollege, pageNoCollege);
            model.addAttribute("pageInfo", studentList);
        }
        return "queryStudent/queryStudentByCollegePage";
    }
}
