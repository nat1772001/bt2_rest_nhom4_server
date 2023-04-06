package bai2;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="donhang")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	
	private String companyID;
	@Id
	private String orderNumber;
	private String Status;
	
	
}
