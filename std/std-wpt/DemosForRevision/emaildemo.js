var nodemailer = require('nodemailer');

var transporter = nodemailer.createTransport({
  service: 'gmail',
  auth: {
    user: 'demosonali@gmail.com',
    pass: '*****YourPassword'
  }
});

var mailOptions = {
  from: 'demosonali@gmail.com',
  to: 'demosonali@gmail.com',
  subject: 'Sending Email using Node.js',
  text: 'That was easy!'
};

transporter.sendMail(mailOptions, function(error, info){
  if (error) {
    console.log(error);
  } else {
    console.log('Email sent: ' + info.response);
  }
});

//Enable less secure apps - https://www.google.com/settings/security/lesssecureapps