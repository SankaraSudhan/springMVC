<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   
    <!-- For google icons  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons+Outlined" rel="stylesheet">

    <title>Login form</title>
    <style>
        body {
            padding: 0;
            margin: 0;
            color: white;
            font-family: Arial, Helvetica, sans-serif;
        }
        
        .background {
            background: url('images/LoginPageBackground.jpg') rgba(0, 0, 0, 0.61);
            background-repeat: no-repeat;
            background-size: cover;
            background-blend-mode: darken;
            position: absolute;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            z-index: -1;
            filter: blur(3px);
            min-height: 800px;

        }
        
        /*h2 {
            font-size: 30px;
        }*/
        
        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            text-align: center;
            background: transparent;
            box-shadow: 0 0 10px rgb(255, 255, 255);
            border-radius: 15px;
            width: 500px;
            margin: 10vh auto;
            margin-left: 130px;
            margin-top: 90px;
        }
        
        form {
            padding: 10px;
            display: flex;
            flex-direction: column;
            width: 85%;
        }
        
        .form-item {
            display: flex;
            width: 90%;
            background: transparent;
            margin: 10px auto;
            align-items: center;
            border-radius: 15px;
            border-bottom: 1px solid rgb(82, 81, 81);
        }
        .form-item:hover {
            border: 1px solid rgb(82, 81, 81);;
        }
        input {
            font-size: 18px;
            width: 80%;
            height: 30px;
            outline: none;
            background: transparent;
            border: none;
            margin: auto;
            color: white;
        }
       
        
        span {
            margin: 5px;
            color: rgb(172, 172, 172);
            cursor: default;
            user-select: none;
            background: rgba(85, 81, 81, 0.637);
            padding: 5px;
            border-radius: 15px;
        }
        
        button[type="submit"] {
            width: 200px;
            font-size: 20px;
            margin: 10px auto;
            padding: 5px 12px;
            color: white;
            background: rgba(122, 123, 116, 0.72);
            border: none;
            text-align: center;
        }
        button[type="submit"]:hover {
            background:rgb(68, 14, 68);
        }
        p:first-of-type {
            font-size: 18px;
            margin: 0;
        }
        
        .options {
            display: flex;
            margin:  10px auto;
            flex-wrap: wrap;
            justify-content: center;
        }
        
        button {
            padding: 5px 16px;
            font-size: 16px;
            margin: 5px 15px;
            width: 180px;
            color: white;
            background: transparent;
            cursor: pointer;
           /* transition: all 0.7s ease;*/
        }
        

        .gl:hover{
            background: rgb(109, 216, 235);
            border: none;
            box-shadow: 0 0 5px  rgb(109, 216, 235);

        }
        
       p {
            font-size:16px;
            margin: 5px;
            font-style: italic;
        }
        a{
            color: white;
        }
        a:hover{
            color: grey;
        }

        @media screen and (max-width:550px) {
            .container {
                width: 90%;
            }
            
        }
    </style>

</head>

<body>
    <div class="background"></div>
    <div class="container">
        
        <p class="p"><h1>Login</h1></p>
        <form action="">

            <div class="form-item">
                <span class="material-icons-outlined">
                    account_circle
                    </span>
                <input type="text" name="text" id="text" placeholder="username or email">
            </div>

            <div class="form-item">
                <span class="material-icons-outlined">                   
                    lock
                    </span>
                <input type="password" name="pass" id="pass" placeholder="password">

            </div>

            <button type="submit"> LOGIN </button>
            <p> Or Login Using</p>
            <div class="options">
                
                <button class="gl">Google</button>
            </div>
           
        </form>

    </div>
</html>