package com.takaka.takakaConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.takaka.takakaConsumer.model.IndicatorsModel;
import com.takaka.takakaConsumer.repository.IndicatorsRepository;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TakakaConsumerApplication {
	
	@Autowired
	IndicatorsRepository indicatorsRepository;

	public static void main(String[] args) {
		SpringApplication.run(TakakaConsumerApplication.class, args);
	}

	// endereço para chama o swagger - http://localhost:8080/fiap/swagger-ui/#/
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
						.basePackage("com.takaka.takakaProducer.controller"))
				.paths(PathSelectors.any()).build();
	}
	
	@Bean
	public void criaruser2() {
		indicatorsRepository.save(new IndicatorsModel("goal", "target", "indicator", "series_code", "series_description", "geo_area_code", "geo_area_name", "time_period", "value"));
		indicatorsRepository.save(new IndicatorsModel("goal", "target", "indicator", "series_code", "series_description", "geo_area_code", "geo_area_name", "time_period", "value"));
		indicatorsRepository.save(new IndicatorsModel("goal", "target", "indicator", "series_code", "series_description", "geo_area_code", "geo_area_name", "time_period", "value"));
		indicatorsRepository.save(new IndicatorsModel("goal", "target", "indicator", "series_code", "series_description", "geo_area_code", "geo_area_name", "time_period", "value"));
		indicatorsRepository.save(new IndicatorsModel("goal", "target", "indicator", "series_code", "series_description", "geo_area_code", "geo_area_name", "time_period", "value"));
		indicatorsRepository.save(new IndicatorsModel("goal", "target", "indicator", "series_code", "series_description", "geo_area_code", "geo_area_name", "time_period", "value"));
	}

}
