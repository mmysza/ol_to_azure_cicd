package com.ora_sp_sdk.openlegacy;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import com.ora_sp_sdk.openlegacy.config.OraSpSdkConfiguration;

/**
 * no-op marker class for spring boot's auto-configuration
 */
@Configuration
@Import(value = {OraSpSdkConfiguration.class})
public class OraSpSdkAutoConfiguration {
}
