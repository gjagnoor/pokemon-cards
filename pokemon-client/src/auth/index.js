import { initializeApp } from 'firebase/app';
import { getAuth, GoogleAuthProvider} from "firebase/auth";

const firebaseConfig = {
	apiKey: "AIzaSyBX2eownn25Csd-qRAKtuJ67HjT0V7pBp8",
	authDomain: "pokemon-cards-8926a.firebaseapp.com",
	projectId: "pokemon-cards-8926a",
	storageBucket: "pokemon-cards-8926a.appspot.com",
	messagingSenderId: "1013322393009",
	appId: "1:1013322393009:web:04325565dbccff1d4f4990"
};

const firebaseApp = initializeApp(firebaseConfig);

const auth = getAuth(firebaseApp);
const provider = new GoogleAuthProvider();
export {auth, provider};