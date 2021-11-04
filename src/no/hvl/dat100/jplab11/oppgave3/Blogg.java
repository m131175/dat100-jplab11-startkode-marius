package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
	
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {
		
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		
		return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < this.nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				return i;
			}
		}
		
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		for (int i = 0; i < this.nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				return true;
			}
		}
		
		return false;
	}

	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (!finnes(innlegg)) {
			for (int i = 0; i < this.innleggtabell.length; i++) {
				if (innleggtabell[i] == null) {
					innleggtabell[i] = innlegg;
					nesteledig++;
					return true;
				}
			}
		}
		
		return false;
	}
	
	public String toString() {
		
		String returnString = "";
		for (Innlegg innlegg: innleggtabell) {
			returnString += innlegg.toString();
		}
		
		return getAntall() + "\n" + returnString;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}