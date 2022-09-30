package guru.sfg.brewery.security.google;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/****************************
 * Author: Michael File
 * Name: Google2faFailureHandler
 * Date: Sep 30, 2022
 * Description:
 ***************************/
@Slf4j
public class Google2faFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {

        log.debug("Forward to 2fa");

        request.getRequestDispatcher("/user/verify2fa")
                .forward(request, response);

    }
}
