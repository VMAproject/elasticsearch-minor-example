package com.example.spring.data.es.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;

import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

@Data
@AllArgsConstructor
public class Author {
	@Field(type = Text)
	private String name;
}
