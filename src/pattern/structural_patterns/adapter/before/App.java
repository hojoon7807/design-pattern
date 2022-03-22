package pattern.structural_patterns.adapter.before;

import pattern.structural_patterns.adapter.before.security.LoginHandler;
import pattern.structural_patterns.adapter.before.security.UserDetails;
import pattern.structural_patterns.adapter.before.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("hojoon", "hojoon");
        System.out.println("login = " + login);
    }
}
