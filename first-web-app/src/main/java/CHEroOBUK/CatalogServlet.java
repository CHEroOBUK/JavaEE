package CHEroOBUK;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CatalogServlet", urlPatterns = "/catalog")

public class CatalogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>Каталог товаров</h1>");
        resp.getWriter().println("<h2>Навигация по сайту:</h2>");
        resp.getWriter().println("<p><a href=\"main\">Главная страница</a></p>");
        resp.getWriter().println("<p><a href=\"product\">Товар</a></p>");
        resp.getWriter().println("<p><a href=\"cart\">Корзина</a></p>");
        resp.getWriter().println("<p><a href=\"order\">Оформление заказа</a></p>");
    }
}
