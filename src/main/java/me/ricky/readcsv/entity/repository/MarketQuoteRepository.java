package me.ricky.readcsv.entity.repository;

import me.ricky.readcsv.entity.MarketQuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarketQuoteRepository extends JpaRepository<MarketQuote, Long> {


}
