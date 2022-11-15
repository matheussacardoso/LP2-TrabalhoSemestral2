const form = document.getElementById("form");
const username = document.getElementById("username");
const cpf = document.getElementById("cpf");
const password = document.getElementById("password");
const passwordConfirmation = document.getElementById("password-confirmation");

form.addEventListener("submit", (e) => {
    e.preventDefault();

    checkInputs();
});

function checkInputs() {
    const usernameValue = username.value;
    const cpfValue = cpf.value;
    const passwordValue = password.value;
    const passwordConfirmationValue = passwordConfirmation.value;

    if (usernameValue == "") {
        setErrorFor(username, "O nome do usuário é obrigatório.");
    }
    else {
        setSuccessFor(username);
    }

    if (cpfValue === "") {
        setErrorFor(cpf, "O cpf é obrigatório.");
    } else if(cpfValue.length != 11){
        setErrorFor(cpf, "O cpf precisa ter no mínimo 11 números.");
    } 
    else {
        setSuccessFor(cpf);
    }

    if (passwordValue === "") {
        setErrorFor(password, "A senha é obrigatória.");
    } else if (passwordValue.length < 7) {
        setErrorFor(password, "A senha precisa ter no mínimo 7 caracteres.");
    } else {
        setSuccessFor(password);
    }

    if (passwordConfirmationValue === "") {
        setErrorFor(passwordConfirmation, "A confirmação de senha é obrigatória.");
    } else if (passwordConfirmationValue !== passwordValue) {
        setErrorFor(passwordConfirmation, "As senhas não conferem.");
    } else {
        setSuccessFor(passwordConfirmation);
    }

    const formControls = form.querySelectorAll(".form-control");

    const formIsValid = [...formControls].every((formControl) => {
        return formControl.className === "form-control success";
    });

    if (formIsValid) {
        console.log("O formulário está 100% válido!");
    }
}

function setErrorFor(input, message) {
    const formControl = input.parentElement;
    const small = formControl.querySelector("small");

    //Adicionar a mensagem de erro
    small.innerText = message;
    //Adicionar a classe de erro
    formControl.className = "form-control error";
}

function setSuccessFor(input) {
    const formControl = input.parentElement;

    //Adicionar a classe do sucesso
    formControl.className = "form-control sucess";
}