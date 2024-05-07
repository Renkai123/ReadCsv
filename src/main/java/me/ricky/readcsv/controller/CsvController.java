package me.ricky.readcsv.controller;

import lombok.AllArgsConstructor;
import me.ricky.readcsv.service.MarketQuoteService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

@RestController
@AllArgsConstructor
public class CsvController {

    private MarketQuoteService marketQuoteService;

    @PostMapping("/read")
    public void uploadCsv() {
        marketQuoteService.readMarketQuote();
    }
}

