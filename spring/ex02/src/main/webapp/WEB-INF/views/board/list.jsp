<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="${cp}/resources/assets/css/main.css" />
<style>
   .small-width{
      display:none;
   }
   #banner input, #banner select, #banner option{
      color:#000000;
   }
   select{
      width:15%;
      text-align: center;
      padding:0 20px;
      display: inline;
   }
   #keyword{
      width:55%;
      display: inline;   
   }
   #keyword+a{
      border:1px solid white;
   }
   th, td{
      text-align: center !important;
   }
   tbody tr:hover{
      background-color:rgba(255,255,255,0.3) !important;
   }
   .nowPage{
      background-color:#F9F8FF !important;
      color:#8086F1 !important;
      font-weight: 900;
   }
   @media screen and (max-width:790px){
      .big-width{
         display:none;
      }
      .small-width{
         display:block;
      }
      select[name='type']{
         width:80%;
      }
      #keyword{
         margin:10px auto;
         width:80%;
         display:block;
      }
   }
</style>
</head>
<body class="is-preload">
   ${list}
   <c:if test="${boardnum != null}">
      <script>alert("${boardnum}번 게시글 작성 완료!");</script>
   </c:if>
   <!-- Header -->
   <header id="header" class="alt">
      <a class="logo" href="${cp}/">Spring <span>Board</span></a>
      <nav id="nav">
         <ul>
            <c:choose>
               <c:when test="${loginUser == null}">
                  <li class="current"><a href="${cp}/">Home</a></li>
                  <li><a href="${cp}/user/join">Join</a></li>
                  <li><a href="${cp}/user/login">Login</a></li>
               </c:when>
               <c:otherwise>
                  <li>${loginUser.username}님 환영합니다!</li>
                  <li class="current"><a href="${cp}/">Home</a></li>
                  <li><a href="${cp}/board/list">Board</a></li>
                  <li><a href="${cp}/user/logout">Logout</a></li>
               </c:otherwise>
            </c:choose>
               
               
         </ul>
      </nav>
   </header>
   <!-- Banner -->
   <div id="banner">
      <div class="wrapper style1 special">
         <div class="inner">
            <h1 class="heading alt">Board</h1>
            <p>게시판 목록</p>
            <a href="" class="button primary" style="float:right; border-radius:0px; border-bottom: 1px solid white; border-top: 1px solid white;">글 등록</a>
            <div class="table-wrapper" style="clear: both;">
               <table>
                  <thead>
                     <tr>
                        <th style="width:10%;">번호</th>
                        <th style="width:40%;">제목</th>
                        <th style="width:15%;">작성자</th>
                        <th class="big-width" style="width:35%;">작성시간</th>
                     </tr>
                  </thead>
                  <tbody>

                     <tr>
                        <td>글번호</td>
                        <td><a href="" class="get">제목</a></td>
                        <td>작성자</td>
                        <td class="big-width">작성시간
                           <br>(수정시간)
                        </td>
                     </tr>

                     <tr>
                        <td colspan="4" class="big-width">작성된 게시글이 없습니다.</td>
                        <td colspan="3" class="small-width">작성된 게시글이 없습니다.</td>
                     </tr>
                  </tbody>
               </table>
            </div>
            <form id="searchForm" action="/board/list" onsubmit="">
               <div>
                  <select name="type">
                     <option value="">검색</option>
                     <option value="T">제목</option>
                     <option value="C">내용</option>
                     <option value="W">작성자</option>
                     <option value="TC">제목 또는 내용</option>
                     <option value="TW">제목 또는 작성자</option>
                     <option value="TCW">제목 또는 내용 또는 작성자</option>
                  </select>
                  <input type="text" name="keyword" id="keyword" value="">
                  <a href="#" class="button primary">검색</a>
               </div>
               <input type="hidden" value="1" name="pagenum">
               <input type="hidden" value="10" name="amount">
            </form>
            <div class="pagination center big-width">
               <a class="changePage" href=""><code>&lt;</code></a>
               <code class="nowPage">1</code>
               <a class="changePage" href=""><code>2</code></a>
               <a class="changePage" href=""><code>&gt;</code></a>
            </div>
            <div class="pagination center small-width">
               <a class="changePage" href=""><code>&lt;</code></a>
               <code></code>
               <a class="changePage" href=""><code>&gt;</code></a>

            </div>
         </div>
      </div>
   </div>
   <form name="pageForm" id="pageForm" action="/board/list">
      <input type="hidden" value="" name="pagenum">
      <input type="hidden" value="" name="amount">
      <input type="hidden" value="" name="type">
      <input type="hidden" value="" name="keyword">
   </form>
<!-- Scripts -->
   <script src="${cp}/resources/assets/js/jquery.min.js"></script>
   <script src="${cp}/resources/assets/js/jquery.dropotron.min.js"></script>
   <script src="${cp}/resources/assets/js/browser.min.js"></script>
   <script src="${cp}/resources/assets/js/breakpoints.min.js"></script>
   <script src="${cp}/resources/assets/js/util.js"></script>
   <script src="${cp}/resources/assets/js/main.js"></script>

   </body>
<script>

</script>
</html>





