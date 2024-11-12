<template>
  <div class="calculator">
    <h1>Calculadora Aritmética</h1>
    <div class="inputs">
      <input
        type="number"
        v-model.number="numero1"
        placeholder="Digite o primeiro número"
      />
      <select v-model="operacao">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
      </select>
      <input
        type="number"
        v-model.number="numero2"
        placeholder="Digite o segundo número"
      />
    </div>
    <h2>Resultado: {{ resultado }}</h2>
  </div>
</template>

<script>
import { ref, computed } from 'vue';

export default {
  setup() {
    const numero1 = ref(0);
    const numero2 = ref(0);
    const operacao = ref('+');

    const resultado = computed(() => {
      switch (operacao.value) {
        case '+':
          return numero1.value + numero2.value;
        case '-':
          return numero1.value - numero2.value;
        case '*':
          return numero1.value * numero2.value;
        case '/':
          return numero2.value !== 0 ? numero1.value / numero2.value : 'Divisão por zero';
        default:
          return 0;
      }
    });

    return {
      numero1,
      numero2,
      operacao,
      resultado
    };
  }
};
</script>

<style scoped>
.calculator {
  max-width: 400px;
  margin: 50px auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 10px;
  text-align: center;
}
.inputs {
  display: flex;
  gap: 10px;
  justify-content: center;
  margin-bottom: 20px;
}
input,
select {
  width: 100px;
  padding: 8px;
  font-size: 1em;
}
h1, h2 {
  color: #333;
}
</style>
