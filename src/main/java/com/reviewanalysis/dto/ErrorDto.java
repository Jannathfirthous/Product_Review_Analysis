package com.reviewanalysis.dto;

import org.springframework.stereotype.Component;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ErrorDto implements ProductDto {
	private String errorMsg;
}
