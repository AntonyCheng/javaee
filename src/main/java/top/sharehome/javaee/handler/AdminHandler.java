package top.sharehome.javaee.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import top.sharehome.javaee.bean.Admin;
import top.sharehome.javaee.service.api.AdminService;

import javax.servlet.http.HttpSession;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/4 20:47
 */
@Controller
public class AdminHandler {
    @Autowired
    private AdminService adminService;

    @GetMapping("/to/login/page")
    public String toLoginPage() {
        return "login";
    }

    @PostMapping("/doLogin")
    public String toIndexPage(Admin loginAdmin, Model model, HttpSession session) {
        Admin admin = adminService.doLogin(loginAdmin);
        if (admin == null) {
            model.addAttribute("loginAdmin", loginAdmin);
            model.addAttribute("loginError", "账号或者密码错误");
            return "login";
        }
        session.setAttribute("admin", admin);
        return "index";
    }

    @GetMapping("/quit")
    public String doQuit(HttpSession session) {
        session.removeAttribute("admin");
        return "redirect:/to/login/page";
    }
}
