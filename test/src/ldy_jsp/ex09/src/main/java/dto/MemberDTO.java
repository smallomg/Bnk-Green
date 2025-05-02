package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class MemberDTO {
	private final String id;
	private final String pw;
	private final String name;
	private final String phone;
	private String grade;
	
}
