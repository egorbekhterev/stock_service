package ru.bekhterev.stockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bekhterev.stockservice.entity.Stock;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, BigInteger> {

    Optional<Stock> findStockBySymbol(String symbol);
    List<Stock> findAllByIsEnabled(boolean isEnabled);
}
