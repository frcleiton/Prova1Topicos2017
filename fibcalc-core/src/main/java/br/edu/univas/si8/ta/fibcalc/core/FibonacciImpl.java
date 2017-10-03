package br.edu.univas.si8.ta.fibcalc.core;

import br.edu.univas.si8.ta.fibcalc.api.FibService;
import br.edu.univas.si8.ta.fibcalc.api.Result;
import br.edu.univas.si8.ta.fibcalc.lib.CalculadoraFibonacci;

public class FibonacciImpl implements FibService{

	@Override
	public String fib(int num) {
		
		return String.format("<h1>Hello %s!!!</h1>", num);
		
		//int resultado = CalculadoraFibonacci.fibonacci(num);
		//return new Result().withNumber(num).withFibonacci(resultado);
		
	}
}
