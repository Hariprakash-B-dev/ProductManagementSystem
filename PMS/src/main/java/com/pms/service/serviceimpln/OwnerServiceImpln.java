package com.pms.service.serviceimpln;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pms.dto.OwnerResponseDto;
import com.pms.dto.ResponseDto;
import com.pms.entity.Owner;
import com.pms.entity.OwnerIdGenerator;
import com.pms.repo.IOwnerIdGeneratorRepo;
import com.pms.repo.IOwnerRepo;
import com.pms.service.IOwnerService;
import com.pms.utils.CommonMsg;
import com.pms.utils.CommonOwnerUtils;

@Service
public class OwnerServiceImpln implements IOwnerService {

	@Autowired
	BCryptPasswordEncoder encoder;
	@Autowired
	IOwnerRepo ownerRepo;

	@Autowired
	IOwnerIdGeneratorRepo iOwnerIdGeneratorRepo;

	public ResponseDto<OwnerResponseDto> signup(Owner o) {
		String ownerId = ownerIdGenerator();
		o.setOwnerId(ownerId);
		o.setPassword(encoder.encode(o.getPassword()));
		Owner o1 = ownerRepo.save(o);
		ResponseDto<OwnerResponseDto> response = CommonOwnerUtils.prepareOwnerResponse(CommonMsg.SAVED.toString(),o1, HttpStatus.ACCEPTED.value());
		return response;
	}

	private String ownerIdGenerator() {
		OwnerIdGenerator i = iOwnerIdGeneratorRepo.save(new OwnerIdGenerator());
		int id = i.getId();
		if (id < 10) {
			return "OWN00" + id;
		} else if (id < 100) {
			return "OWN0" + id;
		}
		return "OWN" + id;
	}
}
