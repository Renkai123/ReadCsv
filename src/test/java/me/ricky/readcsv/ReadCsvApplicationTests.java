package me.ricky.readcsv;

import me.ricky.readcsv.entity.MarketQuote;
import me.ricky.readcsv.entity.repository.MarketQuoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.stream.IntStream;

@SpringBootTest
class ReadCsvApplicationTests {

    @Autowired
    private MarketQuoteRepository marketQuoteRepository;

    @Test
    void contextLoads() {

        IntStream.range(0, 10000).forEach(
            i -> {


                marketQuoteRepository.save(new MarketQuote("名字" + i, "地址" + i, BigDecimal.ONE));
            }
        );


    }

}
