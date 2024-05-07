CREATE  TABLE if not exists market.`market_quote` (
                                                      `id` bigint NOT NULL AUTO_INCREMENT,
                                                      `address` varchar(255) DEFAULT NULL,
    `created_date` datetime(6) DEFAULT NULL,
    `name` varchar(255) DEFAULT NULL,
    `price` decimal(38,2) DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;