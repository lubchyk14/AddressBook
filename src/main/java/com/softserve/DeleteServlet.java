package com.softserve;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private AddressBook book;

    @Override
    public void init() throws ServletException {
        book= AddressBook.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(book.delete(request.getParameter("name"),request.getParameter("surname"))){
            response.sendRedirect("/list");
        }

    }
}
