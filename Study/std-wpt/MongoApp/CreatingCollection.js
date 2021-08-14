var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

MongoClient.connect(url, function(err, client) {
  if (err) throw err;
   var dbo = client.db("mydb");//already exist it use it or create new

  //Create a collection name "customers":
  dbo.createCollection("customers", function(err, res) {
    if (err) throw err;
    console.log("Collection created!");
    client.close();
  });
});
