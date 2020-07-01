package cn.bdqn.kbms.controller;

import cn.bdqn.kbms.pojo.User;
import cn.bdqn.kbms.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @PackageName:cn.bdqn.kbms.controller
 * @ClassName:LoginController
 * @Description:
 * @author:木子羽
 * @date:2020/6/29 19:20
 */
@Controller
@RequestMapping("/admin")
public class LoginController {
    @Resource
    private UserServiceImpl userService;
    @RequestMapping("/login.html")
    public String toLogin(){
        return "login";
    }
    //执行登录操作
    @RequestMapping(value="/dologin.html",method= RequestMethod.POST)
    public String doLogin(@RequestParam String userName,
                          @RequestParam String password,
                          HttpSession session,
                          Model model){

       User user = userService.login(userName,password);
        if(null!=user){
            session.setAttribute("user", user);
            return "redirect:/admin/main.html";
        }else{
            model.addAttribute("message", "用户名或密码不正确！");
            return "admin/login";
        }
    }

    /**
     * 跳转到主页
     */
    @RequestMapping("/main.html")
    public String main(){
        return "main";
    }
}
