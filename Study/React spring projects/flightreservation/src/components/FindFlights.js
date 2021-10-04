import React from 'react';

class FindFlights extends React.Component {
  handleSubmit(event) {
    this.props.history.push(
      'displayFlights/' + this.from + '/' + this.to + '/' + this.departureDate
    );
  }

  render() {
    return (
      <div className='container'>
        <h2 className='text-center'>Find Flights:</h2>
        <form>
          <div className='form-group'>
            From:
            <input
              type='text'
              name='from'
              onChange={(event) => {
                this.from = event.target.value;
              }}
            />
          </div>
          <div className='form-group'>
            To:
            <input
              type='text'
              name='to'
              onChange={(event) => {
                this.to = event.target.value;
              }}
            />
          </div>
          <div className='form-group'>
            Departure Date:
            <input
              type='date'
              name='departureDate'
              onChange={(event) => {
                this.departureDate = event.target.value;
              }}
            />
          </div>
          <button
            className='btn btn-success'
            onClick={this.handleSubmit.bind(this)}
          >
            Search
          </button>
        </form>
      </div>
    );
  }
}

export default FindFlights;
