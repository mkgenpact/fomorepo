package com.fomosystem.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fomosystem.dao.FoMoSystemDao;
import com.fomosystem.model.FoModel;
import com.fomosystem.model.Login;
import com.fomosystem.model.MoModel;

@Controller
public class MainApplicationController {
	
	@Autowired
	FoMoSystemDao fomodao;
	
	@RequestMapping("/loadFoPage")
	public ModelAndView loadFoPage(HttpServletRequest request,Map<String, Object> model) {
		
		return new ModelAndView("fopage", "foModel", new FoModel());
	}
	
	@RequestMapping("/loadMoPage")
	public ModelAndView loadMoPage(HttpServletRequest request,Map<String, Object> model) {
		
		 return new ModelAndView("mopage", "moModel", new MoModel());
	}
	
	@RequestMapping(value = "/login")
    public String login(Model model, String error, String logout) {

		if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");
        
        model.addAttribute("login", new Login());

        return "login";
    }
	

	@RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request,Model model) {
		request.getSession().invalidate();
        model.addAttribute("message", "You have been logged out successfully.");
        model.addAttribute("login", new Login());
        return "login";
    }
	
	
	
	@RequestMapping("/")
	public ModelAndView mainPage(HttpServletRequest request,Map<String, Object> model) {
		String role = request.getParameter("role");
		request.getSession().setAttribute("role", role);
		if("FO".equalsIgnoreCase(role)) {
			model.put("foModel", new FoModel());
		}else if("MO".equalsIgnoreCase(role)) {
			model.put("moModel", new MoModel());
		}
		return new ModelAndView("index");
	}
	
	
	@PostMapping("/insertorupdateFo")
	public String InsertOrUpdateFo(FoModel fomodel,
			Map<String, Object> model) {
		fomodel.setSystemname("FO");
		fomodao.updateFo(fomodel);
		model.put("message", "Trade : "+fomodel.getTradeID() +" has been successfully updated");
		
		return "index";
	}
	
	@PostMapping("/insertOrUpdateMo")
	public String InsertOrUpdateMo(MoModel momodel,
			Map<String, Object> model) {
		momodel.setSystemname("MO");
		fomodao.updateMo(momodel);
		model.put("message", "Trade : "+momodel.getTradeID() +" has been successfully updated");
		return "index";
	}
	
	@PostMapping("/loadFoData")
	public String loadFoData(HttpServletRequest request,Map<String, Object> model) {
		String tradeId = request.getParameter("tradeId");
		FoModel fomodel = fomodao.loadFoData(new Integer(tradeId), "FO");
		if(fomodel == null){
			fomodel = new FoModel();
			model.put("message", "trade id : "+tradeId+ " not found");
		}
		model.put("foModel", fomodel);
		return "index";
	}
	
	@PostMapping("/loadMoData")
	public String loadMoData(HttpServletRequest request,Map<String, Object> model) {
		String tradeId = request.getParameter("tradeId");
		MoModel momodel = fomodao.loadMoData(new Integer(tradeId), "MO");
		if(momodel == null){
			momodel = new MoModel();
			model.put("message", "trade id : "+tradeId+ " not found");
		}
		model.put("moModel", momodel);	
		return "index";
	}
	
	
	
	
	
	
	
	
	

}
