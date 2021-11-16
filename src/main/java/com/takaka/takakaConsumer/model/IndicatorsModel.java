package com.takaka.takakaConsumer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "indicators")
public class IndicatorsModel {
	
	private Long indicatorsId; 
	private String goal;
	private String target;
	private String indicator;
	private String series_code;
	private String series_description;
	private String geo_area_code;
	private String geo_area_name;
	private String time_period;
	private String value;
	
	public IndicatorsModel() {	}

	public IndicatorsModel( String goal, String target, String indicator,
			String series_code, String series_description, String geo_area_code, String geo_area_name,
			String time_period, String value) {

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
	
	@Id
	@Column(name = "indicatorsId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOJA_PROD_SEQ")
	@SequenceGenerator(name = "LOJA_PROD_SEQ", sequenceName = "LOJA_PROD_SEQ", allocationSize = 1)
	@ApiModelProperty(value = "ID do Indicator")
	public Long getIndicatorsId() {
		return indicatorsId;
	}
	
	public void setIndicatorsId(Long indicatorsId) {
		this.indicatorsId = indicatorsId;
	}

	@Column(name = "goal")
	@ApiModelProperty(value = "Inform�ao do goal")
	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	@Column(name = "target")
	@ApiModelProperty(value = "Inform�ao do target")
	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Column(name = "indicator")
	@ApiModelProperty(value = "Inform�ao do indicator")
	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	@Column(name = "series_code")
	@ApiModelProperty(value = "Inform�ao do series_code")
	public String getSeries_code() {
		return series_code;
	}

	public void setSeries_code(String series_code) {
		this.series_code = series_code;
	}

	@Column(name = "series_description")
	@ApiModelProperty(value = "Inform�ao do series_description")
	public String getSeries_description() {
		return series_description;
	}

	public void setSeries_description(String series_description) {
		this.series_description = series_description;
	}

	@Column(name = "geo_area_code")
	@ApiModelProperty(value = "Inform�ao do geo_area_code")
	public String getGeo_area_code() {
		return geo_area_code;
	}

	public void setGeo_area_code(String geo_area_code) {
		this.geo_area_code = geo_area_code;
	}

	@Column(name = "geo_area_name")
	@ApiModelProperty(value = "Inform�ao do geo_area_name")
	public String getGeo_area_name() {
		return geo_area_name;
	}

	public void setGeo_area_name(String geo_area_name) {
		this.geo_area_name = geo_area_name;
	}

	@Column(name = "time_period")
	@ApiModelProperty(value = "Inform�ao do time_period")
	public String getTime_period() {
		return time_period;
	}

	public void setTime_period(String time_period) {
		this.time_period = time_period;
	}

	@Column(name = "value")
	@ApiModelProperty(value = "Inform�ao do value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}