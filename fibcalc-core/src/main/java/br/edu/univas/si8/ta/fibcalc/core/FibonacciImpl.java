package br.edu.univas.si8.ta.fibcalc.core;

import br.edu.univas.si8.ta.fibcalc.api.FibService;
import br.edu.univas.si8.ta.fibcalc.api.Result;
import br.edu.univas.si8.ta.fibcalc.lib.CalculadoraFibonacci;

public class FibonacciImpl implements FibService{

	@Override
	public Result fib(int num) {
		
		int resultado = CalculadoraFibonacci.fibonacci(num);
		return new Result().withNumber(num).withFibonacci(resultado);
		
	}
}
