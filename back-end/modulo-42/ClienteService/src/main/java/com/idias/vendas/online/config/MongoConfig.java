package com.idias.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.idias.vendas.online.repository")
public class MongoConfig {

}
