import React from 'react';
import ReactDOM from 'react-dom';

import Typography from '@material-ui/core/Typography'

const name = 'MiaVai is real';
const element = <Typography variant='display1' align='center' gutterBottom>Hello, {name}</Typography>;



ReactDOM.render(
    element,
    document.getElementById('root')
);

