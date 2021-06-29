import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscount", urlPatterns = "/discount")
public class CalculatorDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mota = request.getParameter("mota");
        float gia = Float.parseFloat(request.getParameter("gia"));
        float chietkhau = Float.parseFloat(request.getParameter("chietkhau"));

        float Price = (float) (gia * chietkhau *0.01);
        float Amount = gia - Price;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>mota: " + mota+ "</h1>");
        writer.println("<h1>gia: " + gia+ "</h1>");
        writer.println("<h1>chietkhau: " + chietkhau+ "%</h1>");
        writer.println("<h1>Amount: " + Amount+ "</h1>");
        writer.println("<h1>Price: " + Price+ "</h1>");
        writer.println("</html>");
    }
}

