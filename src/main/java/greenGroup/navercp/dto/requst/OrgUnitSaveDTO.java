package greenGroup.navercp.dto.requst;

import lombok.Data;
import lombok.Setter;


@Data
public class OrgUnitSaveDTO {
	
	private String orgUnitName;
	private int displayOrder;
	private int domainId;

}
