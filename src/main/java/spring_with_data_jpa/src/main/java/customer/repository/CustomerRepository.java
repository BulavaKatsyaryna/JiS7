package customer.repository;

import customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>, JpaSpecificationExecutor<CustomerEntity> {

    //метод Query (если не хватает, нужно исп JpaSpecificationExecutor)
    boolean existsByIdAndUserNameLikeAndAddressIsNotNullAndBasketId(Long id, String userName, Long basketId);

    @Query(nativeQuery = true, value = "SELECT * FROM customers WHERE firstName = ?")
    CustomerEntity findByFirstName(String firstName);
}
