const { response } = require('express');
var express= require('express');
var path=require('path');
var fs=require('fs');

//var sql=require('./mysqlconnect');

const { request } = require('http');

var app=express(); 

//Middlware configuration:
app.use(express.static(path.join(__dirname,'public')));
app.use(express.urlencoded({extended:true}));
app.use(express.json());

app.get('/', (req, res) => {
    //res.send("IACSD");
    res.sendFile("/public/home.html",{root:__dirname});
  }); 



// Require employee routes
const employeeRoutes = require('./src/routes/employeeroutes');

// using as middleware
app.use('/api/employees', employeeRoutes);

app.listen(9898);
console.log("Server is listening on port 9898");