
import React from 'react';
//import EmployeeService  from './EmployeeService';

class UpdateEmployeeComponent extends React.Component{

    constructor(props){
        super(props);
        this.state={
            firstname:'',
            lastname:'',
            emailId:''
        };
    }

    onUpdate(){
            //Delegate request to Employee Service
            //to send PUT request to  Rest API Server
            

    }

    componentDidMount(){  }
    render(){
        return (
            <div>
                <h2>Update Existing Employee</h2>

            </div>
        )
    }
}

export default UpdateEmployeeComponent;
