package pro.buildmysoftware;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/secret")
public class SecretServlet extends HttpServlet {
    private static final String SECRET = "secret1234";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (req.getParameter("haslo").equalsIgnoreCase(SECRET)) {
            req.getRequestDispatcher("goodSecret.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("badSecret.jsp").forward(req, resp);
        }

    }

}