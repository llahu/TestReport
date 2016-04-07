<%@ page language="java" import="java.util.*,beans.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>JAVA环境生成报表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="servlet/ShowReport" method="post">
    	<input type="submit" value="生成报表">
    </form>
    <table>
      <tr>
      	<th colspan=5>变电所三相电压信息</th>
      </tr>
      <tr>
      	<th>序号</th>
      	<th>板卡号</th>
      	<th>A相电压</th>
      	<th>B相电压</th>
      	<th>C相电压</th>
      </tr>
    <%
    	List list=null;
    	if(session.getAttribute("TRANS")!=null){
    		list=(List)session.getAttribute("TRANS");
    		if(list.size()>0){
    			int id=0;//表示序号
    			Trans ts;//记得要引入类包
    			for(int i=0;i<list.size();i++){
    				ts=new Trans();
    				ts=(Trans)list.get(i);
    				
    				%>
    				 <tr>
      					<th><%=id+=1 %></th>
     				 	<th><%=ts.getBk() %></th>
   					   	<th><%=ts.getUa() %></th>
  				    	<th><%=ts.getUb() %></th>
    				  	<th><%=ts.getUc() %></th>
  				    </tr>
    				<% 
    			}
    		}
    	}
    %>
    </table>
  </body>
</html>
