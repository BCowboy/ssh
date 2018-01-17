package com.lol.lw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lol.lw.entity.User;
import com.lol.lw.service.UserService;

@Controller
@RequestMapping(value = "user")
public class UserController {
  private static final Log log = LogFactory.getLog(UserController.class);
  @Autowired
  private UserService userService;

  @RequestMapping(value = "/hello")
  public ModelAndView helloWord(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mv = null;
    try {
      List<User> list = userService.getUsers();
      JSONArray array = new JSONArray();
      for (User u : list) {
        JSONObject o = new JSONObject();
        o.put("id", u.getId());
        o.put("userName", u.getUserName());
        array.put(o);
      }
      mv = new ModelAndView("hello", "user", array.toString());
    } catch (JSONException e) {
      log.error(e.getMessage());
      e.printStackTrace();
    }
    return mv;
  }

  @RequestMapping(value = "save")
  public void saveUser() {
    User user = new User();
    user.setUserName("陈道明");
    userService.saveUser(user);
  }

  @RequestMapping(value = "update")
  public void updateUser() {
    User user = new User();
    user.setId(4);
    user.setUserName("朱亚文");
    userService.updateUser(user);
  }

  @RequestMapping(value = "delete")
  public void deleteUser() {
    User user = new User();
    user.setId(4);
    user.setUserName("朱亚文");
    userService.deleteUser(user);
  }

}
