new Vue({
    el: '#app',
    data: {
      num1: 0,
      num2: 0,
      operation: '+'
    },
    computed: {
      result() {
        switch (this.operation) {
          case '+':
            return this.num1 + this.num2;
          case '-':
            return this.num1 - this.num2;
          case '*':
            return this.num1 * this.num2;
          case '/':
            return this.num2 !== 0 ? this.num1 / this.num2 : 'Erro: Divisão por zero';
          default:
            return 0;
        }
      }
    }
  });
  