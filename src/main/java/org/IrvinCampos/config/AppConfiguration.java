package org.IrvinCampos.config;

import org.IrvinCampos.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {
    @Bean
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

}
