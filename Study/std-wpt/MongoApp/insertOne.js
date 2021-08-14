var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

MongoClient.connect(url, function(err, client) {
  if (err) throw err;
  var dbo = client.db("mydb");

  var myobj = { name: "Company Inc", address: "Highway 37" };
  
  dbo.collection("customers").insertOne(myobj, function(err, res) {
    if (err) throw err;
    console.log("1 document inserted");
    client.close();
  });
});