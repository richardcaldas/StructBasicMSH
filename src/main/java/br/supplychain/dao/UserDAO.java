package br.supplychain.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.supplychain.model.UserBean;

@Repository
public class UserDAO {

	@PersistenceContext(unitName="supplychainDevelopment")
	private EntityManager manager;
	
	@PersistenceContext(unitName="supplychainProduction")
	private EntityManager managerPrd;
	
	@SuppressWarnings("unchecked")
	public List<UserBean> getObject(){
		return manager.createNativeQuery("select * from cks_spm_user",UserBean.class).getResultList();
	}
	
	public BigInteger getQTDGRP(){
		return (BigInteger) managerPrd.createNativeQuery("select count(*) from cks_grp_rpons").getSingleResult();
	}
	
}
