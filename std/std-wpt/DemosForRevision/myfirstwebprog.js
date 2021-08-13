
//step 1: import http module
var http=require('http');

//step 2: 
var port=7779;


var myfirstRequest=function(request,response){

    //step 4:sending http header
    response.writeHead(200,{'Content-Type':'text/plain'});

    //step 5:sending data
   // response.end("Welcome to Node JS");

}

//step 3: creating server inatance
var server=http.createServer(myfirstRequest);

//step 6:Binding server instance with the port no
server.listen(port);

console.log("My first Node js web based program on port " + port);