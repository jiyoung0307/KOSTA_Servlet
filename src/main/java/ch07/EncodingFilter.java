package ch07;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("*.nhn")
public class EncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
            throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) req;
        if (httpReq.getMethod().equalsIgnoreCase("POST") ||
                httpReq.getMethod().equalsIgnoreCase("GET")) {
            req.setCharacterEncoding("utf-8");
        }
        // 얘가 있어야만 서블릿이 실행됨(다음 필터로 전달 or 서블릿으로 전달)
        fc.doFilter(req, resp);
    }
}
