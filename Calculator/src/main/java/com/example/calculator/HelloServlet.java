package com.example.calculator;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int s1 = Integer.parseInt(request.getParameter("qt1"));
        int s2 = Integer.parseInt(request.getParameter("qt2"));
        String s3 = request.getParameter("q");
        int kq = 0;
        if (s3 == "+"){
            kq = s1 + s2;
        } else if (s3 == "-") {
            kq = s1 - s2;
        } else if (s3 == "*") {
            kq = s1 * s2;
        } else if (s3 == "/") {
            kq = s1/s2;
        }
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println(s1 + s3 + s2 + "=" + kq);
        writer.println("</html>");
    }
}