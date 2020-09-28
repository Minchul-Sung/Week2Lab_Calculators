import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 808360
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int calResult = 0;
        int x = 0;
        int y = 0;
        
        String x_ = request.getParameter("fnumber");
        String y_ = request.getParameter("snumber");
        String operator = request.getParameter("operator");
        
        if (!x_.equals("") || x_ != null || !y_.equals("") || y_!= null) {
            x = Integer.parseInt(x_);
            y = Integer.parseInt(y_);

            switch(operator) {
                case "+":
                    calResult = x + y;
                    break;
                case "-":
                    calResult = x - y;
                    break;
                case "*":
                    calResult = x * y;
                    break;
                case "%":
                    calResult = x % y;
                    break;
                default:
                    response.getWriter().println("No match.");                   
            }
        }       
        request.setAttribute("resultMess", calResult);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
