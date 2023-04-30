package com.project.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "symbol", "identifier", "open", "dayHigh", "dayLow", "lastPrice", "previousClose", "change",
		"pChange", "yearHigh", "yearLow", "totalTradedVolume", "totalTradedValue", "lastUpdateTime", "perChange365d",
		"perChange30d" })

public class StockList {

	
	private String symbol;
	
	private String identifier;
	
	private Double open;
	
	private Double dayHigh;
	
	private Double dayLow;
	
	private Double lastPrice;
	
	private Double previousClose;
	
	private Double change;
	
	private Double pChange;
	
	private Double yearHigh;

	private Double yearLow;
	
	private Integer totalTradedVolume;
	
	private Double totalTradedValue;
	
	private String lastUpdateTime;
	
	private Double perChange365d;
	
	private Double perChange30d;



	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Double getOpen() {
		return open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Double getDayHigh() {
		return dayHigh;
	}

	public void setDayHigh(Double dayHigh) {
		this.dayHigh = dayHigh;
	}

	public Double getDayLow() {
		return dayLow;
	}

	public void setDayLow(Double dayLow) {
		this.dayLow = dayLow;
	}

	public Double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Double getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(Double previousClose) {
		this.previousClose = previousClose;
	}

	public Double getChange() {
		return change;
	}

	public void setChange(Double change) {
		this.change = change;
	}

	public Double getpChange() {
		return pChange;
	}

	public void setpChange(Double pChange) {
		this.pChange = pChange;
	}

	public Double getYearHigh() {
		return yearHigh;
	}

	public void setYearHigh(Double yearHigh) {
		this.yearHigh = yearHigh;
	}

	public Double getYearLow() {
		return yearLow;
	}

	public void setYearLow(Double yearLow) {
		this.yearLow = yearLow;
	}

	public Integer getTotalTradedVolume() {
		return totalTradedVolume;
	}

	public void setTotalTradedVolume(Integer totalTradedVolume) {
		this.totalTradedVolume = totalTradedVolume;
	}

	public Double getTotalTradedValue() {
		return totalTradedValue;
	}

	public void setTotalTradedValue(Double totalTradedValue) {
		this.totalTradedValue = totalTradedValue;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Double getPerChange365d() {
		return perChange365d;
	}

	public void setPerChange365d(Double perChange365d) {
		this.perChange365d = perChange365d;
	}

	public Double getPerChange30d() {
		return perChange30d;
	}

	public void setPerChange30d(Double perChange30d) {
		this.perChange30d = perChange30d;
	}
	
	

}
