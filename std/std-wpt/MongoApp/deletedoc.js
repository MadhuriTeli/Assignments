var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

MongoClient.connect(url, function(err, db) {
  if (err) throw err;
  var dbo = db.db("mydb");

  var myquery = { address: 'Mountain 21' };

  //var myquery = { address: /^O/ }; //Delete all documents were the address starts with the letter "O"

  dbo.collection("customers").deleteOne(myquery, function(err, obj) {

    if (err) throw err;
    console.log("1 document deleted");

    db.close();
  });
});
