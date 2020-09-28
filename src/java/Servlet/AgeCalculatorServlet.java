package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Min Chul, Sung [808360]
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String strAge = request.getParameter("enterAge");
        
        int getAge = 0;
        int result = 0;
        String resultMessage = "Your age next birthday will be ";
        
        if(!strAge.equals("") || strAge != null) {
            getAge = Integer.parseInt(strAge);
            result = getAge + 1;           
        } else {
            response.getWriter().println("You must give your current age.");
        } 
        
        request.setAttribute("resultMess", resultMessage+result);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
}

