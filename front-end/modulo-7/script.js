document.getElementById("numberForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Evita o envio do formulário

    var numeroA = document.getElementById("numeroA").value;
    var numeroB = document.getElementById("numeroB").value;
    var message = document.getElementById("message");

    if (Number(numeroB) > Number(numeroA)) {
        message.textContent = "Formulário válido! O número B é maior que o número A.";
        message.style.color = "green";
    } else {
        message.textContent = "Formulário inválido. O número B deve ser maior que o número A.";
        message.style.color = "red";
    }
});
