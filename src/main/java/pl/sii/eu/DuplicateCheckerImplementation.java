package pl.sii.eu;

public class DuplicateCheckerImplementation implements DuplicateChecker {

    @Override
    public boolean hasDuplicateCharacters(String input) {
        boolean hasDuplicateChar = false;
        if(input.isEmpty()||input.length()==1) return hasDuplicateChar;

        for (int i = 0; i < input.length()-1 ; i++) {
            if(input.substring(i)=="\\s") continue;
            char current = input.charAt(i), next = input.charAt(i+1);
            if (current==next) hasDuplicateChar = true;
        }
        return hasDuplicateChar;
    }
}
