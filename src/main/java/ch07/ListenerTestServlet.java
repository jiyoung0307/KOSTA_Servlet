package ch07;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ListenerTest")
public class ListenerTestServlet extends HttpServlet {

    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        sc = getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        sc.setAttribute("name", "홍길동");
        HttpSession session = req.getSession();         // 있으면 가져오고 없으면 만들어라
        session.setAttribute("id", session.getId());
        session.setAttribute("name", "hong");
    }
}
