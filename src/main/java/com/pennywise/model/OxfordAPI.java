package com.pennywise.model;

public class OxfordAPI {

    private String word;
    private String definition;

    public OxfordAPI() {}

    public OxfordAPI(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((definition == null) ? 0 : definition.hashCode());
        result = prime * result + ((word == null) ? 0 : word.hashCode());
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
        OxfordAPI other = (OxfordAPI) obj;
        if (definition == null) {
            if (other.definition != null)
                return false;
        } else if (!definition.equals(other.definition))
            return false;
        if (word == null) {
            if (other.word != null)
                return false;
        } else if (!word.equals(other.word))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OxfordAPI [definition=" + definition + ", word=" + word + "]";
    }
}