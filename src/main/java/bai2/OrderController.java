package bai2;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping(value ="/orderStatus", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getStatusOrder(@RequestParam(name = "orderNumber") String orderNumber, @RequestParam(name = "companyID") String companyID) {
        String status = "";
		try {
        	status = orderService.getStatusOrder(orderNumber, companyID);
        	
        }catch(NoSuchElementException e) {
        	return "{\"response\": \"null\" }";
        }
		return "{\"response\": \"" + status + "\"}";
        
    }
	
}
