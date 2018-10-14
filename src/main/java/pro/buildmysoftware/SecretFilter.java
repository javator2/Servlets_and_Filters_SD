package pro.buildmysoftware;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SecretFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;

        HttpSession session = httpRequest.getSession();

        String passParam = httpRequest.getParameter("haslo");
        session.setAttribute("haslo" , passParam);

        if("secretvalue".equals(session.getAttribute("haslo"))
                || Integer.valueOf(1).equals(session.getAttribute("secret"))){
            // TODO: implement
            session.setAttribute("secret", 1);
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            httpResponse.sendRedirect("login.jsp");

        }


    }

    @Override
    public void destroy() {

    }
}
