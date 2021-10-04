import axios from 'axios';

const BASE_URL = 'http://localhost:8080/flights';

class ApiService {
  findFlights(from, to, departureDate) {
    return axios.get(BASE_URL + '/' + from + '/' + to + '/' + departureDate);
  }

  fetchUserById(userId) {
    return axios.get(BASE_URL + '/' + userId);
  }

  deleteUser(userId) {
    return axios.delete(BASE_URL + '/' + userId);
  }

  addUser(user) {
    return axios.post('' + BASE_URL, user);
  }

  editUser(user) {
    return axios.put(BASE_URL + '/' + user.id, user);
  }
}

export default new ApiService();
