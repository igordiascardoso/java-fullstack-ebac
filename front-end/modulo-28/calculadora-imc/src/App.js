import React, { useState } from 'react';
import './App.css';

function App() {
  const [altura, setAltura] = useState('');
  const [peso, setPeso] = useState('');
  const [imc, setImc] = useState(null);
  const [classificacao, setClassificacao] = useState('');

  // Função para calcular o IMC
  const calcularIMC = () => {
    if (altura > 0 && peso > 0) {
      const resultado = peso / (altura * altura);
      setImc(resultado.toFixed(2));

      // Classificação de acordo com o IMC
      if (resultado < 18.5) {
        setClassificacao('Abaixo do peso');
      } else if (resultado >= 18.5 && resultado < 24.9) {
        setClassificacao('Peso normal');
      } else if (resultado >= 25 && resultado < 29.9) {
        setClassificacao('Sobrepeso');
      } else if (resultado >= 30) {
        setClassificacao('Obesidade');
      }
    } else {
      setImc(null);
      setClassificacao('');
    }
  };

  return (
    <div className="App">
      <h1>Calculadora de IMC</h1>
      
      <div className="form">
        <div>
          <label>Altura (em metros): </label>
          <input 
            type="number" 
            value={altura} 
            onChange={(e) => setAltura(e.target.value)} 
            placeholder="Ex: 1.75"
          />
        </div>

        <div>
          <label>Peso (em kg): </label>
          <input 
            type="number" 
            value={peso} 
            onChange={(e) => setPeso(e.target.value)} 
            placeholder="Ex: 70"
          />
        </div>

        <button onClick={calcularIMC}>Calcular IMC</button>
      </div>

      {imc && (
        <div className="resultado">
          <h2>IMC: {imc}</h2>
          <p>Classificação: {classificacao}</p>
        </div>
      )}
    </div>
  );
}

export default App;
