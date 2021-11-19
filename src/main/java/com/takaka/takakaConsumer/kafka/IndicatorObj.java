package com.takaka.takakaConsumer.kafka;

import java.time.LocalDateTime;



public class IndicatorObj {
	private Long indicatorsId; 
	private LocalDateTime date_update;
	private String goal;
	private String target;
	private String indicator;
	private String series_code;
	private String series_description;
	private String geo_area_code;
	private String geo_area_name;
	private String time_period;
	private String value;
	
	public IndicatorObj() {	}

	public IndicatorObj(Long indicatorsId, String goal, String target, String indicator,
			String series_code, String series_description, String geo_area_code, String geo_area_name,
			String time_period, String value) {
	
		this.indicatorsId = indicatorsId;
		this.date_update = LocalDateTime.now();
		this.goal = goal;
		this.target = target;
		this.indicator = indicator;
		this.series_code = series_code;
		this.series_description = series_description;
		this.geo_area_code = geo_area_code;
		this.geo_area_name = geo_area_name;
		this.time_period = time_period;
		this.value = value;
		
		
	}
	
	
	public Long getIndicatorsId() {
		return indicatorsId;
	}
	
	public void setIndicatorsId(Long indicatorsId) {
		this.indicatorsId = indicatorsId;
	}

	
	public LocalDateTime getDate_update() {
		return date_update;
	}

	public void setDate_update(LocalDateTime date_update) {
		this.date_update = date_update;
	}

	
	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	
	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	
	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	
	public String getSeries_code() {
		return series_code;
	}

	public void setSeries_code(String series_code) {
		this.series_code = series_code;
	}

	
	public String getSeries_description() {
		return series_description;
	}

	public void setSeries_description(String series_description) {
		this.series_description = series_description;
	}

	
	public String getGeo_area_code() {
		return geo_area_code;
	}

	public void setGeo_area_code(String geo_area_code) {
		this.geo_area_code = geo_area_code;
	}

	
	public String getGeo_area_name() {
		return geo_area_name;
	}

	public void setGeo_area_name(String geo_area_name) {
		this.geo_area_name = geo_area_name;
	}

	
	public String getTime_period() {
		return time_period;
	}

	public void setTime_period(String time_period) {
		this.time_period = time_period;
	}

	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	

}
