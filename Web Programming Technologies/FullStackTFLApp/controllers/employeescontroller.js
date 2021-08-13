//a Separate responsibility  for  Flowers  HTTP request handling

const Employee = require('../dal/employeesdal');

exports.getAll = function(req, res) {
  console.log("calling controller function");
  Employee.getAllEmployees(function(err, employees) {
    if (err)
      res.send(err);
    res.send(employees);
  });
};

exports.insert = function(req, res) {
  var newEmployee = new Employee(req.body);
  console.log(req.body);

   if(!newEmployee.firstname || !newEmployee.id){
      res.status(400).send({ error:true, message: 'Please provide Employeed details' });
    }

   else{
        Employee.createEmployee(newEmployee, function(err, employee)
         {
            if (err)
            res.send(err);    
            res.json(employee);
        }
        );
  }
};

exports.getBy = function(req, res) {
  
    Employee.getEmployeeById(req.params.id, function(err, employee) {
    if (err)
      res.send(err);
    res.send(employee);
  });
};

exports.update = function(req, res) {
    Employee.updateById(req.params.id, new Employee(req.body), function(err, employee) {
    if (err)
      res.send(err);
    res.json(employee);
  });
};

exports.remove = function(req, res) {
    Employee.remove( req.params.id, function(err, flower) {
    if (err)
      res.send(err);
    res.json({ message: 'Flower successfully deleted' });
  });
};