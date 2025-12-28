package com.pms.mapper;

import com.pms.dto.OwnerResponseDto;
import com.pms.entity.Owner;

public class OwnerMapper {

	public static OwnerResponseDto toDto(Owner o) {
		return OwnerResponseDto.builder().ownerId(o.getOwnerId()).ownerName(o.getName()).phno(o.getPhno())
				.email(o.getEmail()).age(o.getAge()).build();
	}
}
