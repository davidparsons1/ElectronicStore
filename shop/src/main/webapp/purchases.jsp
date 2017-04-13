<%@ page import ="java.sql.*" %>
<%

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store",
            "root", "root");
    Statement st = con.createStatement();
    
    int i = st.executeUpdate("INSERT INTO purchases select * from cart ");
    int j = st.executeUpdate("delete from cart ");
    if (i > 0) {
    	if (j > 0) {
        response.sendRedirect("viewprods.jsp");
    	}
    }
%>