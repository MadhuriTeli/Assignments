var http = require('http');
var fs = require('fs');
var handler=function (req, res) {
    fs.readFile('./DemoData/demofile1.txt', function(err, data) {
        res.writeHead(200, {'Content-Type': 'text/plain'});
        res.write(data);
       return res.end();
    });

    // The fs.appendFile() method appends specified content to a file. If the file does not exist, 
    // the file will be created:
    // fs.appendFile('./DemoData/mynewfile1.txt', 'Hello content!', function (err) {
    //       if (err) throw err;
    //       console.log('Saved!');
        
    // });

    fs.writeFile('./DemoData/mynewfile1.txt', 'test content!', function (err) {
        if (err) throw err;
        console.log('replaced !');
      });

      // fs.unlink('./DemoData/mynewfile1.txt', function (err) {
      //   if (err) throw err;
      //   console.log('File deleted!');
      // });
}
var fd=http.createServer(handler);
fd.listen(7780);
console.log("server started on port 7780");