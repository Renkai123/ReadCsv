package me.ricky.readcsv.service;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvUtil;
import lombok.AllArgsConstructor;
import me.ricky.readcsv.entity.MarketQuote;
import me.ricky.readcsv.entity.repository.MarketQuoteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class MarketQuoteService {

    private MarketQuoteRepository marketQuoteRepository;


    @Transactional
    public void readMarketQuote() {

        //读取
        CsvReader reader = CsvUtil.getReader();
        final List<MarketQuote> result =
            reader.read(ResourceUtil.getUtf8Reader("/Users/rk/Downloads/market_quote.csv"), MarketQuote.class);


        //校验
        result.forEach(MarketQuote::check);

        //保存
        marketQuoteRepository.saveAll(result);
    }


}
