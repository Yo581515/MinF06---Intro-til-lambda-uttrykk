package no.hvl.lph.dat108.f06;

public class OppgaveBetingetUtskrift {

	private static void betingetUtskrift(String s, Betingelse betngelse) {
		if (betngelse.erOppflt(s)) {
			System.out.println(s+"\n");
		}
	}

	@FunctionalInterface
	interface Betingelse {
		boolean erOppflt(String text);
	}

	public static void main(String[] args) {

		String x = "Xyyyy";
		System.out.println("starter med X?");
		betingetUtskrift(x, j -> j.startsWith("X"));
	
		System.out.println("lengere enn 3?");
		betingetUtskrift(x, (j) -> j.length() > 4);

	}

}
