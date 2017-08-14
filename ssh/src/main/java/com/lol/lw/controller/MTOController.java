package com.lol.lw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lol.lw.service.ManyToOneService;

@Controller
@RequestMapping(value = "mto")
public class MTOController {
  @Autowired
  private ManyToOneService mtoService;
  @RequestMapping(value = "findMTo")
  public void findMTO() {
    mtoService.getDetail();
  }
  
}
