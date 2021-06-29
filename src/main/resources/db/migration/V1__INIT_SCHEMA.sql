CREATE TABLE `user`
(
    `id`                        varchar(255) NOT NULL,
    `email`                     varchar(100) NOT NULL,
    `password`                  varchar(100) NOT NULL,
    `first_name`                varchar(100) NOT NULL,
    `last_name`                 varchar(100) NOT NULL,
    `create_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `update_date`               datetime DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (`id`),
    UNIQUE KEY `email` (`email`)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

  CREATE TABLE `employee`
(
    `id`                        varchar(255) NOT NULL,
    `individual_number`         varchar(100) NOT NULL,
    `first_name`                varchar(100) NOT NULL,
    `last_name`                 varchar(100) NOT NULL,
    `position`                  varchar(100) NOT NULL,
    `create_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `update_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `date_of_hire`              datetime DEFAULT NULL,

    PRIMARY KEY (`id`),
    UNIQUE KEY `individual_number` (`individual_number`)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

    CREATE TABLE `storage`
(
    `id`                        varchar(255) NOT NULL,
    `name`                      varchar(100) NOT NULL,
    `location`                  varchar(100) NOT NULL,
    `create_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `update_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `responsible_person_id`     varchar(255) NOT NULL,

    PRIMARY KEY (`id`),
    KEY `foreign_key_responsible_person` (`responsible_person_id`),
    CONSTRAINT `foreign_key_responsible_person` FOREIGN KEY (`responsible_person_id`) REFERENCES `employee` (`id`)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

    CREATE TABLE `product`
(
    `id`                        varchar(255) NOT NULL,
    `name`                      varchar(100) NOT NULL,
    `amount`                    int,
    `create_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `update_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `type`                      varchar(255) NOT NULL,

    PRIMARY KEY (`id`)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

    CREATE TABLE `supplier`
(
    `id`                        varchar(255) NOT NULL,
    `name`                      varchar(100) NOT NULL,
    `create_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `update_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `location`                  varchar(255) NOT NULL,

    PRIMARY KEY (`id`)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

      CREATE TABLE `supplier_product`
(
    `id`                        varchar(255) NOT NULL,
    `create_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `update_date`               datetime DEFAULT CURRENT_TIMESTAMP,
    `product_id`                varchar(255) NOT NULL,
    `supplier_id`               varchar(255) NOT NULL,

    PRIMARY KEY (`id`),
    KEY `foreign_key_product_id` (`product_id`),
    CONSTRAINT `foreign_key_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
    KEY `foreign_key_supplier_id` (`supplier_id`),
    CONSTRAINT `foreign_key_supplier_id` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`)

) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;