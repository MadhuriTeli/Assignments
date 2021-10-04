import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import service from '../service/ApiService';

const DisplayFlights = (props) => {
  const [flightData, setFlightData] = useState([]);

  useEffect(() => {
    console.log('props ', props);

    service
      .findFlights(
        props.match.params.from,
        props.match.params.to,
        props.match.params.departureDate
      )
      .then((res) => {
        console.log('res ', res.data);

        //   this.setState({ flightData });
        setFlightData(res.data);
        console.log(flightData);
      })
      .catch((err) => {
        console.error(err);
      });
  }, []);

  return (
    <div>
      {console.log('in render', flightData)}
      <h2>Flights:</h2>
      <table>
        <thead>
          <tr>
            <th>Airlines</th>
            <th>Departure City</th>
            <th>Arrival City</th>
            <th>Departure Date</th>
            <th>Departure Time</th>
            <th>Fare</th>
          </tr>
        </thead>
        <tbody>
          {flightData.map((flight) => (
            <RowCreator key={flight.id} flt={flight} />
          ))}
        </tbody>
      </table>
      {/* <h4>
        Flights : {flightData.map((flight) => ' ' + flight.departureCity)}
      </h4> */}
      {/* <h4>{flightData.map((flight) => (flight <br>)}</h4> */}
      {/* <h4>
        Flights :{' '}
        {flightData.map((flight) => (
          <RowCreator flight={flight} />
        ))}
      </h4> */}
    </div>
  );
};

const RowCreator = (props) => {
  console.log('row cr props ', props.flt);
  var flight = props.flt;
  return (
    // <div>
    //   {/* console.log(flight); */}
    //   <h4>{flight.id}</h4>
    // </div>

    <tr>
      <td>{flight.operatingAirlines}</td>
      <td>{flight.departureCity}</td>
      <td>{flight.arrivalCity}</td>
      <td>{flight.departureDate}</td>
      <td>{flight.departureTime}</td>
      <td>{flight.fare}</td>
      <td>
        <Link to={'/passengerDetails/' + flight.id}>Select</Link>
      </td>
    </tr>
  );
};

export default DisplayFlights;
