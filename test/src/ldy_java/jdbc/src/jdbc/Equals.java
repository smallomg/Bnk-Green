package jdbc;

import java.util.Objects;

import lombok.Data;

/*import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode*/

@Data
public class Equals {

	private int mno;
	private String name;
	private String phone;

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Equals target = (Equals) obj;

		return mno == target.mno && name.equals(target.name) && phone.equals(target.phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mno, name, phone);
	}

}
