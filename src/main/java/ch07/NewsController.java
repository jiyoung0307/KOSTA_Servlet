package ch07;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/news.nhn")
// img upload
@MultipartConfig(maxFileSize = 1024*1024*2 , location = "d:/Temp/img")
public class NewsController extends HttpServlet {
  private NewsDAO newsDAO;
  private ServletContext ctx;
  private final String START_PAGE = "/ch07/newsList.jsp";

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    newsDAO = new NewsDAO();
    ctx = getServletContext();
  }

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("utf-8");
    String action = req.getParameter("action");
    if(action == null) {
      action = "list";
    }
  }
}
