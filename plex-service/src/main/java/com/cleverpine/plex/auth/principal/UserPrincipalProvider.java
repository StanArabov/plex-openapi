package com.cleverpine.plex.auth.principal;

import com.cleverpine.plex.exception.handler.AuthenticationException;
import com.cleverpine.viravaspringhelper.config.AuthTokenConfig;
import com.cleverpine.viravaspringhelper.core.ViravaAuthenticationToken;
import com.cleverpine.viravaspringhelper.core.ViravaPrincipalProvider;
import com.cleverpine.viravaspringhelper.core.ViravaUserPrincipal;
import org.springframework.stereotype.Component;

@Component
public class UserPrincipalProvider extends ViravaPrincipalProvider<UserPrincipal> {
    private final AuthTokenConfig authTokenConfig;

    protected UserPrincipalProvider(AuthTokenConfig authTokenConfig) {
        super(UserPrincipal.class);
        this.authTokenConfig = authTokenConfig;
    }

    public ViravaUserPrincipal getBasePrincipal() {
        return getAuthentication().map(ViravaAuthenticationToken::getPrincipal).orElse(null);
    }

    public UserPrincipal get() {
        return getCustomPrincipalInfo();
    }

    @Override
    public UserPrincipal provideCustomPrincipalInfo(String username) {
        var authToken = getAuthentication().orElseThrow(() -> new AuthenticationException());

        var userUNumber = authToken.getJsonAttr(authTokenConfig.getUsernamePath());
        var email = authToken.getJsonAttr(authTokenConfig.getEmailPath());
        var roles = authToken.getRoles();
        var userId = authToken.getJsonAttr("sub");

        return new UserPrincipal(userUNumber, email, roles, userId);
    }
}
