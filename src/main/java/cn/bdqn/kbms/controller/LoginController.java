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
    //跳转到登录页
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
        if(null!=user){//验证通过==重定向到首页并且用户信息写入到session
            session.setAttribute("user", user);//将用户对象放到session作用域中
            //重定向到首页的一个请求并不是一个页面。
            return "redirect:/admin/main.html";
        }else{//验证失败
            model.addAttribute("message", "用户名或密码不正确！");
            //模拟出现了异常
            //throw new RuntimeException("用户名或密码不正确！");
            //回到登录页面
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
