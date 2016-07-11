package br.supplychain.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.supplychain.dao.UserDAO;
import br.supplychain.model.UserBean;

@Service
public class UserBO {
	
	@Autowired
	UserDAO userDAO;
	
	public List<UserBean> getObject(){
		return userDAO.getObject();
	}
	
	public Integer getQTDGRP(){
		return Integer.valueOf(userDAO.getQTDGRP().toString());
	}

}
