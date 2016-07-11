package br.supplychain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="cks_spm_user")
public class UserBean {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private int id;
	
	@Column(name="DISPLAY_NAME")
	private String name;

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + "]";
	}
	
	
}
