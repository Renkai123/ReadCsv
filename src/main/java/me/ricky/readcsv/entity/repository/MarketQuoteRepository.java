package me.ricky.readcsv.entity.repository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

    

@Repository
public interface MarketQuoteRepository extends JpaRepository<MarketQuote, Long> {
    
    Optional<MarketQuote> findByIdAndCustomerId(Long id, Long customerId);

    List<MarketQuote> findByIdInAndCustomerId(List<Long> ids, Long customerId);
}
