package com.cleverpine.plex.auth.aop;

import com.cleverpine.plex.auth.ViravaSecured;
import com.cleverpine.plex.auth.principal.PrincipalProvider;
import com.cleverpine.plex.auth.principal.UserPrincipalProvider;
import com.cleverpine.viravaspringhelper.aop.BaseViravaSecuredAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ViravaSecuredAspect extends BaseViravaSecuredAspect {
    public ViravaSecuredAspect(UserPrincipalProvider principalProvider) {
        super(principalProvider);
    }

    @Before("@annotation(viravaSecured)")
    public void secure(JoinPoint joinPoint, ViravaSecured
            viravaSecured) {
        authorize(
                joinPoint,
                viravaSecured.resource(),
                viravaSecured.resourceIdParamName(),
                viravaSecured.requireAllResourceIds(),
                viravaSecured.scope());
    }
}
