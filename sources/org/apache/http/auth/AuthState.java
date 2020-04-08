package org.apache.http.auth;

import java.util.Queue;
import org.apache.http.util.Args;

public class AuthState {
    private Queue<AuthOption> authOptions;
    private AuthScheme authScheme;
    private AuthScope authScope;
    private Credentials credentials;
    private AuthProtocolState state = AuthProtocolState.UNCHALLENGED;

    public void reset() {
        this.state = AuthProtocolState.UNCHALLENGED;
        this.authOptions = null;
        this.authScheme = null;
        this.authScope = null;
        this.credentials = null;
    }

    public AuthProtocolState getState() {
        return this.state;
    }

    public void setState(AuthProtocolState authProtocolState) {
        this.state = authProtocolState != null ? authProtocolState : AuthProtocolState.UNCHALLENGED;
    }

    public AuthScheme getAuthScheme() {
        return this.authScheme;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public void update(AuthScheme authScheme2, Credentials credentials2) {
        Args.notNull(authScheme2, "Auth scheme");
        Args.notNull(credentials2, "Credentials");
        this.authScheme = authScheme2;
        this.credentials = credentials2;
        this.authOptions = null;
    }

    public Queue<AuthOption> getAuthOptions() {
        return this.authOptions;
    }

    public boolean hasAuthOptions() {
        return this.authOptions != null && !this.authOptions.isEmpty();
    }

    public boolean isConnectionBased() {
        return this.authScheme != null && this.authScheme.isConnectionBased();
    }

    public void update(Queue<AuthOption> queue) {
        Args.notEmpty(queue, "Queue of auth options");
        this.authOptions = queue;
        this.authScheme = null;
        this.credentials = null;
    }

    @Deprecated
    public void invalidate() {
        reset();
    }

    @Deprecated
    public boolean isValid() {
        return this.authScheme != null;
    }

    @Deprecated
    public void setAuthScheme(AuthScheme authScheme2) {
        if (authScheme2 == null) {
            reset();
        } else {
            this.authScheme = authScheme2;
        }
    }

    @Deprecated
    public void setCredentials(Credentials credentials2) {
        this.credentials = credentials2;
    }

    @Deprecated
    public AuthScope getAuthScope() {
        return this.authScope;
    }

    @Deprecated
    public void setAuthScope(AuthScope authScope2) {
        this.authScope = authScope2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("state:").append(this.state).append(";");
        if (this.authScheme != null) {
            sb.append("auth scheme:").append(this.authScheme.getSchemeName()).append(";");
        }
        if (this.credentials != null) {
            sb.append("credentials present");
        }
        return sb.toString();
    }
}
