package com.project.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.Model.StockList;


@Controller
public class ControlRoom {
	@GetMapping("/")
	public String game(Model model)  {
		
//		ApiController apiController=new ApiController();
//		List<StockList> stlist= new ArrayList<StockList>();
		  List<StockList> stlist;
		try {
			stlist = ApiController.getdata();
			 model.addAttribute("stlist", stlist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		
//		  model.addAttribute("stlist", stlist);
//		
//		stlist=apiController.getdata();
//		 for(StockList stl:stlist) {
//			 model.addAttribute("getSymbol",stl.getSymbol());
//			 model.addAttribute("getIdentifier",stl.getIdentifier());
//			 model.addAttribute("getOpen",stl.getOpen());
//			 model.addAttribute("getDayHigh",stl.getDayHigh());
//			
//			 
//         	System.out.println(stl.getSymbol());
//         	System.out.println(stl.getIdentifier());
//         	System.out.println(stl.getOpen());
//         	System.out.println(stl.getDayHigh());
//         	System.out.println(stl.getDayLow());
//         	System.out.println(stl.getLastPrice());
//         	System.out.println(stl.getPreviousClose());
//         	System.out.println(stl.getChange());
//         	System.out.println(stl.getpChange());
//         	System.out.println(stl.getTotalTradedVolume());
//         	System.out.println(stl.getTotalTradedValue());
//         	System.out.println(stl.getLastUpdateTime());
//         	System.out.println(stl.getYearHigh());
//         	System.out.println(stl.getYearLow());
//         	System.out.println(stl.getPerChange365d());
//         	System.out.println(stl.getPerChange30d());
//         	System.out.println("-------------------------------");
//         	
         	
//         }
		
		
		return "index";
	}
}
