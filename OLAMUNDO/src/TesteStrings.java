public class TesteStrings {
	public static void main(String[] args) {
		// declaração (s vale null)
		String s;
		// inicialização
		s = "Ana dos Santos";
		// declaração e inicialização
		String s2 = "Roberto Padilha";

		System.out.println("Igual: " + s.equals("Ana dos Santos"));		
        System.out.println("Tamanho de s: " + s.length());
		System.out.println("Caracter da posição 5 de s2: " + s.charAt(4));
		}
}
