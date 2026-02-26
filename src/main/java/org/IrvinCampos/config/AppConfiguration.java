package org.IrvinCampos.config;

import org.IrvinCampos.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }

}
