package com.takaka.takakaConsumer.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.takaka.takakaConsumer.model.IndicatorsModel;
import com.takaka.takakaConsumer.repository.IndicatorsRepository;

@Component
public class indicatorsConsumer {
	
	@Autowired
	IndicatorsRepository indicatorsRepository;
	
	@Autowired
	ObjectMapper mapper = new ObjectMapper();
	
	@KafkaListener(topics = "indicator", groupId = "group_id")
	public void consume(ConsumerRecord<String, String> record) throws JsonMappingException, JsonProcessingException {
		
		System.out.println(record.key());
		IndicatorObj indicators2 = mapper.readValue(record.value(), IndicatorObj.class);
		IndicatorsModel indicator = new IndicatorsModel();
		
		indicator.setIndicatorsId(indicators2.getIndicatorsId());
		indicator.setGoal(indicators2.getGoal());
		indicator.setTarget(indicators2.getTarget());
		indicator.setIndicator(indicators2.getIndicator());
		indicator.setSeries_code(indicators2.getSeries_code());
		indicator.setSeries_description(indicators2.getSeries_description());
		indicator.setGeo_area_code(indicators2.getGeo_area_code());
		indicator.setGeo_area_name(indicators2.getGeo_area_name());
		indicator.setTime_period(indicators2.getTime_period());
		indicator.setValue(indicators2.getValue());
		
		/*
		indicator.setIndicatorsId(Long.parseLong(record.key()));
		indicator.setGoal(record.value().getGoal().toString());
		indicator.setTarget(record.value().getTarget().toString());
		indicator.setIndicator(record.value().getIndicator().toString());
		indicator.setSeries_code(record.value().getSeries_code().toString());
		indicator.setSeries_description(record.value().getSeries_description().toString());
		indicator.setGeo_area_code(record.value().getGeo_area_code().toString());
		indicator.setGeo_area_name(record.value().getGeo_area_name().toString());
		indicator.setTime_period(record.value().getTime_period().toString());
		indicator.setValue(record.value().getValue().toString());
		*/
		indicatorsRepository.save(indicator);
	}

}
