package com.example.ht_danh_sach_kh;

import com.example.ht_danh_sach_kh.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/x")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("nam","20-09 2002","hà nam","ảnh"));
        arrayList.add(new Student("trường","18-09-1996","hà nam","ảnh"));
        arrayList.add(new Student("ly","26-04-2000","hải dương","ảnh"));
        arrayList.add(new Student("hoài","11-01-2003","nam định","ảnh"));
        request.setAttribute("student",arrayList);  // lưu danh sách vào thuộc tính student của request
        request.getRequestDispatcher("/student.jsp").forward(request,response); //
    }
}