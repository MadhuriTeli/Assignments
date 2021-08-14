var http = require('http');
var fs = require('fs');

function process_request(req,resp)
{
// 	fs.readFile('./DemoData/myfile1.data', function(err, data) {
// 		resp.writeHead(200, {'Content-Type': 'text/html'});
//         resp.write(data);
//        // resp.end();
//   });
	
	fs.readFile('./DemoData/myfile.txt', function(err, data) {
		    resp.writeHead(200, {'Content-Type': 'text/html'});
        resp.write(data);
        resp.end();
  });
	
}
var srv=http.createServer(process_request);
srv.listen(7778);
console.log("server started on port no 7778");