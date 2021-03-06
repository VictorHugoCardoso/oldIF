/* Este exemplo contém:
	-IF
	-Descoberta do tamanho do vetor
	Conversão de tipos (casting)
	Operadores lóigicos e relacionais
*/

class Exemplo4 {
	public static void main(String[] args) {
		Integer val1, val2, res;
		OperacoesMatematicas opMat = new OperacoesMatematicas();
		
		if (args.length < 2) {
			System.out.println("O programa precisa de 2 argumentos!");
			System.exit(0);
		}
		
		
		val1 = Integer.parseInt(args[0]);
		val2 = Integer.parseInt(args[0]);
		
		System.out.println("Primeiro IF:");
		if(val1>5){
			res = opMat.multiplicar (val1, val2);
			System.out.println (val1 + "X" + val2 + "=" + res);
		}else{
			res = opMat.somar(val1, val2);
			System.out.println(val1 + "+" + val2 + "=" + res);
		}	
			
		// && -> AND ; || -> OR ; != -> NOT
		System.out.println("Segundo IF:");
		if((val1 > val2) && (val2 != 0)){
			res = opMat.subtrair(val1, val2);
			System.out.println(val1 + "-" + val2 + "=" + res);
		}else if ((val1 ==val2) || (val1 > 10)) {
			res = opMat.multiplicar(val1, val2);
			System.out.println (val1 + "X" + val2 + "=" + res);
		} else {
			System.out.println ("Nenhum criterio atendido");
		}
	}
}
		
