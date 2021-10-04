import React from 'react';

const ConfirmReservation = (props) => {
  return (
    <div>
      <b>
        Flight Reservation is complete.The confirmation code is{' '}
        {props.match.params.reservationId}
      </b>
    </div>
  );
};

export default ConfirmReservation;
