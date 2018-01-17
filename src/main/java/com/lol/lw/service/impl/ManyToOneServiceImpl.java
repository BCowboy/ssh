package com.lol.lw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lol.lw.dao.ManyToOneDao;
import com.lol.lw.entity.Detail;
import com.lol.lw.service.ManyToOneService;
@Service("ManyToOneService")
@Transactional
public class ManyToOneServiceImpl implements ManyToOneService {
  private ManyToOneDao mtoDao;
  
  public ManyToOneDao getMtoDao() {
    return mtoDao;
  }
  @Autowired(required = true)
  public void setMtoDao(ManyToOneDao mtoDao) {
    this.mtoDao = mtoDao;
  }

  public List<Detail> getDetail() {
    // TODO Auto-generated method stub
    return mtoDao.getDetail();
  }

}
