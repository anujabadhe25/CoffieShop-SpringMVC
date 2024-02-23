package com.SRP.SOES.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SRP.SOES.Model.contactdetail;
import com.SRP.SOES.Model.userlog;

@Controller
public class SOES_Controller {

	@Autowired
	SessionFactory sf;

	@RequestMapping("createnewaccountpage")
	public String createnewaccountpage() {
		return "createaccount";
	}

	@RequestMapping("createnewaccountdata")
	public String createnewaccountdata(userlog login) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(login);
		t.commit();
		return "createaccount";
	}

	@RequestMapping("loginpage")
	public String loginpage() {
		return "login";
	}

	@RequestMapping("logindata")
	public String logindata(userlog ul) {
		Session s = sf.openSession();
		userlog login = s.get(userlog.class, ul.getPassword());

		String page = "login";

		if (login != null) {
			if (login.equals(login)) {
				page = "home";
			} else {
				page = "login";
			}
		}
		return page;
	}

	@RequestMapping("homepage")
	public String homepage() {
		return "home";
	}

	@RequestMapping("aboutpage")
	public String aboutpage() {
		return "about";
	}

	@RequestMapping("servicepage")
	public String servicepage() {
		return "service";
	}

	@RequestMapping("contactpage")
	public String contactpage() {
		return "contact";
	}

	@RequestMapping("contactdata")
	public String contactdata(contactdetail detail, Model model) {
		Session s = sf.openSession();
		contactdetail cs = s.get(contactdetail.class, detail.getEmail());
		if (cs.equals(cs)) {
			model.addAttribute("msg", "Email Already Exist");
		} else {
			model.addAttribute("msg", "Registration Successful");
			Transaction t = s.beginTransaction();
			s.save(detail);
			t.commit();
		}

		return "contact";
	}

	@RequestMapping("testimonialpage")
	public String testimonialpage() {
		return "testimonial";
	}

}
