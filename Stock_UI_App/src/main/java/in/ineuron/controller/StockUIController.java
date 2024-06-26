package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.service.StockService;
import jakarta.servlet.http.HttpServletRequest;



@Controller
public class StockUIController {
	@Autowired
	private StockService service;
	
	@GetMapping("/")
	public String loadPage() {
		System.out.println("StockUIController.loadPage()");
		return "index";
	}
	
	@GetMapping("/totalCost")
	public String getTotalCost(HttpServletRequest request,Model model) {
		System.out.println("StockUIController.getTotalCost()");
		String companyName=request.getParameter("companyName");
		String quantity=request.getParameter("quantity");
		String totalStockPrice = service.getTotalStockPrice(companyName, Integer.parseInt(quantity));
		model.addAttribute("msg", totalStockPrice);
		System.out.println("Total stock Price is::"+totalStockPrice);
		return "index";
	}
	

}
