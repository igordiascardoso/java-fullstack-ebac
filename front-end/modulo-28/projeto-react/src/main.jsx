import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import {PI, GTM_BRASIL} from './teste'
import nomes from './nomes'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    {nomes}
    <App />
  </StrictMode>,
)
