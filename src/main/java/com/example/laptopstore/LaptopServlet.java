package com.example.laptopstore;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LaptopServlet", value = "/LaptopServlet")
public class LaptopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice = request.getParameter("choice_model");
        Choice choiceModel = new Choice();
        String model = choiceModel.choiceModel(choice)[0];
        String os = choiceModel.choiceModel(choice)[1];
        String proc = choiceModel.choiceModel(choice)[2];
        String memory = choiceModel.choiceModel(choice)[3];
        String display = choiceModel.choiceModel(choice)[4];
        String url1 = choiceModel.choiceModel(choice)[5];
        String url2 = choiceModel.choiceModel(choice)[6];
        String url3 = choiceModel.choiceModel(choice)[7];

        request.setAttribute("model", model);
        request.setAttribute("os", os);
        request.setAttribute("proc", proc);
        request.setAttribute("memory", memory);
        request.setAttribute("display", display);
        request.setAttribute("url1", url1);
        request.setAttribute("url2", url2);
        request.setAttribute("url3", url3);

        getServletContext().
                getRequestDispatcher("/laptop.jsp").
                forward(request, response);
    }
}
