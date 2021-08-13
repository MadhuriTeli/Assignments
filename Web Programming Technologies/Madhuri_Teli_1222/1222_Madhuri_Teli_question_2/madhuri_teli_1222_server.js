var express = require('express');
var path = require("path");

var app = express();

//midleware
app.use(express.static(path.join(__dirname, 'public')));
app.use(express.urlencoded({ extended: true }));
app.use(express.json());


//API
// app.get('/', (request, response) => {
//     response.send("IACSD");
// })


app.post("/number", (request, response) => {
    console.log(request.body);
    var numbers = request.body;
    var n = numbers.num1, i, flag = true;
    console.log(n);
    for (i = 2; i <= n - 1; i++)
        if (n % i == 0) {
            flag = false;
            break;
        }

    // Check and display message
    if (flag == true) {
        console.log("The number is prime");
        response.send("The number is prime");
    }
    else {
        console.log("The number is not prime");
        response.send("The number is not prime");
    }
});


app.listen(9898);
console.log("Server listing at port 9898....");