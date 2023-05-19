<%@ page language="java" contentType="text/html; charset=euc-kr" %>
    <HTML>
    <BODY>
        <%
        String id = (String)request.getParameter("strID");
        String pwd = (String)request.getParameter("strPwd");
        if ( id.equals("aaa") && pwd.equals("1234"))
        {
            String strSessionID = session.getId();
            int intTime = session.getMaxInactiveInterval();
            session.setAttribute("ID", id);
            %>
            <B> <%=id %> 님 환영합니다.</B><p>
                세션 ID: <%=strSessionID %> <BR>
                세션 시간: <%=intTime %> 초
        <%
                } else
                out.println("<p> 잘못된 ID/PassWord입니다. </p>");


        %>
    </BODY>

    </HTML>