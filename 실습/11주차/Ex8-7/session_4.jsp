<%@ page language="java" contentType="text/html; charset=euc-kr" %>
    <HTML>

    <BODY>
        <%
        String ID = (String)session.getAttribute("strID");
        out.println(ID + "님 안녕히 가세요.");
        session.invalidate();
        %> 
    </BODY>

    </HTML>