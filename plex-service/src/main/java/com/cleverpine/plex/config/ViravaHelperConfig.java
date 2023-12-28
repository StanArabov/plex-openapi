package com.cleverpine.plex.config;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.cleverpine.cpspringerrorutil.mapper.BaseExceptionTypeMapper;
import com.cleverpine.cpspringerrorutil.mapper.ExceptionTypeMapper;
import com.cleverpine.plex.auth.roles.Resources;
import com.cleverpine.plex.auth.roles.Roles;
import com.cleverpine.viravaspringhelper.config.AuthTokenConfig;
import com.cleverpine.viravaspringhelper.config.RoleConfig;
import com.cleverpine.viravaspringhelper.core.BaseResource;
import com.cleverpine.viravaspringhelper.core.BaseRole;
import com.cleverpine.viravaspringhelper.core.TokenAuthenticator;
import com.cleverpine.viravaspringhelper.core.ViravaJwtVerifier;
import com.cleverpine.viravaspringhelper.filter.ViravaFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Setter
@Configuration
@ConfigurationProperties(prefix = "auth.token")
public class ViravaHelperConfig {

    private String jwkUrl;
    private String usernamePath;
    private String rolesPath;
    private String emailPath;

    @Bean
    public RoleConfig<BaseRole, BaseResource> roleConfig() {
        return new RoleConfig<>(Roles.values(), Resources.values());
    }

    @Bean
    public TokenAuthenticator<DecodedJWT> tokenAuthenticator() {
        return new ViravaJwtVerifier(authTokenConfig());
    }

    @Bean
    public AuthTokenConfig authTokenConfig() {
        return AuthTokenConfig.builder().withJwkSetUrl(jwkUrl).
                withUsernamePath(usernamePath).withRolesPath(rolesPath).withEmailPath
                        (emailPath).build();
    }

    @Bean
    public ViravaFilter viravaFilter(RoleConfig<BaseRole, BaseResource>
                                             roleConfig, ObjectMapper objectMapper, AuthTokenConfig authTokenConfig,
                                     TokenAuthenticator<DecodedJWT> tokenAuthenticator) {
        return new ViravaFilter(roleConfig, objectMapper,
                authTokenConfig, tokenAuthenticator());
    }

    @Bean
    public ExceptionTypeMapper exceptionTypeMapper() {
        return new BaseExceptionTypeMapper();
    }
}