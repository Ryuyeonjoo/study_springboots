package java.com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController { 
    @RequestMapping(value = "/board/form", method = RequestMethod.GET)
    public String form(){
        return "/WEB-INF/views/board/form.jsp";
    }
    @RequestMapping(value = "/board/form", method = RequestMethod.POST)
    public String formPOST(){
        //insert biz ,버튼을 누르면 list.jsp로 이동
        return "/WEB-INF/views/board/list.jsp";
    }
    @RequestMapping(value = { "/board/list", "/board" }, method = RequestMethod.GET)
    public String list(){
      
        return "/WEB-INF/views/board/list.jsp";
    }
    @RequestMapping(value =  "/board/view", method = RequestMethod.GET)
    public String view(){
      
        return "/WEB-INF/views/board/view.jsp";
    }
    
    @RequestMapping(value =  "/board/edit", method = RequestMethod.GET)
    public String edit(){
      
        return "/WEB-INF/views/board/edit.jsp";
    }
}
