var dbConn=require('../../mysqlconnect');

var Employee = function(employee){
    this.firstname     = employee.firstname;
    this.lastname      = employee.lastname;
    this.email          = employee.email;
    this.phone          = employee.phone;
    this.salary         = employee.salary;
};


Employee.findAll = function (result) {
  dbConn.query("Select * from employees", function (err, res) {
  if(err) {
    console.log("error: ", err);
    result(null, err);
  }
  else{
    console.log('employees : ', res);
    result(null, res);
  }
  });
  };

  //insert newemployee
  Employee.create = function (newEmp, result) {
    dbConn.query("INSERT INTO employees set ?", newEmp, function (err, res) {
    if(err) {
      console.log("error: ", err);
      result(err, null);
    }
    else{
      console.log(res.insertId);
      result(null, res.insertId);
    }
    });
    };
module.exports= Employee;