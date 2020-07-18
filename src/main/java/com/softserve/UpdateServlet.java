package com.softserve;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    private AddressBook book;
    private String name ;
    private String surname;

    @Override
    public void init() throws ServletException {
        book= AddressBook.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newAddress = request.getParameter("useraddress");
        if (book.update(name,surname,newAddress)){
            response.sendRedirect("/list");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        name = request.getParameter("name");
        surname = request.getParameter("surname");
        String address = book.read(name,surname);
        if(address!=null){
            request.setAttribute("name",name);
            request.setAttribute("surname",surname);
            request.setAttribute("address",address) ;
            request.getRequestDispatcher("WEB-INF/update.jsp").forward(request,response);

        }else{
            response.sendError(404,"Person with name "+name+" "+surname+" wasnt found");
//            throw  new RuntimeException("Person with name \'"+name+" "+surname+ "\' not found");
        }

    }
}
