package com.zpark.ssm.booksystem.Controller;

import com.zpark.ssm.booksystem.entity.User;
import com.zpark.ssm.booksystem.service.UserService;
import com.zpark.ssm.booksystem.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(User user) {
        User u = userService.login(user);
        if (u == null) {
            return Result.error("用户名或密码错误");
        }
        return Result.ok("登陆成功").addData("user", u);
    }

    @PostMapping("/findUser")
    public Object findUserById(Integer id) {
        User user = userService.selectById(id);
        if (user == null) {
            return Result.error("该用户不存在或者已被禁用");

        } else if (user.getState() == 2) {
            return Result.error("该用户已被禁用");
        }
        return Result.ok("查找成功").addData("user", user);
    }

    @PostMapping("/update")
    public Object updateUser(User user) {
        int num = userService.updateUser(user);
        if (num > 0) {
            return Result.ok("修改成功").addData("被修改用户user", user);
        }
        return Result.error("修改失败");
    }

}
