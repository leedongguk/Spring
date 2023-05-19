<%@ page language="java" contentType="text/html; charset=euc-kr" %>
    <HTML>

    <BODY>
        <%
        String ID = (String)session.getAttribute("strID");
        if(ID != null){
        long lastTime = session.getLastAccessedTime();
        long createTime = session.getCreationTime();
        long useTime = (lastTime-createTime) / 1000;
        %>
            <%=ID %> 님은<%=useTime %> 초 동안 사이트에접속되어있습니다.
            <form action='session_4.jsp' method='post'>
                <input Type='submit' value='로그아웃'>
            </form>
        <%
        } else {
            out.println("<p>먼저 로그인을 하세요.</p>"
            + "<form action='session_1.jsp' method='post'>"
            + "<input Type='submit' value='로그인'></form>");
        } 
        %> 
    </BODY>

    </HTML>