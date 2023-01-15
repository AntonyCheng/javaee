package top.sharehome.javaee.service.api;

import top.sharehome.javaee.bean.Admin;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/4 21:18
 */

public interface AdminService {
    Admin doLogin(Admin loginAdmin);
}
