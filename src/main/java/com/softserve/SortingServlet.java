package com.softserve;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sort")
public class SortingServlet extends HttpServlet {
    private  AddressBook book;

    @Override
    public void init() throws ServletException {
        book = AddressBook.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        book.sortedBy(SortOrder.valueOf(request.getParameter("value")));
        response.sendRedirect("/list");
    }
}
