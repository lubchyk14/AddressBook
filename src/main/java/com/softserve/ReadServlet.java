package com.softserve;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/read")
public class ReadServlet extends HttpServlet {
    private AddressBook book;
    private String name ;
    private String surname;
    @Override
    public void init() throws ServletException {
        book=AddressBook.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        name = (String)request.getParameter("name");
        surname =(String) request.getParameter("surname");
        String address = book.read(name,surname);
        if(address!=null){
            request.setAttribute("name",name);
            request.setAttribute("surname",surname);
            request.setAttribute("address",address);
            request.getRequestDispatcher("WEB-INF/read.jsp").forward(request,response);
        }
        else{
            response.sendError(404,"Person with name "+name+" "+surname+" wasnt found");
//            request.setAttribute("message","Person with name "+name+" "+surname+" not found in record book");
//            request.getRequestDispatcher("WEB-INF/Error.jsp").forward(request,response);
//            throw  new RuntimeException("Person with name \'"+name+" "+surname+ "\' not found");
        }

    }
}
