<%@ page import ="java.sql.*" %>
<%
    String title = request.getParameter("name");    
    String manafactuer = request.getParameter("man");
    String price = request.getParameter("pri");
    String catagory = request.getParameter("cat");
    String image = request.getParameter("image");
    String stock = request.getParameter("sto");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store",
            "root", "root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into Product(title, manafactuer, price, category, image, stock) values ('" + title + "','" + manafactuer + "','" + price + "','" + catagory + "','" + image + "','" + stock + "')");
    if (i > 0) {
        response.sendRedirect("welcome.jsp");
    } else {
        response.sendRedirect("success.jsp");
    }
%>