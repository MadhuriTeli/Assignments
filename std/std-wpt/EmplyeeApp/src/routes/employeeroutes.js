const express = require('express');
const router = express.Router();

const employeeController =require('../controllers/employeecontroller');

// Retrieve all employees
router.get('/', employeeController.findAll);

// Create a new employee
router.post('/', employeeController.create);

module.exports = router;