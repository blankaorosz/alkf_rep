//package hu.elte.alkfejl.repository;
//
//import hu.elte.alkfejl.entity.Order;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//
///**
// * 
// */
//@Repository
//public interface OrderRepository extends CrudRepository<Order, Long> {
//    Optional<Order> findById(Long id);
//    
//    List<Order> findAllByStatus(Boolean status);
//    List<Order> findAllByOrderDate(Date orderDate);
//
//}
