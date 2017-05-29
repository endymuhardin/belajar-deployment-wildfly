package com.muhardin.endy.belajar.ejb.servlet;

import com.muhardin.endy.belajar.ejb.Produk;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class ProdukServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Produk p = new Produk();
        p.setKode("P-001");
        p.setNama("Produk 001");
        p.setHarga(new BigDecimal(100000.00));

        PrintWriter output = resp.getWriter();
        output.println("<html>");
        output.println("<head>");
        output.println("<title>Data Produk</title>");
        output.println("</head>");
        output.println("<body>");
        output.println("<h1> Data Produk </h1>");
        output.println("Kode Produk : "+p.getKode()+"<br>");
        output.println("Nama Produk : "+p.getNama()+"<br>");
        output.println("Harga Produk : "+p.getHarga()+"<br>");
        output.println("</body>");
        output.println("</html>");
    }
}
