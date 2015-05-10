package controller;

import gameplay.Card;
import gameplay.SuitName;

import java.util.List;

public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
	    super();
	    
	    this.name = name;
	    this.human = true;
	}

	@Override
	public Card action(List<Card> legalActions) {
		// To be implemented.
		return null;
	}

	@Override
	public SuitName hokmDet(List<Card> firsFive) {
		// To be implemented.
		return null;
	}

}
