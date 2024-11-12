import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const nome = "Igor"

  function retornaNome(){
    return nome
  }

  return(
    <>
    <h1>Olá, {retornaNome()}</h1>
    <h2>Subtitulo</h2>
    </>
  )
}

export default App
