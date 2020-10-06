package br.com.unipe.aula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Classe de configuração

@Configuration
@ComponentScan("br.com.unipe.aula") //Onde defino models e daos
@EnableWebMvc
public class RootConfig {

}
