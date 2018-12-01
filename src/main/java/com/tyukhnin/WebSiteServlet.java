package com.tyukhnin;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WebSiteServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("You have visited the web site of Yuriy Tyukhnin powered by Google App Engine. Thank you.");
	}
}
