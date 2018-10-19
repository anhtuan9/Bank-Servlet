package Bank;

import java.io.IOException;
import java.io.PrintWriter;

public class Bank extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double money = Double.parseDouble(request.getParameter("money"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double day = Double.parseDouble(request.getParameter("day"));
        double result = money * day * rate;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + rate + "</h1>");
        writer.println("<h1>money: " + money + "</h1>");
        writer.println("<h1>day: " + day + "</h1>");
        writer.println("<h1>result: " + result + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
