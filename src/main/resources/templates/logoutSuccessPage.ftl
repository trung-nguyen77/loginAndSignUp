<#import "/spring.ftl" as spring/>

<html>
<head>
    <title>Logout</title>
</head>

<body>
<nav class="navbar navbar-expand-lg " style="background-color:seagreen">
    <a class="navbar-brand" href="welcomePage.ftl">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="loginPage.ftl">Login <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="registerPage.ftl">Register</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
        </ul>
    </div>
</nav>

<h1>Logout Successful!</h1>
</body>

</html>