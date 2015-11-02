package BeanTutorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;


@WebServlet("/BeanTutorial")
public class PopulateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PopulateServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person p = new Person();
		p.setName("Sam Dalton");
		p.setAge(26);
		
		Address a = new Address();
		a.setLine1("221b Baker Street");
		a.setTown("London");
		a.setCounty("Greater London");
		a.setPostcode("NW1 1AA");
		
		ArrayList<PhoneNumber> al = new ArrayList<PhoneNumber>();
		PhoneNumber ph = new PhoneNumber();
		ph.setStd("01895");
		ph.setStd("678901");
		al.add(ph);
		ph = new PhoneNumber();
		ph.setStd("0208");
		ph.setStd("8654789");
		al.add(ph);
		a.setPhoneNumbers(al);
		p.setAddress(a);
		
	//request.setAttribute("person", p);
		
     request.setAttribute("person", p);
     
     getServletContext()
     		.getRequestDispatcher("/complexBean.jsp")
     					.forward(request, response);
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
