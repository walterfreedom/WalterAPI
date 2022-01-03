// Import the functions you need from the SDKs you need
import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.1/firebase-app.js"
import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.6.1/firebase-analytics.js"
import {getAuth, createUserWithEmailAndPassword, signOut, onAuthStateChanged , signInWithEmailAndPassword} from "https://www.gstatic.com/firebasejs/9.6.1/firebase-auth.js"
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
    apiKey: "AIzaSyCRZXsa2wCVdnJQRlwkGGsf1_9IWlhZNG0",
    authDomain: "jotterorocks.firebaseapp.com",
    databaseURL: "https://jotterorocks-default-rtdb.europe-west1.firebasedatabase.app",
    projectId: "jotterorocks",
    storageBucket: "jotterorocks.appspot.com",
    messagingSenderId: "930698198797",
    appId: "1:930698198797:web:3220b96f00309e9bf33a44",
    measurementId: "G-7S0SCDTHSX"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);
const auth = getAuth(app);

document.getElementById('registerButton').addEventListener("click",registerEmail);
document.getElementById('signOutButton').addEventListener("click",signOut1);
document.getElementById('loginButton').addEventListener("click",ferretMover);


onAuthStateChanged(auth, (user) => {
    if (user) {
        // User is signed in, see docs for a list of available properties
        // https://firebase.google.com/docs/reference/js/firebase.User
        const uid = user.uid;
        document.getElementById("loggedinDiv").style.display= "block";
        document.getElementById("loginDiv").style.display="none";
    } else {
        // User is signed out
        document.getElementById("loginDiv").style.display="block";
        document.getElementById("loggedinDiv").style.display="none";
    }
})

function signOut1(){
    signOut(auth);
}

function registerEmail(){

    var eMail=document.getElementById('eMail').value;
    var password= document.getElementById('password').value;
    console.log(eMail);
    createUserWithEmailAndPassword(auth, eMail, password)
        .then((userCredential) => {

            const user = userCredential.user;
            // ...
        })
        .catch((error) => {
            const errorCode = error.code;
            const errorMessage = error.message;
            // ..
        });
}

function loginWithEmail(){
    var eMail=document.getElementById('eMail').value;
    var password= document.getElementById('password').value;

    signInWithEmailAndPassword(auth, eMail, password)
        .then((userCredential) => {
            // Signed in
            const user = userCredential.user;
            // ...
        })
        .catch((error) => {
            const errorCode = error.code;
            const errorMessage = error.message;
        });
}


function ferretMover(){
    var interval = setInterval(ferretMove,10);
    var position = 0;
    console.log("Ferret")
    function ferretMove(){
        position+=1;
        var ferret =document.getElementById("coolFerret");
        ferret.style.left=position+"px";
    }
}





