import React from 'react';
import axios from 'axios';

class PassengerDetails extends React.Component {
  state = {};

  componentWillMount() {
    axios
      .get('http://localhost:8080/flights/' + this.props.match.params.flightId)
      .then((res) => {
        this.setState(res.data);
      });
  }

  handleSubmit(event) {
    event.preventDefault();
    const data = {
      flightId: this.props.match.params.flightId,
      passenger: {
        firstName: this.passengerFirstName,
        lastName: this.passengerLastName,
        middleName: this.passengerMiddleName,
        email: this.passengerEmail,
        phone: this.passengerPhone,
      },
    };
    axios
      .post('http://localhost:8080/reservations', data)
      .then((res) => {
        this.props.history.push('/confirmReservation/' + res.data.id);
      })
      .catch((err) => {
        console.error('in err ', err.response.data.message);
        alert(err.response.data.message);
      });
  }

  render() {
    return (
      <div>
        <h2>Confirm Reservation:</h2>
        <h2>Flight Details:</h2>
        Airline: {this.state.operatingAirlines}
        <br />
        Departure City: {this.state.departureCity}
        <br />
        Arrival City: {this.state.arrivalCity}
        <br />
        Departure Date: {this.state.departureDate}
        <br />
        Departure Time: {this.state.departureTime}
        <h2>Passenger Details:</h2>
        <form>
          First Name:
          <input
            type='text'
            name='passengerFirstName'
            onChange={(event) => {
              this.passengerFirstName = event.target.value;
            }}
          />
          <br />
          Last Name:
          <input
            type='text'
            name='passengerLastName'
            onChange={(event) => {
              this.passengerLastName = event.target.value;
            }}
          />
          <br />
          Middle Name:
          <input
            type='text'
            name='passengerMiddleName'
            onChange={(event) => {
              this.passengerMiddleName = event.target.value;
            }}
          />
          <br />
          Email:
          <input
            type='text'
            name='passengerEmail'
            onChange={(event) => {
              this.passengerEmail = event.target.value;
            }}
          />
          <br />
          Phone Number:
          <input
            type='text'
            name='passengerPhone'
            onChange={(event) => {
              this.passengerPhone = event.target.value;
            }}
          />
          <br />
          <h2>Card Details:</h2>
          Card Number:
          <input
            type='text'
            name='cardNumber'
            onChange={(event) => {
              this.cardNumber = event.target.value;
            }}
          />
          <br />
          Expiry Date:
          <input
            type='date'
            name='expirtyDate'
            onChange={(event) => {
              this.expirtyDate = event.target.value;
            }}
          />
          <br />
          Security Code:
          <input
            type='password'
            name='securityCode'
            onChange={(event) => {
              this.securityCode = event.target.value;
            }}
          />
          <br />
          <button onClick={this.handleSubmit.bind(this)}>Confirm</button>
        </form>
      </div>
    );
  }
}

export default PassengerDetails;
