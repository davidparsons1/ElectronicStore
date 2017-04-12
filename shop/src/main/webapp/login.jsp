<%@ page import="java.sql.*"%>
<%
    String username = request.getParameter("username");    
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store",
            "root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from User where username='" + username + "' and password='" +password + "'");
    if (rs.next()) {
        session.setAttribute("username", username);
        response.sendRedirect("success.jsp");
    } else {
        out.println("Invalid Credentials <a href='index.jsp'>try again</a>");
    }
%>