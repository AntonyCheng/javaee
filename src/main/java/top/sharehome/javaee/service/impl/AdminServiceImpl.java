package top.sharehome.javaee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.sharehome.javaee.bean.Admin;
import top.sharehome.javaee.bean.AdminExample;
import top.sharehome.javaee.mapper.AdminMapper;
import top.sharehome.javaee.service.api.AdminService;

import java.util.List;

/**
 * @Description
 * @Author:AntonyCheng
 * @CreateTime:2022/11/4 21:21
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin doLogin(Admin loginAdmin) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminAccountEqualTo(loginAdmin.getAdminAccount()).andAdminPasswordEqualTo(loginAdmin.getAdminPassword());
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.size() == 0) {
            return null;
        }
        return admins.get(0);
    }
}