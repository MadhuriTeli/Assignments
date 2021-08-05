var mysql = require('mysql');

var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'order_db'
});

connection.connect(function (err) {
    if (err) throw err;
    console.log("database connected");
});

module.exports = connection;
//what means database server should be on to use data?
