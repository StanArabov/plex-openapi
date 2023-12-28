package com.cleverpine.plex.auth.principal;
import java.util.List;

import com.cleverpine.viravaspringhelper.core.CustomPrincipalInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserPrincipal implements CustomPrincipalInfo {
    private String username;

    private String email;

    private List<String> roles;

    private String userId;
}
