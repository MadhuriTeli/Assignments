const Employee = require('../models/employeemodel');


exports.findAll = function(req, res) {
Employee.findAll(function(err, employee) {
  console.log('controller')
  if (err)
  res.send(err);
  console.log('res', employee);
  res.send(employee);
});
};

exports.create = function(req, res) {
  const new_employee = new Employee(req.body);
  Employee.create(new_employee, function(err, employee) {
    if (err)
    res.send(err);
    res.json({error:false,message:"Employee added successfully!",data:employee});
  });
  
  };