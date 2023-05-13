import React, {useEffect, useState} from 'react';
import {Button} from "@blueprintjs/core";


const SignUpOrLogin = ({authenticate}) => {

	return (
		<Button id="loginSignup-btn" type="button" onClick={authenticate} large={true} intent="warning">Login</Button>
	)
}

export default SignUpOrLogin;