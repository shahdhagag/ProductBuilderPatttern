/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ProductBuilderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Extract parameters from request
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String category = request.getParameter("category");
        boolean inStock = Boolean.parseBoolean(request.getParameter("inStock"));

        // Use the Builder to create a Product
        Product product = new Product.Builder()
                .setName(name)
                .setPrice(price)
                .setCategory(category)
                .setInStock(inStock)
                .build();

        // Forward to a JSP page (or do something else with the product)
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("productDetails.jsp");
        dispatcher.forward(request, response);
    }
}
