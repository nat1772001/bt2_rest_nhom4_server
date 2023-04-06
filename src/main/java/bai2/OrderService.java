package bai2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	public String getStatusOrder(String orderNumber,String companyID ) {
			return orderRepo.getStatusOrderByOrderNumberAndCompanyID(orderNumber, companyID)	;
		
	}

	
}
