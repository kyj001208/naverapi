package greenGroup.navercp.dto;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class NaverTokenDTO {
	
	private String access_token;
	private String expires_in;
	private String refresh_token;
	private String scope;
	private String token_type;
}
