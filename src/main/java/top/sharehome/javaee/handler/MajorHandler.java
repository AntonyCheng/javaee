package top.sharehome.javaee.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.sharehome.javaee.bean.Major;
import top.sharehome.javaee.service.api.MajorService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/5 15:29
 */
@Controller
public class MajorHandler {
    @Autowired
    private MajorService majorService;

    @GetMapping("/init/major")
    @ResponseBody
    public List<String> initMajor(@RequestParam("studentCollege") String studentCollege) {
        List<Major> majorList = majorService.initMajor(studentCollege);
        List<String> majors = new ArrayList<String>();
        majorList.forEach(major -> {
            majors.add(major.getMajorName());
        });
        return majors;
    }

    @GetMapping("/to/add/major/page")
    public String toAddMajorPage() {
        return "addMajor/addMajor";
    }

    @PostMapping("/add/major")
    public String addMajor(Major major, Model model) {
        if (majorService.checkMajorDuplicate(major)) {
            majorService.addMajor(major);
            model.addAttribute("addMajorResult", "存入成功！");
            return "addMajor/addMajor";
        }
        model.addAttribute("addMajorResult", "该学院这个专业已经存在！");
        return "addMajor/addMajor";
    }
}
