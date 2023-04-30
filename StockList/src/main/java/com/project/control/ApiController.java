package com.project.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.project.Model.StockList;

import jakarta.servlet.http.HttpServletRequest;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ApiController {
	
	static OkHttpClient client = new OkHttpClient();
	public static List<StockList> getdata() throws IOException {
		Request request =new Request.Builder()
				.url("https://latest-stock-price.p.rapidapi.com/price?Indices=NIFTY%2050")
				.addHeader("X-RapidAPI-Key", "cecea35ee2mshe0f9386f055efe6p15fe0fjsn4147df8301c2")
				.addHeader("X-RapidAPI-Host", "latest-stock-price.p.rapidapi.com")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            Gson gson = new Gson();
      
			List<StockList> myModel = gson.fromJson(response.body().string(), new TypeToken<List<StockList>>() {}.getType());
            List<StockList> lists=new ArrayList<>();
            lists.addAll(myModel);
            
//            for(StockList stl:lists) {
//            	System.out.println(stl.getSymbol());
//            	System.out.println(stl.getIdentifier());
//            	System.out.println(stl.getOpen());
//            	System.out.println(stl.getDayHigh());
//            	System.out.println(stl.getDayLow());
//            	System.out.println(stl.getLastPrice());
//            	System.out.println(stl.getPreviousClose());
//            	System.out.println(stl.getChange());
//            	System.out.println(stl.getpChange());
//            	System.out.println(stl.getTotalTradedVolume());
//            	System.out.println(stl.getTotalTradedValue());
//            	System.out.println(stl.getLastUpdateTime());
//            	System.out.println(stl.getYearHigh());
//            	System.out.println(stl.getYearLow());
//            	System.out.println(stl.getPerChange365d());
//            	System.out.println(stl.getPerChange30d());
//            	System.out.println("-------------------------------");
//            	
//            	
//            }
            
            return lists;
        }
		
		
		
		
		
	}

	

}
