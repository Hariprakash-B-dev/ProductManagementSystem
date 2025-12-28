package com.pms.utils;

import com.pms.dto.OwnerResponseDto;
import com.pms.dto.ResponseDto;
import com.pms.entity.Owner;
import com.pms.mapper.OwnerMapper;

public class CommonOwnerUtils {

	public static String Id_Not_Found = "Id Not Found......!";

	 public static ResponseDto<OwnerResponseDto> prepareOwnerResponse(
		        String msg, Owner owner, int status) {

		    OwnerResponseDto dto = OwnerMapper.toDto(owner);

		    return ResponseDto.<OwnerResponseDto>builder()
		            .body(dto)
		            .msg(msg)
		            .status(status)
		            .build();
		}

}
