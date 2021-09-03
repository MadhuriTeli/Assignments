import React from 'react';
import UserService from '../services/UserService';
class UserComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      users: [],
    };
  }
  componentDidMount() {
    UserService.getUsers().then((resp) => {
      this.setState({ users: resp.data });
      console.log(this.state.users);
    });
  }
  render() {
    return (
      <div>
        {
          <table className='table table-striped'>
            <tr>
              <th>User ID</th>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Salary</th>
            </tr>
            <tbody>
              {this.state.users.map((user) => (
                <tr key={user.id}>
                  <td>{user.id}</td>
                  <td>{user.firstName}</td>
                  <td>{user.lastName}</td>
                  <td>{user.salary}</td>
                </tr>
              ))}
            </tbody>
          </table>
        }
      </div>
    );
  }
}
export default UserComponent;
