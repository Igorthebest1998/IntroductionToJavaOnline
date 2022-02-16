package com.epam.javaIntro;

import java.util.List;

public class Sentence {
	
	private String sentence;
	
	public Sentence(String sentence) {
		this.sentence = sentence;
		}
	
	public Sentence(List<Word> words, char endSymbol) {
		sentence = "";
		for(int i = 0; i < words.size(); i++) {
			sentence += words.get(i).getWord();
			if (i != words.size() - 1) {
				 sentence += " ";
			} else {
				sentence += endSymbol;
			}
		}
	}
	
	public Sentence() {
		super();
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
}
