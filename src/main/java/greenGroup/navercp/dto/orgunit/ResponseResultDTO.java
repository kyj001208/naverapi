package greenGroup.navercp.dto.orgunit;

import java.util.List;

import lombok.Getter;

@Getter
public class ResponseResultDTO {
	
	//이름이 일치해야함
	private ResponseMetaData responseMetaData;
	private List<OrgUnit> orgUnits;
}