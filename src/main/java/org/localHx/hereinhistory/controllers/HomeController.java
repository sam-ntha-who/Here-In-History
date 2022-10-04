package org.localHx.hereinhistory.controllers;

import org.localHx.hereinhistory.models.HistoricalData;
import org.localHx.hereinhistory.repositories.HxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	HxRepository hxRepo;
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/results")
	public String showResults(Model model, @RequestParam String zipCode) {
		model.addAttribute("zipCode", zipCode);
		return "results";
		
	}
	
	@RequestMapping("addData")
	public String addData() {
		return "addData";
	}
	
	@RequestMapping("dataAdded")
	public String dataAdded(Model model, @RequestParam(required=false) String zipCode, @RequestParam(required=false) String geoLoc, @RequestParam String hxData, @RequestParam int year) {
		model.addAttribute("zipCode", zipCode);
		model.addAttribute("geoLoc", geoLoc);
		model.addAttribute("hxData", hxData);
		model.addAttribute("year", year);
		HistoricalData data = new HistoricalData(hxData, zipCode, year);
		
		hxRepo.insert(data);
		return "dataAdded";
	}
	
}
