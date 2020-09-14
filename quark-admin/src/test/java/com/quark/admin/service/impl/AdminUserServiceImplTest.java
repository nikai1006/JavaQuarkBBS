package com.quark.admin.service.impl;

import com.quark.common.entity.AdminUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AdminUserServiceImplTest {

    @Autowired
    private AdminUserServiceImpl adminUserService;

    @Test
    public void findByUserName() {
    }

    @Test
    public void findByPage() {
    }

    @Test
    public void saveAdmin() {
        AdminUser adminUser = new AdminUser();
        adminUser.setUsername("admin");
        adminUser.setPassword("123456");
        adminUserService.saveAdmin(adminUser);
//        adminUser.setUsername("nikai");
//        adminUser.setPassword("123456");
//        adminUserService.saveAdmin(adminUser);

    }

    @Test
    public void saveAdminRoles() {
    }

    @Test
    public void saveAdminEnable() {
    }
}