package Exercises1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1-Http servleti ilk ba� tan�t�r�z.
//2- doGet methodunu owerride et...
//3- resp objesi �zerinden getwriter � �a��r�p taray�c�ya veri g�nder....

//Not: Normalde java kodu �zerine html kodu yazm�yoruz ama burda �rnek olsun diye yazd�k.

// Daha sonra web.xml dosyas�nda konfigurasyon i�lemlerini yap�yorumz.

public class ServletGiris extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
	
		Date date = new Date(); 	
		String mesaj = "Servlete ilk giris";
		
		pw.print("<h1>"+mesaj+"</h1 >");
		pw.print("<h2>"+date+"/h2");
		
	}	

}
