import UserService from '../services/UserService';
import { useState, useEffect } from 'react';
const UserComponentFunctional = () => {
  const [users, setUsers] = useState([]);
  // componentDidMount() {
  //   UserService.getUsers().then((resp) => {
  //     this.setState({ users: resp.data });
  //     console.log(this.state.users);
  //   });
  // }
  useEffect(() => {
    console.log('in use effect');
    UserService.getUsers()
      .then((resp) => {
        setUsers(resp.data);
        console.log('res', resp.data);
        console.log('users', users);
      })
      .catch((err) => console.error('error', err));
    //  console.log('in useEfect');
  }, []);

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
            {users.map((user) => (
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
};

export default UserComponentFunctional;
