package com.book_online.demo.service.impl;

import com.book_online.demo.mapper.ManagerMapper;
import com.book_online.demo.model.Manager;
import com.book_online.demo.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "managerService")
public class ManagerServiceImpl implements ManagerService {
    @Resource
    ManagerMapper managerMapper;
    @Override
    public String addManager(String managername, String managerpass) {
        Manager manager = managerMapper.adminLogin(managername);
        if(manager==null){
            manager.setAdminname(managername);
            manager.setAdminpwd(managerpass);
            int result = managerMapper.insert(manager);
            if(result==1){
                return "添加成功";
            }
            else{
                return "添加失败";
            }
        }
        else{
            return "管理员账户存在，请勿重复添加";
        }

    }

    @Override
    public String updateadminpass(String adminpass,String adminname) {
        Manager manager = new Manager();
        manager.setAdminpwd(adminpass);
        manager.setAdminname(adminname);
        int result = managerMapper.updateByPrimaryKeySelective(manager);
        if(result==1){
            return "修改成功";
        }
        else{
            return "修改失败";
        }
    }
}
