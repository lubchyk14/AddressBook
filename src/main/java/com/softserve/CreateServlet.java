package com.softserve;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create")
public class CreateServlet extends HttpServlet {

    private static AddressBook bookInstance ;

    @Override
    public void init() throws ServletException {
        bookInstance = AddressBook.getInstance();
    }//is being called each time when servlet is called

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("username");
        String userSurname = request.getParameter("usersurname");
        String address = request.getParameter("useraddress");

        if(bookInstance.create(userName,userSurname,address)){
            response.sendRedirect("/list");
        }else{
            request.setAttribute("success",false);
            request.getRequestDispatcher("WEB-INF/create.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rs = request.getRequestDispatcher("WEB-INF/create.jsp");
        rs.forward(request,response);
    }
}
