package com.pms.service;


import com.pms.dto.OwnerResponseDto;
import com.pms.dto.ResponseDto;
import com.pms.entity.Owner;

public interface IOwnerService {

	ResponseDto<OwnerResponseDto> signup(Owner o);
}
