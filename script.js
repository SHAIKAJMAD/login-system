function login() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    if (username === "admin" && password === "1234") {
        document.getElementById("message").style.color = "green";
        document.getElementById("message").innerHTML = "Login Successful!";
        alert("Welcome " + username);
    } else {
        document.getElementById("message").style.color = "red";
        document.getElementById("message").innerHTML = "Invalid Username or Password!";
    }
}
