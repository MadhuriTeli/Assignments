






var http = require('http');
var url = require('url');
var fs=require("fs");

var requestHeader=function(req,res){

    //console.log("Its your first call back function");
   // res.write("Its your first call back function");

  // res.writeHead(200, {'Content-Type': 'text/html'});
   //res.write(req.url);

    //console.log("Its your first call back function");
   // res.end();

   const p=req.url;
   switch(p)
   {
    case "/":
        
        fs.readFile("./DemoHtml/index.html",function(err,data)
        {
            if(err)
            {
                res.end("error");
                console.log("error");
            }
            else{
               res.writeHead(200, {'Content-Type': 'text/html'});
                res.write(data);
                res.end(data);
            }
            
        });
        break;
   
   case "/myinfo":
        
        fs.readFile("./DemoJson/myinfo.json",function(err,data)
        {
            if(err)
            {
                res.end("error");
                console.log("error");
            }
            else{
                res.writeHead(200, {'Content-Type': 'application/json'});
               // res.write(JSON.toString(data));
               res.write(data);
                res.end(data);
            }
            
        });
        break;
   }
}
var server=http.createServer(requestHeader);
server.listen(7777);
console.log("Your server is started on port 7777");