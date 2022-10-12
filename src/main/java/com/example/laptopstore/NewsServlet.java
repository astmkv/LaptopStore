package com.example.laptopstore;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NewsServlet", value = "/NewsServlet")
public class NewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice = request.getParameter("choice_news");
        Choice choiceNews = new Choice();
        String text = choiceNews.choiceNews(choice)[0];
        String url1 = choiceNews.choiceNews(choice)[1];
        String url2 = choiceNews.choiceNews(choice)[2];
        request.setAttribute("text", text);
        request.setAttribute("url1", url1);
        request.setAttribute("url2", url2);
//        response.sendRedirect(request.getContextPath() + "/extendedNew.jsp");
        getServletContext().
                getRequestDispatcher("/extendedNew.jsp").
                forward(request, response);
    }
}
