package com.pms.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OwnerResponseDto {

	private String ownerId;
	private String ownerName;
	private Long phno;
	private String email;
	private Integer age;
}
