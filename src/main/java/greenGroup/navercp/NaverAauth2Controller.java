package greenGroup.navercp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import greenGroup.navercp.dto.requst.OrgUnitSaveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@Controller
public class NaverAauth2Controller {

	private final NaverCpService service;
	
	
	@GetMapping("/oauth2/code")
	public String redirctUri(@RequestParam("code") String code,@RequestParam("state") String state, Model model) throws Exception {
		System.out.println("code: " +code);
		if(state.equals("orgunit.read")) {
			service.orgUnitRead(code,model);
		}else if(state.equals("orgunit")){
			
		}
		
		return "navercp/data/unit-list";
	}
	
	@PostMapping("/departments")
	public String departments(OrgUnitSaveDTO dto) {
		
		service.savedepartment(dto);
		
		return "redirect:/";
	}
	
	
	
}
