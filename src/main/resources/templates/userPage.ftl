<#import "/spring.ftl" as spring/>

<html>
<head>
    <title>User Info</title>
</head>
<body>


<h2>User Info Page</h2>
<h3>Welcome : <span ${request.userPrincipal.name}></span></h3>
<b>This is protected page!</b>

<br/><br/>

<#if userInfo?exists> ${userInfo} </#if>

</body>

</html>