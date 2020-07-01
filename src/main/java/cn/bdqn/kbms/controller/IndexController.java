package cn.bdqn.kbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @PackageName:cn.bdqn.kbms.controller
 * @ClassName:IndexController
 * @Description:
 * @author:木子羽
 * @date:2020/6/30 14:57
 */
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
