import { withStyles } from '@material-ui/core/styles';
import React, { Component } from 'react';
import {
    Button,Paper, TextField, FormControl, InputLabel, Input,
    Radio, Table, TableRow, TableCell, TableHead, TableBody,TableFooter, TablePagination,
    Select,MenuItem, FormControlLabel, Checkbox, FormGroup, FormLabel,RadioGroup,
    Card, CardContent, Typography, CardActions, CardHeader, CardMedia, Grid
} from '@material-ui/core';
import axios from 'axios';

const styles = theme => ({
    root: {
        color:'blue'
    }
});

class TablePage extends Component {

    constructor(props) {
        super(props);
        this.state = {
            users: [],
        };
    }


    componentDidMount() {
        axios.get(`http://localhost:8080/apiUserV2`)
            .then(response => {
                this.setState({users:response.data})
            })
    }

    render(){
        return (
            <Paper>
                <Table>
                    <TableHead>
                        <TableRow>
                            <TableCell>Name</TableCell>
                            <TableCell>Email</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {this.state.users.map(function(user, key) {

                            return (
                                <TableRow>
                                    <TableCell>{user.name}</TableCell>
                                    <TableCell>{user.email}</TableCell>
                                </TableRow>
                            )

                        })}
                    </TableBody>
                </Table>
            </Paper>
        );
    }
}
export default withStyles(styles)(TablePage);