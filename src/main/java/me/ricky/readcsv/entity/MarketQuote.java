package me.ricky.readcsv.entity;

import cn.hutool.core.annotation.Alias;
import cn.hutool.core.text.csv.CsvRow;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity

public class MarketQuote implements Serializable {

    @Serial
    private static final long serialVersionUID = 539013930100978458L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Alias("name")
    private String name;

    @Alias("address")
    private String address;

    @Alias("price")
    private BigDecimal price;

    @CreatedDate
    private LocalDateTime createdDate;

    public MarketQuote(String name, String address, BigDecimal price) {
        this.name = name;
        this.address = address;
        this.price = price;
    }

    public void check(){
        //check
    }


}
