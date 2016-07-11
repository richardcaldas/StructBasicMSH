package br.supplychain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import br.supplychain.business.UserBO;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	UserBO userBO;
	
	@RequestMapping(value = { "/teste" })
    public String getTesteEM(ModelMap model) {
		System.out.println("entrou aqui");
		System.out.println(userBO.getObject().size());		
		System.out.println(userBO.getObject().get(0).toString());
		System.out.println(userBO.getQTDGRP());
		model.addAttribute("teste", userBO.getObject().get(0).toString());
		model.addAttribute("qtd", userBO.getQTDGRP());
		
    	return "index";
    }
	
}
