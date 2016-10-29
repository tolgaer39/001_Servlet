package Exercises1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1-Http servleti ilk baþ tanýtýrýz.
//2- doGet methodunu owerride et...
//3- resp objesi üzerinden getwriter ý çaðýrýp tarayýcýya veri gönder....

//Not: Normalde java kodu üzerine html kodu yazmýyoruz ama burda örnek olsun diye yazdýk.

// Daha sonra web.xml dosyasýnda konfigurasyon iþlemlerini yapýyorumz.

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
