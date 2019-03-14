package com.durgasoft.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.durgasoft.formbeans.LoginActionForm;

public class LoginAction extends Action {
 @Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
   String status="";
	 LoginActionForm laf=(LoginActionForm)form;
   String uname=laf.getUname();
   String upwd=laf.getUpwd();
   if (uname.equals("durga")&&upwd.equals("durga")) {
	status="success";
}else {
	status="failure";
}
   return mapping.findForward(status);
}
 
}
