package bai2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface OrderRepo extends JpaRepository<Order, Long> {
	
	@Query(value = "select status from donhang where orderNumber = :orderNumber and companyID = :companyID", nativeQuery = true)
	public String getStatusOrderByOrderNumberAndCompanyID(@Param("orderNumber") String orderNumber, @Param("companyID") String companyID);
}
