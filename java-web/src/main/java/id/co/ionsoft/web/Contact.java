package id.co.ionsoft.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sukma Wardana
 * @version 1.0.0
 */
public class Contact extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String message = req.getParameter("message");
        
        req.setAttribute("name", name);
        req.setAttribute("message", message);
        
        req.getRequestDispatcher("/admin/message.jsp").forward(req, resp);
    }

}
