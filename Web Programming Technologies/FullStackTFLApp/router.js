
// REST API mapping : Route configuration
// it is acting like a Dispatcher

// API routes for Controller callback functions
//a Separate responsibility  for navigation

var taskController=require("./controllers/taskscontroller");
var flowerController=require("./controllers/flowerscontroller");
var employeesController=require("./controllers/employeescontroller");

//get the app object of express from server.js

module.exports=function(app){
    //Tasks  HTTP request Mapping
    //http://localhost:9898/api/tasks

    app.route("/api/tasks")
    .get(taskController.getAll)             //http://localhost:9898/api/tasks  GET
    .post(taskController.insert);           //http://localhost:9898/api/tasks      POST

    app.route("/api/tasks/:id")
      .get(taskController.getBy)            //http://localhost:9898/api/tasks/:id    GET
      .put(taskController.update)           //http://localhost:9898/api/tasks/:id    PUT
      .delete(taskController.remove);       //http://localhost:9898/api/tasks/:id   DELETE

    //Flowers HTTP request Mapping    
    app.route("/api/flowers")              
    .get(flowerController.getAll)           //http://localhost:9898/api/flowers/       GET  
    .post(flowerController.insert);         //http://localhost:9898/api/flowers/       POST

    app.route('/api/flowers/:id')
    .get(flowerController.getBy)           //http://localhost:9898/api/flowers/:id    GET
    .put(flowerController.update)          //http://localhost:9898/api/flowers/:id    PUT
    .delete(flowerController.remove);      //http://localhost:9898/api/flowers/:id    DELETE  
    
    
    app.route("/api/employees")              
    .get(employeesController.getAll)           //http://localhost:9898/api/employees/       GET  
    .post(employeesController.insert);         //http://localhost:9898/api/employees/       POST

    app.route('/api/employees/:id')
    .get(employeesController.getBy)           //http://localhost:9898/api/employees/:id    GET
    .put(employeesController.update)          //http://localhost:9898/api/employees/:id    PUT
    .delete(employeesController.remove);      //http://localhost:9898/api/employees/:id    DELETE  


    //Orders HTTP request Mapping 
    //OrderItems HTTP request Mapping 
    //ShopingCart HTTP request Mapping 
    //Payments HTTP request Mapping 
};


  //Express Routing is a mechanism to mapping incomming HTTP requests with appropriate controller functions
