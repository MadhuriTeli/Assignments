//a Separate responsibility  for  Flowers database crud operation
var sql = require('./mysqlconnect');

var Employee = function(emp){
    this.id=emp.Id;
    this.firstname = emp.firstname;
    this.lastname = emp.lastname;
    this.emailId = emp.emailId;
    
};

Employee.createEmployee = function (newEmployee, result) {  
        console.log("New employee to be added ");
        console.log(newEmployee);
        sql.query("INSERT INTO employees set ?", newEmployee, function (err, res) {
                if(err) {
                  console.log("error: ", err);
                  result(err, null);  //invoking callback function registered in controller
                }
                else{
                  console.log(res.insertId);
                  result(null, res.insertId); //invoking callback function registered in controller
                }
            });           
};

Employee.getEmployeeById = function (empId, result) {
        sql.query("Select * from employees where id = ? ", empId, function (err, res) {             
                if(err) {
                  console.log("error: ", err);
                  result(err, null);
                }
                else{
                  result(null, res);     
                }
            });   
};


Employee.getAllEmployees = function (result) {
      console.log("Invoking dal getall Employees");
      
        sql.query("Select * from employees", function (err, res) {
                if(err) {
                  console.log("error: ", err);
                  result(null, err);
                }
                else{
                  console.log('Employees : ', res);  
                  result(null, res);
                }
            });   
};

Employee.updateById = function(id, emp, result){

  sql.query("UPDATE employees SET firstname = ? WHERE id = ?", [emp.firstname, id], 
              function (err, res) {
                  if(err) {
                        console.log("error: ", err);
                        result(null, err);
                    }
                  else{   
                    result(null, res);
                    }
                }); 
};


Employee.remove = function(id, result){
    sql.query("DELETE FROM employees WHERE id = ?", [id],
                function (err, res) {
                  if(err) {
                      console.log("error: ", err);
                      result(null, err);
                  }
                  else{
                      result(null, res);
                  }
            }); 
};

module.exports=Employee;