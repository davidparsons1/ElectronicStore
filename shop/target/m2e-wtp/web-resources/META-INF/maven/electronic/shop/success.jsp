<%
    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {
%>
You are not logged in<br/>
<a href="index.jsp">Please Login</a>

<%} else {
%>
<body bgcolor="grey">
Welcome <%=session.getAttribute("username")%>
<a href='logout.jsp'>Log out</a>


<%
    }
%>
