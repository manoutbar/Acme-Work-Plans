<%--
- form.jsp
-
- Copyright (C) 2012-2021 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.task.form.label.title" path="title"/>
	<acme:form-checkbox code="anonymous.task.form.label.public" path="isPublic"/>
	<acme:form-moment code="anonymous.task.form.label.execution-start" path="executionStart"/>
	<acme:form-moment code="anonymous.task.form.label.execution-end" path="executionEnd"/>
	<acme:form-double code="anonymous.task.form.label.workload" path="workload"/>
	<acme:form-url code="anonymous.task.form.label.link" path="link"/>
	<acme:form-textarea code="anonymous.task.form.label.description" path="description"/>
	
	<acme:form-return code="anonymous.task.form.button.return"/>	
</acme:form>
