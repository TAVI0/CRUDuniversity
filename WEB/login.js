const baseURL = "http://localhost:8080/alumn/";
const handleError = err =>{
    console.log(`Hubo un error. ${err}`);
};

//aca se almacena el usuario
let user

//datos de la pagina login
const botonBuscar = document.querySelector("#buscarId");
const userId = document.querySelector("#userId");
const userPass = document.querySelector("#userPass");


//funcion para llamar a la API
const getUser = async (id) =>{

    try {
        console.log(`Buscar usuario...`);
        user = await axios.get(`${baseURL}${id}`);
        console.log(`Ususario encontrado`);
        console.log(user);

        console.log(`verificando pass`);
        
        verifPass(user.password,userPass.value);
        console.log(`fin de verificacion`);

    } catch (err){
        handleError();
        console.log(`Ususario no existente`);
    
    }

}


function verifPass (passForm, passUser){
    if (passForm == passUser){
        console.log(`Usuario y contraseña verificados`);
    }else{
        console.log(`Contraseña incorrecta`);
    }
}


//acciona al hacer click en login
botonBuscar.addEventListener("click",()=>{
    //busca el usuario
    getUser(userId.value);
});

