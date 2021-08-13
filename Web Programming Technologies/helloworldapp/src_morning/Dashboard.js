import React from 'react';
//React Component Life Cycle
class Dashboard extends React.Component{
    constructor(props){
        console.log(" On Initialization ")
        super(props);
        this.state={ company:"Transflower", year:2020  };
    }

    changeCompanyTitle(){
        console.log("click event handler code execution");
        this.setState({company:"Seed Infotech"});
    }

    changeYear(){
        console.log("click event handler code execution");
        this.setState({year:2021});
    }

    //Pre Render Event Handler
    componentWillMount(){
        console.log("ComponentWillMount  Execution");
    }

    render(){
        console.log("Rendering logic invocation");

        return(
            <div>
                <h1>Balancesheet</h1>
                <br/>
                <h3>{this.state.company}</h3>
                <h3>{this.state.year}</h3>
                <hr/>
                <a onClick={this.changeCompanyTitle.bind(this)}>Change Company</a>
                <hr/>
                <a onClick={this.changeYear.bind(this)}>Change Financial Year</a>
            </div>
        );
    }

    //Post Render Event handler
    componentDidMount(){
        console.log("ComponentDidMount  Execution");

    }

    //Pre Update Event handler 
    componentWillUpdate(){
        console.log("ComponentWillUpdate.......");
    }

    //Post Update Event handler
    componentDidUpdate(){
        console.log("ComponentDidUpdate........");
    }
}
export default Dashboard;